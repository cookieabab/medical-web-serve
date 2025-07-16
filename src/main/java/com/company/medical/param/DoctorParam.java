package com.company.medical.param;

import com.company.medical.domain.Doctor;
import lombok.Data;

@Data
public class DoctorParam extends Doctor {
    private String pwd;
}
