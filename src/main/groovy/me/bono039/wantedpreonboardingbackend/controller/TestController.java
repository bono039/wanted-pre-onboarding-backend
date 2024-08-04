package me.bono039.wantedpreonboardingbackend.controller;

import me.bono039.wantedpreonboardingbackend.domain.User;
import me.bono039.wantedpreonboardingbackend.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    TestService ts;

    @GetMapping("/test")
    public List<User> getAllUsers() {
        return ts.getAllUsers();
    }
}
