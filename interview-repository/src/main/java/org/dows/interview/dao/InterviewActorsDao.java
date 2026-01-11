package org.dows.interview.dao;

import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;
import org.dows.interview.entity.InterviewActorsEntity;
import org.dows.interview.mapper.InterviewActorsMapper;

@Component
public class InterviewActorsDao extends CrudDaoImpl<InterviewActorsMapper,InterviewActorsEntity>{

}