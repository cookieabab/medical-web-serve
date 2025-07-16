package com.company.medical.model;

import com.company.medical.domain.Doctor;
import lombok.Data;

@Data
public class DoctorModel extends Doctor {
    private String treatType;//诊治类型
    private String doctorLevel;//医师级别
}
