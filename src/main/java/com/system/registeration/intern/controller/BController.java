package com.system.registeration.intern.controller;

import com.system.registeration.intern.bean.Activity;
import com.system.registeration.intern.bean.BaseRespVo;
import com.system.registeration.intern.service.ActivityService;
import com.system.registeration.intern.service.UserService;
import com.system.registeration.intern.shiro.MallToken;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BController {
    @Autowired
    ActivityService activityService;
    @Autowired
    UserService userService;

    /**
     * B端用户在网页发布活动
     *
     * @param activity
     * @return
     */
    @RequestMapping("B/activity/create")
    public BaseRespVo BcreateActivity(@RequestBody Activity activity) {
        return activityService.createActivity(activity);
    }

    /**
     * B端用户修改自己的活动
     *
     * @param activity
     * @return
     */
    @RequestMapping("B/activity/update")
    public BaseRespVo BupdateActivity(@RequestBody Activity activity) {
        return activityService.updateActivity(activity);
    }

    /* *
     * B端用户查看自己发布的活动
     */
    @RequestMapping("B/activity/showBActivity")
    public BaseRespVo showBActivityList() {
        //TODO id
        //Integer id = 1;
        Subject subject = SecurityUtils.getSubject();
        Object principal = subject.getPrincipal();
        MallToken token=(MallToken) principal;
        String userName=token.getUsername();
        Integer userId=userService.selectUserIdByUserName(userName);
        return activityService.showBActivity(userId);
    }
    /**
     * 点击菜单“活动”进入活动管理页面
     * 基本流程：一 活动”列表，每个活动呈现信息为
     * 1活动名称  2 活动创建者  3 活动地点  4活动时间
     * 5活动状态 6活动人数  7可进行操作
     * ---
     * 二 可“操作”部分
     * 1活动预览，可查看该活动发布时面向c端用户展示的页面
     * 2活动报名情况，B端用户可查看报名C端用户如一卡通号、姓名等具体信息。
     * 3编辑（可以对活动时间，详情，名称进行修改）
     * 4活动链接、二维码
     */
    /**
     *
     */
    /**
     * B 端用户查看活动报名情况
     */
    @RequestMapping("B/activity/checkActivity")
    public BaseRespVo BcheckActivity(Integer activityId) {
        //TODO userID
        //Integer userId = 1;
        Subject subject = SecurityUtils.getSubject();
        Object principal = subject.getPrincipal();
        MallToken token=(MallToken) principal;
        String userName=token.getUsername();
        Integer userId=userService.selectUserIdByUserName(userName);
        return activityService.selectSignUpUser(userId,activityId);
    }
    /**
     * P端用户查看本平台所有活动
     */
    @RequestMapping("P/activity/checkActivity")
    public BaseRespVo PcheckActivity() {
        //TODO userID
//        Integer userId = 1;
        return activityService.selectPActivity();
    }
}
