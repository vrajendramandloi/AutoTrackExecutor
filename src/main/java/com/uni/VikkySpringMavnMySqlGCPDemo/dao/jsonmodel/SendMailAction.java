package com.uni.VikkySpringMavnMySqlGCPDemo.dao.jsonmodel;

import lombok.Data;

@Data
public class SendMailAction {
    String to;
    String from;
    String subject;
    String body;
    String attachment;

}
