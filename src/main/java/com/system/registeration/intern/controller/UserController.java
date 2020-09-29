package com.system.registeration.intern.controller;

import com.system.registeration.intern.bean.BaseRespVo;
import com.system.registeration.intern.bean.User;
import com.system.registeration.intern.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 注册
     *
     * @return
     */
    @RequestMapping("api/user/register")
    public BaseRespVo Register(@RequestBody User user) {
        BaseRespVo baseRespVo = userService.register(user);
        return baseRespVo;
    }
        /**
         * 登录
         */
        @RequestMapping("api/user/login")
        public BaseRespVo Login(@RequestBody User user) {
            BaseRespVo baseRespVo = userService.login(user);
            return baseRespVo;
    }
}
