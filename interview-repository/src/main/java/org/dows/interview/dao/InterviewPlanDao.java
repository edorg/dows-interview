package org.dows.interview.dao;

import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;
import org.dows.interview.entity.InterviewPlanEntity;
import org.dows.interview.mapper.InterviewPlanMapper;

@Component
public class InterviewPlanDao extends CrudDaoImpl<InterviewPlanMapper,InterviewPlanEntity>{

}