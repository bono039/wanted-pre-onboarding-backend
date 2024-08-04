package me.bono039.wantedpreonboardingbackend.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "user")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class User {

    // 사용자_ID
    @Id
    @Column(name = "user_id", updatable = false)
    private String user_id;

    // 사용자명
    @Column(name = "user_name", nullable = false)
    private String user_name;

    // 빌더 패턴으로 객체 생성
    @Builder
    public User(String user_id, String user_name) {
        this.user_id = user_id;
        this.user_name = user_name;
    }

    // 사용자명 변경
    public void update(String user_name) {
        this.user_name = user_name;
    }
}
