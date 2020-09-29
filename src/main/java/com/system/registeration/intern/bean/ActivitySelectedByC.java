package com.system.registeration.intern.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActivitySelectedByC {

    private String activityName;

    private String sysnickname;

    private String place;
@JsonFormat(pattern = "yy-MM-dd HH:mm",timezone = "GMT+8")
    private Date activityStart;

    private int status;




}
