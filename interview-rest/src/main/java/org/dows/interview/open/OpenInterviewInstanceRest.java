package org.dows.interview.open;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.interview.open.PostInterviewInstanceEntityRequest;
import org.dows.interview.open.PostInterviewInstanceEntityResponse;
import org.dows.interview.open.PutInterviewInstanceEntityRequest;
import org.dows.interview.open.PutInterviewInstanceEntityResponse;
import org.dows.interview.open.DeleteInterviewInstanceEntityRequest;
import org.dows.interview.open.DeleteInterviewInstanceEntityResponse;
import org.dows.interview.open.GetInterviewInstanceEntityRequest;
import org.dows.interview.open.GetInterviewInstanceEntityResponse;
import org.dows.interview.open.GetInterviewInstancePageRequest;
import org.dows.interview.open.GetInterviewInstancePageResponse;
import org.dows.interview.open.GetInterviewInstanceListRequest;
import org.dows.interview.open.GetInterviewInstanceListResponse;

@RequiredArgsConstructor
@Tag(name = "OpenInterviewInstanceRest", description = "面试实例")
@RestController
public class OpenInterviewInstanceRest{

    @PostMapping("open/interview/instance/entity")
    @Operation(summary = "保存")
    public PostInterviewInstanceEntityResponse postEntity(@RequestBody PostInterviewInstanceEntityRequest postInterviewInstanceEntityRequest){
        return null;
    }

    @PutMapping("open/interview/instance/entity")
    @Operation(summary = "更新")
    public void putEntity(@RequestBody PutInterviewInstanceEntityRequest putInterviewInstanceEntityRequest){
        
    }

    @DeleteMapping("open/interview/instance/entity")
    @Operation(summary = "删除")
    public void deleteEntity(@RequestBody DeleteInterviewInstanceEntityRequest deleteInterviewInstanceEntityRequest){
        
    }

    @GetMapping("open/interview/instance/entity")
    @Operation(summary = "详情")
    public GetInterviewInstanceEntityResponse getEntity( GetInterviewInstanceEntityRequest getInterviewInstanceEntityRequest){
        return null;
    }

    @GetMapping("open/interview/instance/page")
    @Operation(summary = "分页")
    public GetInterviewInstancePageResponse getPage( GetInterviewInstancePageRequest getInterviewInstancePageRequest){
        return null;
    }

    @GetMapping("open/interview/instance/list")
    @Operation(summary = "列表")
    public GetInterviewInstanceListResponse getList( GetInterviewInstanceListRequest getInterviewInstanceListRequest){
        return null;
    }

}