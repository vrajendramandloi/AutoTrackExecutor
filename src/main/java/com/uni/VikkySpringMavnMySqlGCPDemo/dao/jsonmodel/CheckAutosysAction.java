package com.uni.VikkySpringMavnMySqlGCPDemo.dao.jsonmodel;

import lombok.Data;

@Data
public class CheckAutosysAction {
    private String jobName;
    private int frequency;
    private String frequencyType;   // EVERYDAY, EVERY_WEEKDAY,
}
