package com.system.registeration.intern.service;

import com.system.registeration.intern.bean.BaseRespVo;
import com.system.registeration.intern.bean.User;

public interface UserService {
    BaseRespVo register(User user);

    BaseRespVo login(User user);

}
