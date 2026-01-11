package org.dows.interview.entity;

import com.mybatisflex.annotation.Table;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.dows.rade.crud.CrudEntity;

import java.time.LocalDateTime;
import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = true)
@Table("interview_invite")
public class InterviewInviteEntity extends CrudEntity<InterviewInviteEntity> {

    @Schema(title = "面试邀约ID")
    private Long interviewInviteId;
    @Schema(title = "面试流程ID")
    private Long interviewFlowId;
    @Schema(title = "人才简历ID")
    private Long resumeInstanceId;
    @Schema(title = "求职者账号ID")
    private Long accountInstanceId;
    @Schema(title = "通知消息")
    private String inviteMessage;
    @Schema(title = "邀约次数")
    private Integer inviteCount;
    @Schema(title = "读状态[0:未读，1：已读]")
    private Integer readState;
    @Schema(title = "面试时间")
    private LocalDateTime interviewTime;
    @Schema(title = "邀请链接[腾讯会议记录链接,飞书会议记录链接]")
    private String inviteLink;
    @Schema(title = "版本号")
    private Integer revision;
    @Schema(title = "应用id")
    private String appId;
    @Schema(title = "时间戳")
    private LocalDateTime createTime;
    @Schema(title = "更新时间")
    private LocalDateTime updateTime;
    @Schema(title = "删除时间")
    private LocalDateTime deleteTime;
    @Schema(title = "创建者ID")
    private Long createId;
    @Schema(title = "更新者ID")
    private Long updateId;
}