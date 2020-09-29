package com.system.registeration.intern.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Activityxiaxie {
    private String activityName;
    private Date actitivityStarttime;
    private Date activityEndtime;
    private String signinMethod;
    private String place;
    private String contentOfActivities;
    Integer maxNum;
    private String managerNickname;

}
