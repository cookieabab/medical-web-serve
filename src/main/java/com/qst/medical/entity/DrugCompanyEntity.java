package com.qst.medical.entity;

import com.qst.medical.domain.DrugCompany;
import lombok.Data;
import lombok.Getter;

@Data

public class DrugCompanyEntity extends DrugCompany {

    private Long total;//插入存储返回插入后的总记录数
    public void setTotal(Long total) {
        this.total = total;
    }

}