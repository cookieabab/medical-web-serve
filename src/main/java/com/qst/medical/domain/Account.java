package com.qst.medical.domain;

import com.qst.medical.domain.superdomain.SuperDomain;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

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
