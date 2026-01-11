package org.dows.interview.dao;

import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;
import org.dows.interview.entity.InterviewAssignerEntity;
import org.dows.interview.mapper.InterviewAssignerMapper;

@Component
public class InterviewAssignerDao extends CrudDaoImpl<InterviewAssignerMapper,InterviewAssignerEntity>{

}