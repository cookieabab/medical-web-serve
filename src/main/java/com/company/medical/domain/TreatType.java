package com.company.medical.domain;

import com.company.medical.domain.superdomain.SuperDomain;
import lombok.Data;

@Data
public class TreatType extends SuperDomain {

    private Long id;//诊治类型id
    private String name;
}
