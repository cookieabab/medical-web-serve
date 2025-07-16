package com.company.medical.mapper;

import com.company.medical.domain.City;
import com.company.medical.entity.CityEntity;
import com.company.medical.model.CityModel;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CityMapper {
    /*获取所有城市信息,name不为空则模糊查询*/
    List<CityModel> getAllCity(String name);

    /*根据id查找一个城市信息*/
    City getCityById(Integer id);

    /*添加一个城市信息*/
    int saveCity(CityEntity city);

    /*根据id删除城市信息*/
    int deleteCityById(Integer id);

    /*查询城市是否存在*/
    int checkCityByName(Integer number);

}
