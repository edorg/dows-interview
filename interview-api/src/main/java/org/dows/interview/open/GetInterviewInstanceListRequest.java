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
@Schema(description = "GetInterviewInstanceListRequest 对象")
public class GetInterviewInstanceListRequest {

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

}