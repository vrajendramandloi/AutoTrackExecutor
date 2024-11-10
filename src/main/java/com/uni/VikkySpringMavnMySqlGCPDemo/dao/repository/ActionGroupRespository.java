package com.uni.VikkySpringMavnMySqlGCPDemo.dao.repository;

import com.uni.VikkySpringMavnMySqlGCPDemo.dao.entity.ActionConfig;
import com.uni.VikkySpringMavnMySqlGCPDemo.dao.entity.ActionGroup;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActionGroupRespository extends CrudRepository<ActionGroup, Integer> {

}
