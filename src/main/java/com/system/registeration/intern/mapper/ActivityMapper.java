package com.system.registeration.intern.mapper;

import com.system.registeration.intern.bean.Activity;
import com.system.registeration.intern.bean.ActivityExample;
import com.system.registeration.intern.bean.ActivitySelectedByC;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ActivityMapper {
    long countByExample(ActivityExample example);

    int deleteByExample(ActivityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Activity record);

    int insertSelective(Activity record);

    List<Activity> selectByExample(ActivityExample example);

    Activity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Activity record, @Param("example") ActivityExample example);

    int updateByExample(@Param("record") Activity record, @Param("example") ActivityExample example);

    int updateByPrimaryKeySelective(Activity record);

    int updateByPrimaryKey(Activity record);
    List<ActivitySelectedByC> selectPartByActivityId(@Param("list") List<Integer> idList);
    void updateNum(Integer activityId);

    String selectUserNameByUserId(Integer userId);

    List<Activity> selectActivityListByUsername(String userName);

    List<Integer> selectuserIdBycreateUserIdAndActivityId( Integer createUserId, Integer activityId);

    List<Activity> selectAllActivity();
}