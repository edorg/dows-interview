package org.dows.interview.open;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;

import java.util.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Schema(description = "PutInterviewInstanceEntityRequest 对象")
public class PutInterviewInstanceEntityRequest {

    @Schema(description = "面试实例ID")
    private Long interviewInstanceId;

    @Schema(description = "面试邀约ID")
    private Long interviewInviteId;

    @Schema(description = "面试流程ID")
    private Long interviewFlowId;

    @Schema(description = "人才简历ID")
    private Long resumeInstanceId;

    @Schema(description = "面试时长(分钟)")
    private Integer duration;

    @Schema(description = "面试形式[线下|线上]")
    private Integer interviewType;

    @Schema(description = "匹配度")
    private Integer matchScore;

    @Schema(description = "面试分值")
    private Integer interviewScore;

    @Schema(description = "序号[1面，2面]")
    private Integer order;

    @Schema(description = "处理状态：0-待面试；1-面试中；2-面试完成")
    private Integer processed;

    @Schema(description = "面试内容记录(记录语音或沟通过的内容的地址)")
    private String interviewContent;

    @Schema(description = "约定面试日期")
    private LocalDateTime interviewTime;

    @Schema(description = "开始面试时间")
    private LocalDateTime startTime;

    @Schema(description = "结束面试时间")
    private LocalDateTime endTime;

}