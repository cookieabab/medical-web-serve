package com.company.medical.mapper;

import com.company.medical.entity.MaterialEntity;
import com.company.medical.model.MaterialModel;
import com.company.medical.param.MaterialParam;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MaterialMapper {
    /*查询所有的材料*/
    List<MaterialModel> getAllMaterial(MaterialParam param);
    /*新增材料*/
    int saveMaterial(MaterialEntity entity);
    /*更新材料*/
    int updateMaterial(MaterialEntity entity);
    /*删除材料*/
    int deleteMaterial(Long id);
}