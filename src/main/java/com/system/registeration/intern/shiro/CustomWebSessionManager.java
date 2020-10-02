package com.system.registeration.intern.shiro;

import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;

public class CustomWebSessionManager extends DefaultWebSessionManager {
    @Override
    //根据请求来源不同，从请求头的X-cskaoyanmall-admin/wx-token属性获得SessionId
    protected Serializable getSessionId(ServletRequest request1, ServletResponse response) {
        HttpServletRequest request = (HttpServletRequest) request1;
        String header = request.getHeader("X-cskaoyan-mall-Admin-Token");
        if (header != null && !"".equals(header)){
            return header;
        }
        String header2 = request.getHeader("X-cskaoyan-mall-Admin-Token");
        if (header2 != null && !"".equals(header2)){
            return header2;
        }
        //如果是第一次访问，就生成一个sessionid
        return super.getSessionId(request, response);
    }
}
