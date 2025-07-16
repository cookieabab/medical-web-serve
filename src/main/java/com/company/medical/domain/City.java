package com.company.medical.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
public class City {
    private Long cityId;//城市id

    private Integer cityNumber;//城市编号
    private Date createtime;//创建时间
    private Date updatetime;//修改时间
    //省略get/set方法
}