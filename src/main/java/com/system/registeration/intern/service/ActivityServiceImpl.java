package com.system.registeration.intern.service;

import com.system.registeration.intern.bean.Activity;
import com.system.registeration.intern.bean.ActivityExample;
import com.system.registeration.intern.bean.BaseRespVo;
import com.system.registeration.intern.bean.UserSelectedByB;
import com.system.registeration.intern.mapper.ActivityMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Service
public class ActivityServiceImpl implements ActivityService {
    /**
     * B端用户在网页发布活动
     */
    @Resource
    ActivityMapper activityMapper;

    /**
     * B端用户查看活动的报名者的信息
     * @param createUserId
     * @param activityId
     * @return
     */
    @Override
    public BaseRespVo selectSignUpUser(Integer createUserId, Integer activityId) {
        List<Integer>idList = activityMapper.selectuserIdBycreateUserIdAndActivityId(createUserId,activityId);
        UserSelectedByB userSelectedByB = new UserSelectedByB();
List<UserSelectedByB> userList=new LinkedList<>();
        for (Integer i:idList
             ) {
            Activity activity = activityMapper.selectByPrimaryKey(i);
            userSelectedByB.setUsername(activity.getCreatedUserName());
            userSelectedByB.setUsername(activity.getActivityName());
            userList.add(userSelectedByB);
        }
        BaseRespVo baseRespVo = new BaseRespVo();
        baseRespVo.setData(userList);
        baseRespVo.setMsg("成功");
        baseRespVo.setErrno(0);

        return baseRespVo ;
    }

    @Override
    public BaseRespVo createActivity(Activity activity) {

        Date date=new Date(System.currentTimeMillis());
        activity.setActivityCreateTime(date);
        activityMapper.insertSelective(activity);
        BaseRespVo returnMsg = new BaseRespVo();
        returnMsg.setErrno(0);
        returnMsg.setMsg("成功");
        returnMsg.setData(activity);
        return returnMsg;
    }

    /**
     * B端用户查看自己发布的活动
     *
     * @return
     */
    @Override
    public BaseRespVo showBActivity(Integer userId) {
        BaseRespVo baseRespVo = new BaseRespVo();
        String userName = activityMapper.selectUserNameByUserId(userId);
        Date date=new Date(System.currentTimeMillis());
        List<Activity> activityList = activityMapper.selectActivityListByUsername(userName);
        for (Activity activity : activityList
        ) {
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat();
            simpleDateFormat.applyPattern("yyyy-MM-dd HH:mm");
            String sysTime = simpleDateFormat.format(date);
            //TODO
            Date date1=activity.getActivityStart();//getSignUpdtart有空指针异常
//            Date date1=activity.getSignUpStart();//getSignUpdtart有空指针异常
            String activityTime = simpleDateFormat.format(date1);
//            Activity activity = activityMapper.selectByPrimaryKey(a.getId());
//            当前时间小于开始时间 status=0表示活动未开始
            if (activityTime.compareTo(sysTime) > 0) {
                activity.setStatus(0);
            } else if (activityTime.compareTo(sysTime)== 0) {
//                活动中
                activity.setStatus(1);

            } else activity.setStatus(-1);
            //                报名结束
        }

            baseRespVo.setData(activityList);
            baseRespVo.setMsg("查看列表成功");
            baseRespVo.setErrno(0);
            return baseRespVo;

    }

        /**
         * B端用户修改自己发布的活动
         *
         * @param activity
         * @return
         */
        @Override
        public BaseRespVo updateActivity (Activity activity){
            BaseRespVo baseRespVo = new BaseRespVo();
//        ActivityExample activityExample = new ActivityExample();
//        activityExample.createCriteria().andActivityStartEqualTo(activity.getActivityStart()).andContentOfActivitiesEqualTo(activity.getContentOfActivities()).andActivityNameEqualTo(activity.getActivityName());
            activityMapper.updateByPrimaryKeySelective(activity);
            baseRespVo.setData(activity);
            baseRespVo.setErrno(0);
            baseRespVo.setMsg("成功");
            return baseRespVo;
        }

    /**
     * p端用户查看所有的活动
     * @return
     */
    @Override
    public BaseRespVo selectPActivity() {
        List<Activity> activity=activityMapper.selectAllActivity();
        BaseRespVo baseRespVo = new BaseRespVo();
        baseRespVo.setData(activity);
        baseRespVo.setErrno(0);
        baseRespVo.setMsg("成功");
        return baseRespVo;
    }
    /**
     * B端用户查看
     * @param userId
     * @return
     */


    }
