package me.bono039.wantedpreonboardingbackend.controller;

import lombok.RequiredArgsConstructor;
import me.bono039.wantedpreonboardingbackend.domain.Recruitment;
import me.bono039.wantedpreonboardingbackend.dto.AddRecruitmentRequest;
import me.bono039.wantedpreonboardingbackend.service.RecruitmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class RecruitmentApiController {

    private final RecruitmentService recruitmentService;

    @PostMapping("/api/recruitments")
    public ResponseEntity<Recruitment> addRecruitment(@RequestBody AddRecruitmentRequest request) {
        Recruitment savedRc = recruitmentService.save(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                            .body(savedRc);
    }
}
