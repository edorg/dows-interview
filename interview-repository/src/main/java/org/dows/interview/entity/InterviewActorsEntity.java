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
@Table("interview_actors")
public class InterviewActorsEntity extends CrudEntity<InterviewActorsEntity> {

    @Schema(title = "面试人员ID")
    private Long interviewActorsId;
    @Schema(title = "面试流程ID")
    private Long interviewFlowId;
    @Schema(title = "账号ID")
    private Long accountInstanceId;
    @Schema(title = "面试实例ID")
    private Long interviewInstanceId;
    @Schema(title = "用户类型[0:面试者,1:AI面试官,2:实体面试官]")
    private Integer actorType;
    @Schema(title = "流程顺序")
    private Integer order;
    @Schema(title = "昵称")
    private String nickname;
    @Schema(title = "面试总结|评价内容")
    private String evaluateContent;
    @Schema(title = "评分[0~10]")
    private Integer score;
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