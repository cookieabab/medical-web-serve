package com.qst.medical.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.qst.medical.domain.superdomain.SuperDomain;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
public class CompanyPolicy extends SuperDomain {
    private Long id;//医药公司政策id
    private String title;//医药公司政策标题

    private String message;//医药公司政策内容
    private Long companyId;//医药公司id
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createTime;//创建时间
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date updateTime;//发布时间

    //省略get/set方法
}