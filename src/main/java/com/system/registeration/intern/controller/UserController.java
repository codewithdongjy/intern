package com.system.registeration.intern.controller;

import com.system.registeration.intern.bean.BaseRespVo;
import com.system.registeration.intern.bean.User;
import com.system.registeration.intern.service.UserService;
import com.system.registeration.intern.shiro.MallToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;


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
        public BaseRespVo Login(@RequestBody User map) {
           /* BaseRespVo baseRespVo = userService.login(user);
            return baseRespVo;*/
            String username =(String) map.getUsername();
            String password =(String) map.getPassword();
            MallToken token = new MallToken(username, password, "admin");


            //先获得subject对象，直接通过SecurityUtils
            Subject subject = SecurityUtils.getSubject();
        /* 认证失败后的处理
           login这里，如果密码不正确，是会抛出异常的！！！！！！
        */
            try {
                //subject.login(token) 会把token送到CustomRealm那里
                subject.login(token);
            } catch (AuthenticationException e) {
                e.printStackTrace();
                BaseRespVo objectBaseRespVo = new BaseRespVo();
                objectBaseRespVo.setMsg("认证失败，请重新登录");
                return objectBaseRespVo;
            }

            //维护同一个session 在业务逻辑代码中的实现就是 login方法返回ResponVo中的Data为SessionId
            Serializable id = subject.getSession().getId();
            BaseRespVo objectBaseRespVo = new BaseRespVo();
            objectBaseRespVo.setData(id);
   return objectBaseRespVo;
    }
}
