package com.company.medical.entity;

import com.company.medical.domain.Sale;
import lombok.Data;

@Data
public class SaleEntity extends Sale {

    private Long total;//插入成功后返回的总记录数

}