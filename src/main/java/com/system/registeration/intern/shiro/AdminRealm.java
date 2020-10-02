package com.system.registeration.intern.shiro;


import com.system.registeration.intern.mapper.UserMapper;
import com.system.registeration.intern.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/*
* 不知道StringArray2StringTypeHandler，可不可以从数据库中拿出List<String>？？？？？
* List<String> permissions = userMapper.selectPermissionByUsername(token.getUsername());
*
*
* 这里代码不够完善，需要数据库中，用户名唯一
*
* */


@Component
public class AdminRealm extends AuthorizingRealm {


    @Resource
    UserMapper adminMapper;

    @Autowired
    UserService adminService;

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        MallToken token = (MallToken) authenticationToken;

        String username = token.getUsername();

        List<String> strings = adminMapper.selectPasswordByName(username);
        String credential =  strings.size() >= 1?strings.get(0):null;
        //数据库中查询出来的密码，它怎么不认证呢？ 认证过程被shiro封装了，在subject.login()中
        //参数中，this.getName() 固定写法
        //第一个参数，这里放入的是什么，业务逻辑代码中subject.getPrincipal()拿到的就是什么
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(token, credential, this.getName());
        return authenticationInfo;
    }
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //PrincipalCollection.getPrimaryPrincipal()得到的 是 上面的new SimpleAuthenticationInfo的第一个参数username
        MallToken token = (MallToken) principalCollection.getPrimaryPrincipal();

        //从数据库中查询该用户的权限
        List<String> permissions = adminService.selectPermissionByUsername(token.getUsername());
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        authorizationInfo.addStringPermissions(permissions);

        return authorizationInfo;
    }


}
