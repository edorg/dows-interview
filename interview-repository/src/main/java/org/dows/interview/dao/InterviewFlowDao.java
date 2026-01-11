package org.dows.interview.dao;

import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;
import org.dows.interview.entity.InterviewFlowEntity;
import org.dows.interview.mapper.InterviewFlowMapper;

@Component
public class InterviewFlowDao extends CrudDaoImpl<InterviewFlowMapper,InterviewFlowEntity>{

}