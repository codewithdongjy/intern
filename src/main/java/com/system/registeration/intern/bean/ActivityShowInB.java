package com.system.registeration.intern.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.PrimitiveIterator;
/**
 * 用于封装B端用户的活动列表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActivityShowInB {

    private String activityName;

    private String createdUserName;
    private String place;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm",timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date activityStart;
    private String contentOfActivities;
    String state;
    private Integer maxNum;
private Integer signupNum;



}
