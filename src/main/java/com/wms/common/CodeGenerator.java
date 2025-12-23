package com.wms.common;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.querys.MySqlQuery;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.sql.SQLSyntaxErrorException;
import java.sql.SQLNonTransientConnectionException;

public class CodeGenerator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入要生成的表名（多个用逗号分隔）：");
        String input = scanner.nextLine();
        List<String> tables = Arrays.stream(input.split(","))
                .map(String::trim)
                .filter(name -> !name.isEmpty())
                .collect(Collectors.toList());
        if (tables.isEmpty()) {
            System.out.println("未提供有效表名，已退出。");
            return;
        }

        String projectPath = System.getProperty("user.dir");

        try {
            FastAutoGenerator.create(
                            "jdbc:mysql://127.0.0.1:3306/wms?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai",
                            "root",
                            "Hut24680")
                    .dataSourceConfig(builder -> builder.dbQuery(new MySqlQuery()))
                    .globalConfig(builder -> builder
                            .author("wcx")
                            .disableOpenDir()
                            .enableSwagger()
                            .dateType(DateType.ONLY_DATE)
                            .commentDate("yyyy-MM-dd")
                            .outputDir(projectPath + "/src/main/java"))
                    .packageConfig(builder -> builder
                            .parent("com.wms")
                            .entity("entity")
                            .service("service")
                            .serviceImpl("service.impl")
                            .mapper("mapper")
                            .controller("controller")
                            .pathInfo(Collections.singletonMap(OutputFile.xml, projectPath + "/src/main/resources/mapper")))
                    .strategyConfig(builder -> {
                        builder.addInclude(tables);
                        builder.entityBuilder().enableLombok().enableTableFieldAnnotation();
                        builder.mapperBuilder().enableMapperAnnotation().enableBaseResultMap().enableBaseColumnList();
                        builder.serviceBuilder().formatServiceFileName("%sService").formatServiceImplFileName("%sServiceImpl");
                        builder.controllerBuilder().enableRestStyle();
                    })
                    .templateEngine(new FreemarkerTemplateEngine())
                    .execute();

            System.out.println("代码生成完成，表名：" + String.join(", ", tables));
        } catch (Exception e) {
            String friendlyMessage = buildFriendlyMessage(e);
            System.out.println(friendlyMessage);
            e.printStackTrace();
        }
    }

    private static String buildFriendlyMessage(Throwable error) {
        if (findCause(error, SQLNonTransientConnectionException.class) != null) {
            return "代码生成失败：数据库连接失败，请检查地址、端口和账号密码。";
        }
        if (findCause(error, SQLSyntaxErrorException.class) != null) {
            return "代码生成失败：表名不存在或SQL语法错误，请检查输入的表名。";
        }
        String message = error.getMessage();
        if (message != null) {
            String lower = message.toLowerCase();
            if (lower.contains("access denied")) {
                return "代码生成失败：数据库账号或密码错误，请检查连接配置。";
            }
            if (lower.contains("unknown database")) {
                return "代码生成失败：数据库不存在，请检查库名配置。";
            }
        }
        return "代码生成失败，请检查数据库连接和表名配置。";
    }

    private static <T extends Throwable> T findCause(Throwable error, Class<T> type) {
        Throwable current = error;
        while (current != null) {
            if (type.isInstance(current)) {
                return type.cast(current);
            }
            current = current.getCause();
        }
        return null;
    }
}
