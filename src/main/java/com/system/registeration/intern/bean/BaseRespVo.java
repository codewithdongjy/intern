package com.system.registeration.intern.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseRespVo {
    Integer errno;
    Object data;
    String msg;


    public static BaseRespVo ok(){
        BaseRespVo baseRespVo = new BaseRespVo();
        baseRespVo.setMsg("成功");
        baseRespVo.setErrno(0);
        return baseRespVo;
    }
    public static BaseRespVo ok(Object data){
        BaseRespVo baseRespVo = ok();
        baseRespVo.setData(data);
        return baseRespVo;
    }
}
