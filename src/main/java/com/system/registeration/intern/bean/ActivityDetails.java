package com.system.registeration.intern.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActivityDetails {
    @JsonIgnore
    private Integer id;

    private String activityName;

    @DateTimeFormat(pattern = "yy-MM-dd HH:mm")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm",timezone="GMT+8")
    private Date activityStart;

    @DateTimeFormat(pattern = "yy-MM-dd HH:mm")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm",timezone="GMT+8")
    private Date signupStartTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm",timezone="GMT+8")
    @DateTimeFormat(pattern = "yy-MM-dd HH:mm")
    private Date signupEndTime;

    private String place;

//报名比例
    private Float proportation;

    private String signUpStatus;

    private String description;

}
