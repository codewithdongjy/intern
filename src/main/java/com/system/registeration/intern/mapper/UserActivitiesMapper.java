package com.system.registeration.intern.mapper;

import com.system.registeration.intern.bean.UserActivities;
import com.system.registeration.intern.bean.UserActivitiesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserActivitiesMapper {
    long countByExample(UserActivitiesExample example);

    int deleteByExample(UserActivitiesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserActivities record);

    int insertSelective(UserActivities record);

    List<UserActivities> selectByExample(UserActivitiesExample example);

    UserActivities selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserActivities record, @Param("example") UserActivitiesExample example);

    int updateByExample(@Param("record") UserActivities record, @Param("example") UserActivitiesExample example);

    int updateByPrimaryKeySelective(UserActivities record);

    int updateByPrimaryKey(UserActivities record);

    UserActivities selectByActivityIdAndUserId(Integer activityId, Integer userId);

    UserActivities setSignIn(@Param("activityId") Integer activityId, @Param("userId")Integer userId);
}