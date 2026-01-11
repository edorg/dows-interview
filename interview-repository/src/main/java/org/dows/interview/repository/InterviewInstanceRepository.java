package org.dows.interview.repository;

import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

import org.dows.interview.entity.InterviewInstanceEntity;
import org.dows.interview.dao.InterviewInstanceDao;

@Component
public class InterviewInstanceRepository  extends CrudRepository<InterviewInstanceDao,InterviewInstanceEntity> {

}