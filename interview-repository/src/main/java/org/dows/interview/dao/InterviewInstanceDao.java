package org.dows.interview.dao;

import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;
import org.dows.interview.entity.InterviewInstanceEntity;
import org.dows.interview.mapper.InterviewInstanceMapper;

@Component
public class InterviewInstanceDao extends CrudDaoImpl<InterviewInstanceMapper,InterviewInstanceEntity>{

}