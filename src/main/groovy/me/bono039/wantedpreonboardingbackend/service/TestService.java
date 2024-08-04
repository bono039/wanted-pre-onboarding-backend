package me.bono039.wantedpreonboardingbackend.service;

import me.bono039.wantedpreonboardingbackend.domain.User;
import me.bono039.wantedpreonboardingbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    // 빈 주입
    @Autowired
    UserRepository ur;

    // 사용자 목록 얻기
    public List<User> getAllUsers() {
        return ur.findAll();
    }
}
