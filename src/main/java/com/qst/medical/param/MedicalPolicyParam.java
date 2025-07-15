package com.qst.medical.param;

import com.qst.medical.domain.MedicalPolicy;
import com.qst.medical.model.CityModel;
import lombok.Data;

@Data
public class MedicalPolicyParam extends MedicalPolicy {
    private CityModel cityModel;
}
