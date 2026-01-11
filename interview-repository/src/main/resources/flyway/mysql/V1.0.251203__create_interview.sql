-- 若库不存在创建一个
CREATE DATABASE IF NOT EXISTS `interview`;
USE `interview`;

drop table if exists `interview_flow`;
CREATE TABLE IF NOT EXISTS `interview_flow`(
    `interview_flow_id` bigint(19) NOT NULL COMMENT '面试流程ID',
    `org_instance_id` bigint(19) DEFAULT NULL COMMENT '组织ID',
    `org_tree_id` bigint(19) DEFAULT NULL COMMENT '组织树ID',
    `org_position_id` bigint(19) DEFAULT NULL COMMENT '组织岗位ID',
    `flow_name` varchar(64) DEFAULT NULL COMMENT '流程名称[初筛,一面,二面...]',
    `description` varchar(64) DEFAULT NULL COMMENT '说明',
    `message_template` varchar(64) DEFAULT NULL COMMENT '信息模板',
    `order` integer(11) DEFAULT NULL COMMENT '流程顺序',
    `revision` integer(11) DEFAULT NULL COMMENT '版本号',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用id',
    `create_time` datetime DEFAULT NULL COMMENT '时间戳',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
    `create_id` bigint(19) DEFAULT NULL COMMENT '创建者ID',
    `update_id` bigint(19) DEFAULT NULL COMMENT '更新者ID',
    PRIMARY KEY (`interview_flow_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `interview_assigner`;
CREATE TABLE IF NOT EXISTS `interview_assigner`(
    `interview_assigner_id` bigint(19) NOT NULL COMMENT '面试指派ID',
    `interview_flow_id` bigint(19) DEFAULT NULL COMMENT '面试流程ID',
    `account_instance_id` bigint(19) DEFAULT NULL COMMENT '面试管账号ID',
    `nickname` varchar(64) DEFAULT NULL COMMENT '昵称',
    `revision` integer(11) DEFAULT NULL COMMENT '版本号',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用id',
    `create_time` datetime DEFAULT NULL COMMENT '时间戳',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
    `create_id` bigint(19) DEFAULT NULL COMMENT '创建者ID',
    `update_id` bigint(19) DEFAULT NULL COMMENT '更新者ID',
    PRIMARY KEY (`interview_assigner_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `interview_invite`;
CREATE TABLE IF NOT EXISTS `interview_invite`(
    `interview_invite_id` bigint(19) NOT NULL COMMENT '面试邀约ID',
    `interview_flow_id` bigint(19) DEFAULT NULL COMMENT '面试流程ID',
    `resume_instance_id` bigint(19) DEFAULT NULL COMMENT '人才简历ID',
    `account_instance_id` bigint(19) DEFAULT NULL COMMENT '求职者账号ID',
    `invite_message` varchar(64) DEFAULT NULL COMMENT '通知消息',
    `invite_count` integer(11) DEFAULT NULL COMMENT '邀约次数',
    `read_state` integer(11) DEFAULT NULL COMMENT '读状态[0:未读，1：已读]',
    `interview_time` datetime DEFAULT NULL COMMENT '面试时间',
    `invite_link` varchar(64) DEFAULT NULL COMMENT '邀请链接[腾讯会议记录链接,飞书会议记录链接]',
    `revision` integer(11) DEFAULT NULL COMMENT '版本号',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用id',
    `create_time` datetime DEFAULT NULL COMMENT '时间戳',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
    `create_id` bigint(19) DEFAULT NULL COMMENT '创建者ID',
    `update_id` bigint(19) DEFAULT NULL COMMENT '更新者ID',
    PRIMARY KEY (`interview_invite_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `interview_plan`;
CREATE TABLE IF NOT EXISTS `interview_plan`(
    `interview_plan_id` bigint(19) NOT NULL COMMENT '面试安排ID',
    `interview_invite_id` bigint(19) DEFAULT NULL COMMENT '面试邀约ID',
    `interview_time` datetime DEFAULT NULL COMMENT '面试时间',
    `demand` integer(11) DEFAULT NULL COMMENT '需求数(需要几个人同意)',
    `agreement` integer(11) DEFAULT NULL COMMENT '同意数+1(每同意一个人+1,直到和demand相等)',
    `revision` integer(11) DEFAULT NULL COMMENT '版本号',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用id',
    `create_time` datetime DEFAULT NULL COMMENT '时间戳',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
    `create_id` bigint(19) DEFAULT NULL COMMENT '创建者ID',
    `update_id` bigint(19) DEFAULT NULL COMMENT '更新者ID',
    PRIMARY KEY (`interview_plan_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `interview_instance`;
CREATE TABLE IF NOT EXISTS `interview_instance`(
    `interview_instance_id` bigint(19) NOT NULL COMMENT '面试实例ID',
    `interview_invite_id` bigint(19) DEFAULT NULL COMMENT '面试邀约ID',
    `interview_flow_id` bigint(19) DEFAULT NULL COMMENT '面试流程ID',
    `resume_instance_id` bigint(19) DEFAULT NULL COMMENT '人才简历ID',
    `duration` integer(11) DEFAULT NULL COMMENT '面试时长(分钟)',
    `interview_type` integer(11) DEFAULT NULL COMMENT '面试形式[线下|线上]',
    `match_score` integer(11) DEFAULT NULL COMMENT '匹配度',
    `interview_score` integer(11) DEFAULT NULL COMMENT '面试分值',
    `order` integer(11) DEFAULT NULL COMMENT '序号[1面，2面]',
    `processed` integer(11) DEFAULT NULL COMMENT '处理状态：0-待面试；1-面试中；2-面试完成',
    `interview_content` varchar(64) DEFAULT NULL COMMENT '面试内容记录(记录语音或沟通过的内容的地址)',
    `interview_time` datetime DEFAULT NULL COMMENT '约定面试日期',
    `start_time` datetime DEFAULT NULL COMMENT '开始面试时间',
    `end_time` datetime DEFAULT NULL COMMENT '结束面试时间',
    `revision` integer(11) DEFAULT NULL COMMENT '版本号',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用id',
    `create_time` datetime DEFAULT NULL COMMENT '时间戳',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
    `create_id` bigint(19) DEFAULT NULL COMMENT '创建者ID',
    `update_id` bigint(19) DEFAULT NULL COMMENT '更新者ID',
    PRIMARY KEY (`interview_instance_id`)
) ENGINE=InnoDB COMMENT='';

drop table if exists `interview_actors`;
CREATE TABLE IF NOT EXISTS `interview_actors`(
    `interview_actors_id` bigint(19) NOT NULL COMMENT '面试人员ID',
    `interview_flow_id` bigint(19) DEFAULT NULL COMMENT '面试流程ID',
    `account_instance_id` bigint(19) DEFAULT NULL COMMENT '账号ID',
    `interview_instance_id` bigint(19) DEFAULT NULL COMMENT '面试实例ID',
    `actor_type` integer(11) DEFAULT NULL COMMENT '用户类型[0:面试者,1:AI面试官,2:实体面试官]',
    `order` integer(11) DEFAULT NULL COMMENT '流程顺序',
    `nickname` varchar(64) DEFAULT NULL COMMENT '昵称',
    `evaluate_content` varchar(64) DEFAULT NULL COMMENT '面试总结|评价内容',
    `score` integer(11) DEFAULT NULL COMMENT '评分[0~10]',
    `revision` integer(11) DEFAULT NULL COMMENT '版本号',
    `app_id` varchar(64) DEFAULT NULL COMMENT '应用id',
    `create_time` datetime DEFAULT NULL COMMENT '时间戳',
    `update_time` datetime DEFAULT NULL COMMENT '更新时间',
    `delete_time` datetime DEFAULT NULL COMMENT '删除时间',
    `create_id` bigint(19) DEFAULT NULL COMMENT '创建者ID',
    `update_id` bigint(19) DEFAULT NULL COMMENT '更新者ID',
    PRIMARY KEY (`interview_actors_id`)
) ENGINE=InnoDB COMMENT='';


