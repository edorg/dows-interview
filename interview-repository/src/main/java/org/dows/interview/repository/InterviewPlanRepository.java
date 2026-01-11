package org.dows.interview.repository;

import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

import org.dows.interview.entity.InterviewPlanEntity;
import org.dows.interview.dao.InterviewPlanDao;

@Component
public class InterviewPlanRepository  extends CrudRepository<InterviewPlanDao,InterviewPlanEntity> {

}