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
@Schema(description = "DeleteInterviewAssignerEntityRequest 对象")
public class DeleteInterviewAssignerEntityRequest {

    @Schema(description = "面试指派ID")
    private Long interviewAssignerId;

}