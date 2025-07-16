package com.company.medical.mapper;

import com.company.medical.entity.DoctorEntity;
import com.company.medical.model.DoctorLevelModel;
import com.company.medical.model.DoctorModel;
import com.company.medical.model.TreatTypeModel;
import com.company.medical.param.DoctorParam;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public  interface DoctorMapper {
    /*获取所有的医师信息*/
    List<DoctorModel> getAllDoctor(DoctorParam param);
    /*获取所有的医师级别*/
    List<DoctorLevelModel> getAllLevel();
    /*获取所有的诊治类型*/
    List<TreatTypeModel> getAllTreatType();
    int saveDoctor(DoctorEntity param);
    int updateDoctor(DoctorEntity param);
    int deleteDoctorById(Long id);
}