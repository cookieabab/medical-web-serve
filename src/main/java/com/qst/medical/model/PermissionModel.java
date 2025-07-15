package com.qst.medical.model;

import com.qst.medical.domain.Permission;
import lombok.Data;

@Data
public class PermissionModel extends Permission {
    private MetaModel meta;//存放meta封装的各个属性，icon、title等
}