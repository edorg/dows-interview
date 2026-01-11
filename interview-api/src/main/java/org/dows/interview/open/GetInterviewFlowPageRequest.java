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
@Schema(description = "GetInterviewFlowPageRequest 对象")
public class GetInterviewFlowPageRequest {

    @Schema(description = "流程顺序")
    private Integer order;

    @Schema(description = "组织名称")
    private String orgName;

}