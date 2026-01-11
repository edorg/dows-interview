package org.dows.interview.open;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.interview.open.PostInterviewAssignerEntityRequest;
import org.dows.interview.open.PostInterviewAssignerEntityResponse;
import org.dows.interview.open.PutInterviewAssignerEntityRequest;
import org.dows.interview.open.PutInterviewAssignerEntityResponse;
import org.dows.interview.open.DeleteInterviewAssignerEntityRequest;
import org.dows.interview.open.DeleteInterviewAssignerEntityResponse;
import org.dows.interview.open.GetInterviewAssignerEntityRequest;
import org.dows.interview.open.GetInterviewAssignerEntityResponse;
import org.dows.interview.open.GetInterviewAssignerPageRequest;
import org.dows.interview.open.GetInterviewAssignerPageResponse;
import org.dows.interview.open.GetInterviewAssignerListRequest;
import org.dows.interview.open.GetInterviewAssignerListResponse;

@RequiredArgsConstructor
@Tag(name = "OpenInterviewAssignerRest", description = "面试指派")
@RestController
public class OpenInterviewAssignerRest{

    @PostMapping("open/interview/assigner/entity")
    @Operation(summary = "保存")
    public PostInterviewAssignerEntityResponse postEntity(@RequestBody PostInterviewAssignerEntityRequest postInterviewAssignerEntityRequest){
        return null;
    }

    @PutMapping("open/interview/assigner/entity")
    @Operation(summary = "更新")
    public void putEntity(@RequestBody PutInterviewAssignerEntityRequest putInterviewAssignerEntityRequest){
        
    }

    @DeleteMapping("open/interview/assigner/entity")
    @Operation(summary = "删除")
    public void deleteEntity(@RequestBody DeleteInterviewAssignerEntityRequest deleteInterviewAssignerEntityRequest){
        
    }

    @GetMapping("open/interview/assigner/entity")
    @Operation(summary = "详情")
    public GetInterviewAssignerEntityResponse getEntity( GetInterviewAssignerEntityRequest getInterviewAssignerEntityRequest){
        return null;
    }

    @GetMapping("open/interview/assigner/page")
    @Operation(summary = "分页")
    public GetInterviewAssignerPageResponse getPage( GetInterviewAssignerPageRequest getInterviewAssignerPageRequest){
        return null;
    }

    @GetMapping("open/interview/assigner/list")
    @Operation(summary = "列表")
    public GetInterviewAssignerListResponse getList( GetInterviewAssignerListRequest getInterviewAssignerListRequest){
        return null;
    }

}