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
@Table("interview_flow")
public class InterviewFlowEntity extends CrudEntity<InterviewFlowEntity> {

    @Schema(title = "面试流程ID")
    private Long interviewFlowId;
    @Schema(title = "组织ID")
    private Long orgInstanceId;
    @Schema(title = "组织树ID")
    private Long orgTreeId;
    @Schema(title = "组织岗位ID")
    private Long orgPositionId;
    @Schema(title = "流程名称[初筛,一面,二面...]")
    private String flowName;
    @Schema(title = "说明")
    private String description;
    @Schema(title = "信息模板")
    private String messageTemplate;
    @Schema(title = "流程顺序")
    private Integer order;
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