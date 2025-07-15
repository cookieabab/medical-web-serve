package com.qst.medical.model;

import com.qst.medical.domain.City;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class CityModel extends City {

    private String province;//省份
    private String city;//市


}