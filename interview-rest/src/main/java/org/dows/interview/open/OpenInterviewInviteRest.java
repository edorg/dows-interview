package org.dows.interview.open;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.interview.open.PostInterviewInviteEntityResponse;
import org.dows.interview.open.PutInterviewInviteEntityResponse;
import org.dows.interview.open.DeleteInterviewInviteEntityRequest;
import org.dows.interview.open.DeleteInterviewInviteEntityResponse;
import org.dows.interview.open.GetInterviewInviteEntityRequest;

@RequiredArgsConstructor
@Tag(name = "OpenInterviewInviteRest", description = "面试邀约")
@RestController
public class OpenInterviewInviteRest{

    @DeleteMapping("open/interview/invite/entity")
    @Operation(summary = "删除")
    public void deleteEntity(@RequestBody DeleteInterviewInviteEntityRequest deleteInterviewInviteEntityRequest){
        
    }

}