package me.bono039.wantedpreonboardingbackend.repository;

import me.bono039.wantedpreonboardingbackend.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
