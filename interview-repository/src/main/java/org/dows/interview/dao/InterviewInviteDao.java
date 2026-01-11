package org.dows.interview.dao;

import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;
import org.dows.interview.entity.InterviewInviteEntity;
import org.dows.interview.mapper.InterviewInviteMapper;

@Component
public class InterviewInviteDao extends CrudDaoImpl<InterviewInviteMapper,InterviewInviteEntity>{

}