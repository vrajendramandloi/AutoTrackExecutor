package com.uni.VikkySpringMavnMySqlGCPDemo.dao.service;

import com.uni.VikkySpringMavnMySqlGCPDemo.dao.entity.ActionConfig;
import com.uni.VikkySpringMavnMySqlGCPDemo.dao.repository.ActionConfigRespository;
import com.uni.VikkySpringMavnMySqlGCPDemo.dao.repository.ActionGroupRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ActionConfigService {

    @Autowired
    private ActionConfigRespository actionConfigRespository;

    public boolean isGroupIdActive(int id) {
        List<ActionConfig> ac = new ArrayList<>();
        actionConfigRespository.findAllById(Arrays.asList(id)).forEach(actionConfig -> ac.add(actionConfig));
        ac = ac.stream().filter(actionConfig -> "Y".equalsIgnoreCase(actionConfig.getIsActive())).collect(Collectors.toList());

        return ac.isEmpty() ? false : true;
    }
}
