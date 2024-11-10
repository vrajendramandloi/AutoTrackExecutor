package com.uni.VikkySpringMavnMySqlGCPDemo.dao.entity;

import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

@Data
public class ActionResponse {
    private Timestamp startTime;
    private Timestamp endTime;
    private int groupId;
    private int lastSuccessfulStep;
}
