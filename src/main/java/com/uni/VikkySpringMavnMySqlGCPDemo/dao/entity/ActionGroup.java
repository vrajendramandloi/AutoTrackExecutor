package com.uni.VikkySpringMavnMySqlGCPDemo.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@Entity
@Table(name = "ACTION_GROUP", schema = "CO")
public class ActionGroup {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "groupName")
    private String groupName;

    @Column(name = "isActive")
    private String isActive;
}