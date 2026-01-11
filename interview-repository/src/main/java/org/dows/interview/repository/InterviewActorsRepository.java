package org.dows.interview.repository;

import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

import org.dows.interview.entity.InterviewActorsEntity;
import org.dows.interview.dao.InterviewActorsDao;

@Component
public class InterviewActorsRepository  extends CrudRepository<InterviewActorsDao,InterviewActorsEntity> {

}