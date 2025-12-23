package com.wms.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wms.common.QueryPageParam;
import com.wms.common.Result;
import com.wms.entity.GoodsType;
import com.wms.service.GoodsTypeService;
import io.micrometer.common.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wcx
 * @since 2025-12-22
 */
@RestController
@RequestMapping("/goodsType")
public class GoodsTypeController {

    @Autowired
    private GoodsTypeService goodsTypeService;

    // 新增
    @PostMapping("/save")
    public Result save(@RequestBody GoodsType goodsType) {
        return goodsTypeService.save(goodsType) ? Result.success() : Result.fail();
    }

    // 更新
    @PostMapping("/update")
    public Result update(@RequestBody GoodsType goodsType) {
        return goodsTypeService.updateById(goodsType) ? Result.success() : Result.fail();
    }

    // 修改
    @PutMapping("/mod")
    public boolean mod(@RequestBody GoodsType goodsType) {
        return goodsTypeService.updateById(goodsType);
    }

    @DeleteMapping("/del")
    public Result del(@RequestParam String id) {
        return goodsTypeService.removeById(id) ? Result.success() : Result.fail();
    }

    @PostMapping("/listPage")
    public Result listPage(@RequestBody QueryPageParam query) {
        HashMap param = query.getParam();
        String name = (String) param.get("name");

        Page<GoodsType> page = new Page();
        page.setCurrent(query.getPageNum());
        page.setSize(query.getPageSize());

        LambdaQueryWrapper<GoodsType> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        if (StringUtils.isNotBlank(name) && !"null".equals(name)) {
            lambdaQueryWrapper.like(GoodsType::getName, name);
        }

        IPage result = goodsTypeService.pageCC(page, lambdaQueryWrapper);

        return Result.success(result.getRecords(), result.getTotal());
    }

    @GetMapping("/list")
    public Result list() {
        List list = goodsTypeService.list();
        return Result.success(list);
    }
}
