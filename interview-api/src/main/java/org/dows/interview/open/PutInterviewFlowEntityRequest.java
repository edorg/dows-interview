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
@Schema(description = "PutInterviewFlowEntityRequest 对象")
public class PutInterviewFlowEntityRequest {

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

}