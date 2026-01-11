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
@Schema(description = "GetInterviewActorsListResponse 对象")
public class GetInterviewActorsListResponse {

    @Schema(description = "面试人员ID")
    private Long interviewActorsId;

    @Schema(description = "面试流程ID")
    private Long interviewFlowId;

    @Schema(description = "账号ID")
    private Long accountInstanceId;

    @Schema(description = "面试实例ID")
    private Long interviewInstanceId;

    @Schema(description = "用户类型[0:面试者,1:AI面试官,2:实体面试官]")
    private Integer actorType;

    @Schema(description = "流程顺序")
    private Integer order;

    @Schema(description = "昵称")
    private String nickname;

    @Schema(description = "面试总结|评价内容")
    private String evaluateContent;

    @Schema(description = "评分[0~10]")
    private Integer score;

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

    @Schema(description = "更新者ID")
    private Long updateId;

}