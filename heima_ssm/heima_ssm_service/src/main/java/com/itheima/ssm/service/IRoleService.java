package com.itheima.ssm.service;

import com.itheima.ssm.domain.Permission;
import com.itheima.ssm.domain.Role;

import java.util.List;

public interface IRoleService {

    public List<Role> findAll() throws Exception;

    void save(Role role)throws Exception;

    Role findById(int roleId)throws Exception;

    List<Permission> findOtherPermission(int roleId)throws Exception;

    void addPermissionToRole(int roleId, int[] permissionIds)throws Exception;
}
