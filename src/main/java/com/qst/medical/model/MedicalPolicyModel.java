package com.qst.medical.model;

import com.qst.medical.domain.MedicalPolicy;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class MedicalPolicyModel extends MedicalPolicy {

    private CityModel cityModel;//医保政策包含的所属城市


}