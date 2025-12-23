package com.wms.entity;

import lombok.Data;

@Data
public class RecordRes extends Record {

    private String username;
    private String adminName;
    private String goodsName;
    private String storageName;
    private String goodsTypeName;
}
