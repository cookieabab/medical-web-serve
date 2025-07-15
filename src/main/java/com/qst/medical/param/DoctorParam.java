package com.qst.medical.param;

import com.qst.medical.domain.Doctor;
import lombok.Data;

@Data
public class DoctorParam extends Doctor {
    private String pwd;
}
