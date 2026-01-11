package org.dows.interview.open;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.interview.open.PostInterviewFlowEntityRequest;
import org.dows.interview.open.PostInterviewFlowEntityResponse;
import org.dows.interview.open.PutInterviewFlowEntityRequest;
import org.dows.interview.open.PutInterviewFlowEntityResponse;
import org.dows.interview.open.DeleteInterviewFlowEntityRequest;
import org.dows.interview.open.DeleteInterviewFlowEntityResponse;
import org.dows.interview.open.GetInterviewFlowEntityRequest;
import org.dows.interview.open.GetInterviewFlowEntityResponse;
import org.dows.interview.open.GetInterviewFlowPageRequest;
import org.dows.interview.open.GetInterviewFlowPageResponse;
import org.dows.interview.open.GetInterviewFlowListRequest;
import org.dows.interview.open.GetInterviewFlowListResponse;

@RequiredArgsConstructor
@Tag(name = "OpenInterviewFlowRest", description = "面试流程")
@RestController
public class OpenInterviewFlowRest{

    @PostMapping("open/interview/flow/entity")
    @Operation(summary = "保存")
    public PostInterviewFlowEntityResponse postEntity(@RequestBody PostInterviewFlowEntityRequest postInterviewFlowEntityRequest){
        return null;
    }

    @PutMapping("open/interview/flow/entity")
    @Operation(summary = "更新")
    public void putEntity(@RequestBody PutInterviewFlowEntityRequest putInterviewFlowEntityRequest){
        
    }

    @DeleteMapping("open/interview/flow/entity")
    @Operation(summary = "删除")
    public void deleteEntity(@RequestBody DeleteInterviewFlowEntityRequest deleteInterviewFlowEntityRequest){
        
    }

    @GetMapping("open/interview/flow/entity")
    @Operation(summary = "详情")
    public GetInterviewFlowEntityResponse getEntity( GetInterviewFlowEntityRequest getInterviewFlowEntityRequest){
        return null;
    }

    @GetMapping("open/interview/flow/page")
    @Operation(summary = "分页")
    public GetInterviewFlowPageResponse getPage( GetInterviewFlowPageRequest getInterviewFlowPageRequest){
        return null;
    }

    @GetMapping("open/interview/flow/list")
    @Operation(summary = "列表")
    public GetInterviewFlowListResponse getList( GetInterviewFlowListRequest getInterviewFlowListRequest){
        return null;
    }

}