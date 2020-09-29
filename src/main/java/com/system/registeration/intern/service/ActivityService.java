package com.system.registeration.intern.service;

import com.system.registeration.intern.bean.Activity;
import com.system.registeration.intern.bean.BaseRespVo;

public interface ActivityService {
    BaseRespVo selectSignUpUser(Integer userId, Integer activityId);

    //    B端用户在网页发布活动
    BaseRespVo createActivity(Activity activity);

    BaseRespVo showBActivity(Integer userId);

    BaseRespVo updateActivity(Activity activity);
}
