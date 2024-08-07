package me.bono039.wantedpreonboardingbackend.service;

import lombok.RequiredArgsConstructor;
import me.bono039.wantedpreonboardingbackend.domain.Recruitment;
import me.bono039.wantedpreonboardingbackend.dto.AddRecruitmentRequest;
import me.bono039.wantedpreonboardingbackend.repository.RecruitmentRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RecruitmentService {

    private final RecruitmentRepository recruitmentRepository;

    // 채용공고 글 추가 메소드
    public Recruitment save(AddRecruitmentRequest request) {
        return recruitmentRepository.save(request.toEntity());
    }
}
