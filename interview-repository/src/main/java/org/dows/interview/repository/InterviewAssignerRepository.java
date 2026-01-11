package org.dows.interview.repository;

import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

import org.dows.interview.entity.InterviewAssignerEntity;
import org.dows.interview.dao.InterviewAssignerDao;

@Component
public class InterviewAssignerRepository  extends CrudRepository<InterviewAssignerDao,InterviewAssignerEntity> {

}