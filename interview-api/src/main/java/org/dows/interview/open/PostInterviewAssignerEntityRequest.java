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
@Schema(description = "PostInterviewAssignerEntityRequest 对象")
public class PostInterviewAssignerEntityRequest {

    @Schema(description = "面试流程ID")
    private Long interviewFlowId;

    @Schema(description = "面试管账号ID")
    private Long accountInstanceId;

    @Schema(description = "昵称")
    private String nickname;

}