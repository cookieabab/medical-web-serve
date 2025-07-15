package com.qst.medical.entity;

import com.qst.medical.domain.Sale;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class SaleEntity extends Sale {

    private Long total;//插入成功后返回的总记录数

}