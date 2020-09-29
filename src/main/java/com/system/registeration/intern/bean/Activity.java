package com.system.registeration.intern.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Activity {
    private Integer id;

    private String activityName;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm",timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date activityStart;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm",timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date activityEnd;

    private String signinMethod;

    private String place;

    private String contentOfActivities;

    private Integer maxNum;

    private String createdUserName;

    private String description;

    private String url;

    private String activityAreateTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm",timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date signUpStart;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm",timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date signUpEnd;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm",timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date signInStart;

    private String categroy;
    private Integer signUpNum;
    private Integer status;
    private Date activityCreateTime;
    public Date getActivityCreateTime() {
        return activityCreateTime;
    }

    public void setActivityCreateTime(Date activityCreateTime) {
        this.activityCreateTime = activityCreateTime;
    }

    public Integer getId() {
        return id;
    }
    public Integer getSignUpNum() {
        return signUpNum;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public void setSignUpNum(Integer signUpNum) {
        this.signUpNum = signUpNum;
    }
    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName == null ? null : activityName.trim();
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    public Date getActivityStart() {
        return activityStart;
    }

    public void setActivityStart(Date activityStart) {
        this.activityStart = activityStart;
    }

    public Date getActivityEnd() {
        return activityEnd;
    }

    public void setActivityEnd(Date activityEnd) {
        this.activityEnd = activityEnd;
    }

    public String getSigninMethod() {
        return signinMethod;
    }

    public void setSigninMethod(String signinMethod) {
        this.signinMethod = signinMethod == null ? null : signinMethod.trim();
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    public String getContentOfActivities() {
        return contentOfActivities;
    }

    public void setContentOfActivities(String contentOfActivities) {
        this.contentOfActivities = contentOfActivities == null ? null : contentOfActivities.trim();
    }

    public Integer getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(Integer maxNum) {
        this.maxNum = maxNum;
    }

    public String getCreatedUserName() {
        return createdUserName;
    }

    public void setCreatedUserName(String createdUserName) {
        this.createdUserName = createdUserName == null ? null : createdUserName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Date getSignUpStart() {
        return signUpStart;
    }

    public void setSignUpStart(Date signUpStart) {
        this.signUpStart = signUpStart;
    }

    public Date getSignUpEnd() {
        return signUpEnd;
    }

    public void setSignUpEnd(Date signUpEnd) {
        this.signUpEnd = signUpEnd;
    }

    public Date getSignInStart() {
        return signInStart;
    }

    public void setSignInStart(Date signInStart) {
        this.signInStart = signInStart;
    }

    public String getCategroy() {
        return categroy;
    }

    public void setCategroy(String categroy) {
        this.categroy = categroy == null ? null : categroy.trim();
    }



}