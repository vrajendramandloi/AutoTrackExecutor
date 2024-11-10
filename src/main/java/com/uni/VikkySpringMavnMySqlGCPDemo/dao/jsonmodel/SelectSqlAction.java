package com.uni.VikkySpringMavnMySqlGCPDemo.dao.jsonmodel;

import lombok.Data;

import java.util.Map;

@Data
public class SelectSqlAction {
    private String selectSql;
    private String dbName;
    private Map<String, String> sqlParam;
}
