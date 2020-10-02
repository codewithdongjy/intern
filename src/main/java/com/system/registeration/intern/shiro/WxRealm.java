package com.system.registeration.intern.shiro;

import com.system.registeration.intern.mapper.UserMapper;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;


/*
*  String credential =  strings.size() >= 1?strings.get(0):null;
*  要求用户的username唯一
*
* */
@Component
public class WxRealm extends AuthorizingRealm {


    @Resource
    UserMapper userMapper;

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        MallToken token = (MallToken) authenticationToken;

        String username = token.getUsername();

        List<String> strings = userMapper.selectPasswordByName(username);
        String credential =  strings.size() >= 1?strings.get(0):null;
        //数据库中查询出来的密码，它怎么不认证呢？ 认证过程被shiro封装了，在subject.login()中
        //参数中，this.getName() 固定写法
        //第一个参数，这里放入的是什么，业务逻辑代码中subject.getPrincipal()拿到的就是什么
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(token, credential, this.getName());
        return authenticationInfo;
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        return null;
    }







}
