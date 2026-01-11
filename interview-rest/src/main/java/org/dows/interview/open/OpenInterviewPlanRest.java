package org.dows.interview.open;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.interview.open.PostInterviewPlanEntityResponse;
import org.dows.interview.open.PutInterviewPlanEntityResponse;
import org.dows.interview.open.DeleteInterviewPlanEntityRequest;
import org.dows.interview.open.DeleteInterviewPlanEntityResponse;
import org.dows.interview.open.GetInterviewPlanEntityRequest;
import org.dows.interview.open.GetInterviewPlanPageRequest;
import org.dows.interview.open.GetInterviewPlanListRequest;

@RequiredArgsConstructor
@Tag(name = "OpenInterviewPlanRest", description = "面试安排")
@RestController
public class OpenInterviewPlanRest{

    @DeleteMapping("open/interview/plan/entity")
    @Operation(summary = "删除")
    public void deleteEntity(@RequestBody DeleteInterviewPlanEntityRequest deleteInterviewPlanEntityRequest){
        
    }

}