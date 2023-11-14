package com.threestar.selectstar.dto.mypage;

import com.threestar.selectstar.domain.entity.Meeting;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.sql.Date;

@Builder
@ToString
@Getter
public class GetMyApplyingListResponse {
    private int meetingId;
    //private int userId;
    private String title;
    private int category;
    private int status;
    private Date applicationDeadline;
    private int views;
    private int recruitmentCount;
    private int applicationCount;
    private String location;
    private Date creationDate;
    //private String interestLanguage;
    //private String interestFramework;
    //private String interestJob;

    public static GetMyApplyingListResponse fromEntity(Meeting meeting){
        return GetMyApplyingListResponse.builder()
                .meetingId(meeting.getMeetingId())
                //.userId(meeting.getUser().getUserId())
                .title(meeting.getTitle())
                .category(meeting.getCategory())
                .status(meeting.getStatus())
                .applicationDeadline(meeting.getApplicationDeadline())
                .views(meeting.getViews())
                .recruitmentCount(meeting.getRecruitmentCount())
                .applicationCount(meeting.getApplicationCount())
                .location(meeting.getLocation())
                .creationDate(meeting.getCreationDate())
                .build();
    }
}