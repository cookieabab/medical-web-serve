package com.company.medical.model;

import com.company.medical.domain.MedicalPolicy;
import lombok.Data;

@Data
public class MedicalPolicyModel extends MedicalPolicy {

    private CityModel cityModel;//医保政策包含的所属城市


}