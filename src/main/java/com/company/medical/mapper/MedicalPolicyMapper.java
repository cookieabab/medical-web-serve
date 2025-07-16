package com.company.medical.mapper;

import com.company.medical.entity.MedicalPolicyEntity;

import com.company.medical.model.MedicalPolicyModel;
import com.company.medical.param.MedicalPolicyParam;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface MedicalPolicyMapper {
    List<MedicalPolicyModel> getAllPolicy(MedicalPolicyParam param);

    /*新增医保政策*/
    int saveMedicalPolicy(MedicalPolicyEntity param);

    /*更新医保政策*/
    int updateMedicalPolicy(MedicalPolicyEntity param);

    /*根据id删除医保政策*/
    int deleteMedicalPolicy(Long id);
    /*
        根据城市删除医保政策
    */
    int deleteByCity(Integer city);
}
