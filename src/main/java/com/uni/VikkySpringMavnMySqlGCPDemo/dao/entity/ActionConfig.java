package com.uni.VikkySpringMavnMySqlGCPDemo.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@Entity
@Table(name = "ACTION_CONFIG", schema = "CO")
public class ActionConfig {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "groupId")
    private int groupId;

    @Column(name = "index")
    private int index;

    @Column(name = "actionType")
    private String actionType;

    @Lob
    @Column(name = "action")
    private byte[] action;

    @Lob
    @Column(name = "template")
    private byte[] template;

    @Column(name = "details")
    private String details;

    @Lob
    @Column(name = "outputConfig")
    private byte[] outputConfig;

    @Column(name = "outputVal")
    private String outputVal;

    @Column(name = "isActive")
    private String isActive;
}