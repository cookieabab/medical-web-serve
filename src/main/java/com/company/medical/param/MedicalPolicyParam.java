package com.company.medical.param;

import com.company.medical.domain.MedicalPolicy;
import com.company.medical.model.CityModel;
import lombok.Data;

@Data
public class MedicalPolicyParam extends MedicalPolicy {
    private CityModel cityModel;
}
