package com.qst.medical.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
public class DrugCompany {
    private Long companyId;//公司id
    private String companyName;//公司名
    private String companyPhone;//公司电话
    private Date updatetime;//更新时间
    private Date createtime;
}
