package com.system.registeration.intern.shiro;

import com.cskaoyan.csmall.bean.BaseRespVo;
import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * exceptionHandler ---处理  返回值为Json的handler  的异常处理器组件
 *
 *
 * 根据异常的不同做个性化的处理 → @ExceptionHandler 注解加在方法上
 * 根据@ExceptionHandler（）中的 异常类型，分发到不同的方法中进行处理
 */


// 对于授权异常（不满足controller中needperm()方法的@RequiresPermissions注解）的两种处理方式
// 第二种方法 @ControllerAdvice + @ExceptionHandler(异常的Class对象)

@ControllerAdvice
public class ExceptionControllerAdvise {


    @ExceptionHandler(AuthorizationException.class)
    @ResponseBody
    public BaseRespVo<Object> handlerAuthorException(Exception e){
        BaseRespVo<Object> objectBaseRespVo = new BaseRespVo<>();
        objectBaseRespVo.setErrmsg("权限受限");
        return objectBaseRespVo;//返回的是JsonString
    }
}
