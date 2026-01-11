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
@Schema(description = "PostInterviewFlowEntityResponse 对象")
public class PostInterviewFlowEntityResponse {

    @Schema(description = "面试流程ID")
    private Long interviewFlowId;

}