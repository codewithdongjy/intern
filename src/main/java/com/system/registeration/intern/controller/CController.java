package com.system.registeration.intern.controller;

import com.system.registeration.intern.bean.*;
import com.system.registeration.intern.service.CService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

//C端
@RestController
public class CController {

    @Autowired
    CService cService;
    /**
     * 1.活动列表页面
     * 用户通过点击“活动”进入活动列表页面，默认显示用户所有活动，
     * 也可通过点击切换分类活动查看，所有活动页面默认按时间由近及远排序。
     * 我的活动列表，每个活动呈现信息为
     * 1 活动名称 2 发布者3 活动地点 4活动开始时间  5活动状态
     */
    //TODO: userId 的获取
    @RequestMapping("C/activity/showdefaultactivities")
    public BaseRespVo getCUserActivities() {
        //TODO userId
        Integer userId=1;
        List<ActivitySelectedByC> activityList=cService.getCActivities(userId);
        /*List<Map> activityList = new LinkedList<>();
        Map<String, ActivityShowInC> activityMap = new HashMap();*/
        BaseRespVo baseRespVo = new BaseRespVo();
        baseRespVo.setErrno(0);
        baseRespVo.setMsg("查看列表成功");
        baseRespVo.setData(activityList);
        return baseRespVo;
    }
    /**
     * C端 活动详情页面
     * 点击活动列表指定区域即可进入，页面信息与活动报名详情页相同
     */
    //TODO: userId 的获取
    @RequestMapping("C/activity/showactivitiesdetails")
    public BaseRespVo showDetails(Integer activityId){
        Integer userId=1;
        return cService.getActivityDetails(activityId);

    }


    /**
     * C端用户报名活动
     * @param activityId
     * @return
     */
    @RequestMapping("C/activity/usersignup")
    public BaseRespVo userSignUp(Integer activityId){
        //TODO id通过权限控制获得
        Integer userId=1;

        return cService.signUpActivity(activityId,userId);

    }
}
