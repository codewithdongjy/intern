package com.system.registeration.intern.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActivityShowInC {
    private String activityName;

    private Date activityStart;

    private Date activityEnd;

    private String place;

    private String url;

    private Integer visitorsNum;

    private String description;
}
