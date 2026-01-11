package org.dows.interview.repository;

import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

import org.dows.interview.entity.InterviewInviteEntity;
import org.dows.interview.dao.InterviewInviteDao;

@Component
public class InterviewInviteRepository  extends CrudRepository<InterviewInviteDao,InterviewInviteEntity> {

}