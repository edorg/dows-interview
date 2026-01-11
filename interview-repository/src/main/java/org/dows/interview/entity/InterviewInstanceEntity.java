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
@Table("interview_instance")
public class InterviewInstanceEntity extends CrudEntity<InterviewInstanceEntity> {

    @Schema(title = "面试实例ID")
    private Long interviewInstanceId;
    @Schema(title = "面试邀约ID")
    private Long interviewInviteId;
    @Schema(title = "面试流程ID")
    private Long interviewFlowId;
    @Schema(title = "人才简历ID")
    private Long resumeInstanceId;
    @Schema(title = "面试时长(分钟)")
    private Integer duration;
    @Schema(title = "面试形式[线下|线上]")
    private Integer interviewType;
    @Schema(title = "匹配度")
    private Integer matchScore;
    @Schema(title = "面试分值")
    private Integer interviewScore;
    @Schema(title = "序号[1面，2面]")
    private Integer order;
    @Schema(title = "处理状态：0-待面试；1-面试中；2-面试完成")
    private Integer processed;
    @Schema(title = "面试内容记录(记录语音或沟通过的内容的地址)")
    private String interviewContent;
    @Schema(title = "约定面试日期")
    private LocalDateTime interviewTime;
    @Schema(title = "开始面试时间")
    private LocalDateTime startTime;
    @Schema(title = "结束面试时间")
    private LocalDateTime endTime;
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