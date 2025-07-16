package com.company.medical.mapper;

import com.company.medical.model.PermissionModel;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PermissionMapper {
    List<PermissionModel> getPermission(String roleName);

}