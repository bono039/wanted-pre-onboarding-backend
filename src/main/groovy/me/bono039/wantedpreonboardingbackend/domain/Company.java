package me.bono039.wantedpreonboardingbackend.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "company")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Company {

    // 회사 ID
    @Id
    @Column(name = "comp_id", updatable = false)
    private String comp_id;

    // 회사명
    @Column(name = "comp_name", nullable = false)
    private String comp_name;

    // 국가
    @Column(name = "country", nullable = false)
    private String country;

    // 지역
    @Column(name = "region", nullable = false)
    private String region;

    // 빌더 패턴으로 객체 생성
    @Builder
    public Company(String comp_id, String comp_name, String country, String region) {
        this.comp_id = comp_id;
        this.comp_name = comp_name;
        this.country = country;
        this.region = region;
    }

    public void update(String country, String region) {
        this.country = country;
        this.region = region;
    }
}
