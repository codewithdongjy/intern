package com.system.registeration.intern.mapper;


import com.system.registeration.intern.bean.Permission;
import com.system.registeration.intern.bean.PermissionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PermissionMapper {
    long countByExample(PermissionExample example);

    int deleteByExample(PermissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Permission record);

    int insertSelective(Permission record);

    List<Permission> selectByExample(PermissionExample example);

    Permission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Permission record, @Param("example") PermissionExample example);

    int updateByExample(@Param("record") Permission record, @Param("example") PermissionExample example);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);

    List<String> allPermission();

    List<String> mallPermission();

    List<String> adPermission();

    List<String> queryPermissionsByIds(List<Integer> roleermissionsId);

    Integer insertPermissionsByRoleId(@Param("permissions") List<String> permissions, @Param("roleId") Integer roleId);


    List<String> selectPermissionList(Integer roleId);
}