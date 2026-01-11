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
@Table("interview_plan")
public class InterviewPlanEntity extends CrudEntity<InterviewPlanEntity> {

    @Schema(title = "面试安排ID")
    private Long interviewPlanId;
    @Schema(title = "面试邀约ID")
    private Long interviewInviteId;
    @Schema(title = "面试时间")
    private LocalDateTime interviewTime;
    @Schema(title = "需求数(需要几个人同意)")
    private Integer demand;
    @Schema(title = "同意数+1(每同意一个人+1,直到和demand相等)")
    private Integer agreement;
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