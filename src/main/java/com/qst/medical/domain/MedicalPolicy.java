package com.qst.medical.domain;

import com.qst.medical.domain.superdomain.SuperDomain;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Pattern;

@Data
public class MedicalPolicy extends SuperDomain {

    @Pattern(regexp = "(^[0-9]*)", message = "编号只能为数字")
    private Long id;//政策id
    private String title;//政策标题
    private String message;//政策消息
    private Long cityId;//政策的对应城市

    private String createTime;//创建时间
    private String updateTime;//更新时间兼发布时间

//省略get/set方法

}