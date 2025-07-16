package com.company.medical.domain;

import com.company.medical.domain.superdomain.SuperDomain;
import lombok.Data;

import java.util.Date;

@Data
public class Account  extends SuperDomain {
    private Long id;
    private String uname;
    private String pwd;
    private String phoneNumber;
    private String utype;
    private Date updatetime;
    private Date createtime;
    private String realname;



}
