package org.dows.interview.open;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.interview.open.PostInterviewActorsEntityRequest;
import org.dows.interview.open.PostInterviewActorsEntityResponse;
import org.dows.interview.open.PutInterviewActorsEntityRequest;
import org.dows.interview.open.PutInterviewActorsEntityResponse;
import org.dows.interview.open.DeleteInterviewActorsEntityRequest;
import org.dows.interview.open.DeleteInterviewActorsEntityResponse;
import org.dows.interview.open.GetInterviewActorsEntityRequest;
import org.dows.interview.open.GetInterviewActorsEntityResponse;
import org.dows.interview.open.GetInterviewActorsPageRequest;
import org.dows.interview.open.GetInterviewActorsPageResponse;
import org.dows.interview.open.GetInterviewActorsListRequest;
import org.dows.interview.open.GetInterviewActorsListResponse;

@RequiredArgsConstructor
@Tag(name = "OpenInterviewActorsRest", description = "面试人员")
@RestController
public class OpenInterviewActorsRest{

    @PostMapping("open/interview/actors/entity")
    @Operation(summary = "保存")
    public PostInterviewActorsEntityResponse postEntity(@RequestBody PostInterviewActorsEntityRequest postInterviewActorsEntityRequest){
        return null;
    }

    @PutMapping("open/interview/actors/entity")
    @Operation(summary = "更新")
    public void putEntity(@RequestBody PutInterviewActorsEntityRequest putInterviewActorsEntityRequest){
        
    }

    @DeleteMapping("open/interview/actors/entity")
    @Operation(summary = "删除")
    public void deleteEntity(@RequestBody DeleteInterviewActorsEntityRequest deleteInterviewActorsEntityRequest){
        
    }

    @GetMapping("open/interview/actors/entity")
    @Operation(summary = "详情")
    public GetInterviewActorsEntityResponse getEntity( GetInterviewActorsEntityRequest getInterviewActorsEntityRequest){
        return null;
    }

    @GetMapping("open/interview/actors/page")
    @Operation(summary = "分页")
    public GetInterviewActorsPageResponse getPage( GetInterviewActorsPageRequest getInterviewActorsPageRequest){
        return null;
    }

    @GetMapping("open/interview/actors/list")
    @Operation(summary = "列表")
    public GetInterviewActorsListResponse getList( GetInterviewActorsListRequest getInterviewActorsListRequest){
        return null;
    }

}