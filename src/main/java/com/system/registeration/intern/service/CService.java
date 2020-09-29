package com.system.registeration.intern.service;

import com.system.registeration.intern.bean.ActivitySelectedByC;
import com.system.registeration.intern.bean.BaseRespVo;

import java.util.List;
import java.util.Map;

public interface CService {

    List<ActivitySelectedByC> getCActivities(Integer userId);

    BaseRespVo getActivityDetails(Integer activityId);

    BaseRespVo signUpActivity(Integer activityId, Integer userId);
}
