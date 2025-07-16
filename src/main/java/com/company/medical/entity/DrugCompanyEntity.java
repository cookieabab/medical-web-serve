package com.company.medical.entity;

import com.company.medical.domain.DrugCompany;
import lombok.Data;

@Data

public class DrugCompanyEntity extends DrugCompany {

    private Long total;//插入存储返回插入后的总记录数
    public void setTotal(Long total) {
        this.total = total;
    }

}