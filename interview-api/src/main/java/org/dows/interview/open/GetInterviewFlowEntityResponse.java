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
@Schema(description = "GetInterviewFlowEntityResponse 对象")
public class GetInterviewFlowEntityResponse {

    @Schema(description = "面试流程ID")
    private Long interviewFlowId;

    @Schema(description = "组织ID")
    private Long orgInstanceId;

    @Schema(description = "组织树ID")
    private Long orgTreeId;

    @Schema(description = "组织岗位ID")
    private Long orgPositionId;

    @Schema(description = "流程名称[初筛,一面,二面...]")
    private String flowName;

    @Schema(description = "说明")
    private String description;

    @Schema(description = "信息模板")
    private String messageTemplate;

    @Schema(description = "流程顺序")
    private Integer order;

    @Schema(description = "版本号")
    private Integer revision;

    @Schema(description = "应用id")
    private String app_id;

    @Schema(description = "时间戳")
    private LocalDateTime createTime;

    @Schema(description = "更新时间")
    private LocalDateTime updateTime;

    @Schema(description = "删除时间")
    private LocalDateTime deleteTime;

    @Schema(description = "创建者ID")
    private Long createId;

}