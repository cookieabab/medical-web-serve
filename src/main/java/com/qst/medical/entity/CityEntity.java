package com.qst.medical.entity;

import com.qst.medical.domain.City;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class CityEntity extends City {

    private Long total;

}
