package org.dows.interview.repository;

import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

import org.dows.interview.entity.InterviewFlowEntity;
import org.dows.interview.dao.InterviewFlowDao;

@Component
public class InterviewFlowRepository  extends CrudRepository<InterviewFlowDao,InterviewFlowEntity> {

}