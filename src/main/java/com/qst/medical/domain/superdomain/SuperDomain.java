package com.qst.medical.domain.superdomain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class SuperDomain implements Serializable {

    private Long total;
    @JsonIgnore
    private Integer pn=1;
    @JsonIgnore
    private Integer size =Integer.MAX_VALUE;
    @JsonIgnore
    private String keyword;//查询关键字


    public SuperDomain() {
    }

    public SuperDomain(Long total, Integer pn, Integer size, String keyword) {
        this.total = total;
        this.pn = pn;
        this.size = size;
        this.keyword = keyword;
    }

}
