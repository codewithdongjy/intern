package com.system.registeration.intern.service;

import com.system.registeration.intern.bean.BaseRespVo;
import com.system.registeration.intern.bean.User;

import java.util.List;

public interface UserService {
    BaseRespVo register(User user);

    BaseRespVo login(User user);

    List<String> selectPermissionByUsername(String username);

    Integer selectUserIdByUserName(String userName);
}
