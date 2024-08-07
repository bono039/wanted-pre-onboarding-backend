package me.bono039.wantedpreonboardingbackend.dto;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.bono039.wantedpreonboardingbackend.domain.Recruitment;

@NoArgsConstructor  // 기본 생성자 추가
@AllArgsConstructor // 모든 필드 값을 파라미터로 받는 생성자 추가
@Getter
public class AddRecruitmentRequest {

    // 채용공고_id
    @NotNull
    Long rc_id;

    // 채용포지션 (50)
    @NotNull
    String position;

    // 채용보상금
    @NotNull
    Long reward;

    // 채용내용 (500)
    @NotNull
    String details;

    // 사용기술 (20)
    @NotNull
    String stack;

    // FK  회사_id comp_id

    // 생성자 사용해 객체 생성
    public Recruitment toEntity() {
        return Recruitment.builder()
                        .rc_id(rc_id)
                        .position(position)
                        .reward(reward)
                        .details(details)
                        .stack(stack)
                        .build();
    }

}
