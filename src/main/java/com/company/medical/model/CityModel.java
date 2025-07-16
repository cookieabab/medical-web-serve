package com.company.medical.model;

import com.company.medical.domain.City;
import lombok.Data;

@Data
public class CityModel extends City {

    private String province;//省份
    private String city;//市


}