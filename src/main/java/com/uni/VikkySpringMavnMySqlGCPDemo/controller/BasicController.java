package com.uni.VikkySpringMavnMySqlGCPDemo.controller;

import com.uni.VikkySpringMavnMySqlGCPDemo.dao.entity.ActionConfig;
import com.uni.VikkySpringMavnMySqlGCPDemo.dao.entity.ActionGroup;
import com.uni.VikkySpringMavnMySqlGCPDemo.dao.service.ActionConfigService;
import com.uni.VikkySpringMavnMySqlGCPDemo.dao.service.ActionGroupService;
import com.uni.VikkySpringMavnMySqlGCPDemo.dao.service.ActionResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
public class BasicController {

    @Autowired
    private ActionConfigService actionConfigService;

    @Autowired
    private ActionGroupService actionGroupService;

    @Autowired
    private ActionResponseService actionResponseService;

    @GetMapping("/triggerGroupId/{groupid}")
    public void triggerGroupid(@PathVariable int groupId) {
        boolean isGroupActive = actionConfigService.isGroupIdActive(groupId);

        // if Group id is yes then fetch the config


    }

}
