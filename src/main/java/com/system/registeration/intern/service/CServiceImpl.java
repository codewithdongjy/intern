package com.system.registeration.intern.service;

import com.system.registeration.intern.bean.*;
import com.system.registeration.intern.mapper.ActivityMapper;
import com.system.registeration.intern.mapper.UserActivitiesMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class CServiceImpl implements CService {

    @Resource
    UserActivitiesMapper userActivitiesMapper;
    @Resource
    ActivityMapper activityMapper;

    /**
     * C端用户查看自己参加的活动
     *
     * @param userId 得到用户Id
     * @return
     */
    @Override
    public List<ActivitySelectedByC> getCActivities(Integer userId) {
        //TODO 用户状态
        UserActivitiesExample example = new UserActivitiesExample();
        example.createCriteria().andUserIdEqualTo(userId);
        List<UserActivities> userAct = userActivitiesMapper.selectByExample(example);
//        ActivitySelectedByC activitySelectedByC = new ActivitySelectedByC();
        List<Integer> idList = new LinkedList<>();
        for (UserActivities u : userAct
        ) {
            int activityId = u.getActivityId();
            idList.add(activityId);
           /* ActivityExample activityExample=new ActivityExample();
            activityExample.createCriteria().
            example.createCriteria().*/
//            Activity activity = activityMapper.selectByPrimaryKey(activityId);

        }
        List<ActivitySelectedByC> activitySelectedByCList = activityMapper.selectPartByActivityId(idList);
        return activitySelectedByCList;
    }


    /**
     * 显示活动详情页
     *
     * @param activityId
     * @return
     */
    @Override
    public BaseRespVo getActivityDetails(Integer activityId) {

//        ActivityExample example = new ActivityExample();
//        example.createCriteria().andIdEqualTo(activityId);
//        List<Activity> activities = activityMapper.selectByExample(example);
        /*Activity activity = activityMapper.selectByPrimaryKey(activityId);
        Map<String, Object> map = new HashMap<>();
        map.put("活动名称", activity.getActivityName());
        Date activityStart = activity.getActivityStart();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String format = simpleDateFormat.format(activityStart);
        map.put("活动时间", format);
        String format2 = simpleDateFormat.format(activity.getSignUpStart());
        map.put("报名开始时间", format2);
        String format3 = simpleDateFormat.format(activity.getSignUpEnd());
        map.put("报名结束时间", format3);
        map.put("活动地点", activity.getPlace());
        map.put("活动内容", activity.getDescription());
        map.put("报名容量比", 10 / activity.getMaxNum());
        return map;*/
        Activity activity = activityMapper.selectByPrimaryKey(activityId);
        ActivityDetails activityDetails = getActivityDetail(activity);
        BaseRespVo baseRespVo = new BaseRespVo();
        baseRespVo.setData(activityDetails);
        baseRespVo.setErrno(0);
        baseRespVo.setMsg("查看列表成功");

        return baseRespVo;
    }

    /**
     * 报名参加活动
     * 报名该活动，弹窗提示报名状态（报名成功 或 名额已满）
     */
    @Override
    public BaseRespVo signUpActivity(Integer activityId, Integer userId) {
        ActivityExample example = new ActivityExample();
        example.createCriteria().andIdEqualTo(activityId);
//        List<Activity> activities = activityMapper.selectByExample(example);
        BaseRespVo baseRespVo = new BaseRespVo();

        /*userActivitiesExample userExample = new userActivitiesExample();
//        userActivitiesExample userExample1 = new userActivitiesExample();
        userExample.createCriteria().andUserIdEqualTo(userId).andActivityIdEqualTo(activityId);
        List<userActivities> userActivities = userActivitiesMapper.selectByExample(userExample);*/
        Activity activity = activityMapper.selectByPrimaryKey(activityId);
        ActivityDetails activityDetails = getActivityDetail(activity);
        UserActivities userActivities = userActivitiesMapper.selectByActivityIdAndUserId(activityId, userId);
//     如果userActivities==null 说明该用户没有报名活动
        if (userActivities == null) {
            Integer signUp = activity.getSignUpNum();
            activityDetails.setSignUpStatus("未报名");
//        如果用户未报名且还有名额
            if (signUp < activity.getMaxNum()) {
                UserActivities userActivities1 = new UserActivities();
                userActivities1.setActivityId(activityId);
                userActivities1.setUserId(userId);
                userActivities1.setSignUp(1);
                userActivities1.setSignIn(0);
                userActivitiesMapper.insert(userActivities1);
//                更新这个活动的报名人数
                activityMapper.updateNum(activityId);
                activityDetails.setSignUpStatus("已报名");
                baseRespVo.setMsg("报名成功");
                baseRespVo.setErrno(0);

                baseRespVo.setData(activityDetails);
            }
            if (activity.getSignUpNum() >= activity.getMaxNum()) {
                activityDetails.setSignUpStatus("未报名");
                baseRespVo.setMsg("报名失败，名额已满");
                baseRespVo.setErrno(0);
                baseRespVo.setData(activityDetails);

            }
            return baseRespVo;
        } else {
            activityDetails.setSignUpStatus("已报名");
            baseRespVo.setMsg("已报名");
            baseRespVo.setErrno(0);
            baseRespVo.setData(activityDetails);
            return baseRespVo;
        }
    }

    private ActivityDetails getActivityDetail(Activity activity) {
        ActivityDetails activityDetails = new ActivityDetails();
        activityDetails.setActivityName(activity.getActivityName());
        activityDetails.setActivityStart(activity.getActivityStart());
        activityDetails.setSignupStartTime(activity.getSignUpStart());
        activityDetails.setSignupEndTime(activity.getSignUpEnd());
        activityDetails.setPlace(activity.getPlace());
        activityDetails.setDescription(activity.getDescription());
        activityDetails.setProportation((float) (activity.getSignUpNum() / activity.getMaxNum() * 1.0));

        return activityDetails;
    }
}


