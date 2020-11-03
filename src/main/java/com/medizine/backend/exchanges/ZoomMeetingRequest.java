package com.medizine.backend.exchanges;

import com.medizine.backend.dto.ZoomMeeting;
import com.medizine.backend.models.Media;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ZoomMeetingRequest extends ZoomMeeting {

    public static final String REQUEST_MODULE_TYPE = "moduleType";
    public static final String REQUEST_MODULE_ID = "moduleId";
    public static final String REQUEST_MEETING_STATUS = "meetingStatus";
    public static final String REQUEST_MEETING_NUMBER = "meetingNumber";

    private String thumbnailId;

    @Override
    @ApiModelProperty(hidden = true)
    public Media getMeetingThumbnail() {
        return super.getMeetingThumbnail();
    }

}
