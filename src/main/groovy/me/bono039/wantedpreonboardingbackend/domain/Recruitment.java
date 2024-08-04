package me.bono039.wantedpreonboardingbackend.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "recruitment")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Recruitment {

    // 채용공고 ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본키를 자동으로 1씩 증가
    @Column(name = "rc_id")
    private Long rc_id;

    // 채용포지션
    @Column(name = "position", nullable = false)
    private String position;

    // 채용보상금
    @Column(name = "reward", nullable = false)
    private Long reward;

    // 채용내용
    @Column(name = "details", nullable = false)
    private String details;

    // 사용기술
    @Column(name = "stack", nullable = false)
    private String stack;

    // 빌더 패턴으로 객체 생성
    @Builder
    public Recruitment(Long rc_id, String position, Long reward, String details, String stack) {
        this.rc_id = rc_id;
        this.position = position;
        this.reward = reward;
        this.details = details;
        this.stack = stack;
    }

    public void update(String position, Long reward, String details, String stack) {
        this.position = position;
        this.reward = reward;
        this.details = details;
        this.stack = stack;
    }
}
