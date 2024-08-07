package me.bono039.wantedpreonboardingbackend.repository;

import me.bono039.wantedpreonboardingbackend.domain.Recruitment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecruitmentRepository extends JpaRepository<Recruitment, Long> {

}
