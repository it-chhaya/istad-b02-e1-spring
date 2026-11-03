package kh.edu.istad.restapi.controller;

import kh.edu.istad.restapi.model.User;
import kh.edu.istad.restapi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @GetMapping
    public List<User> getAll(
            @RequestParam(required = false, defaultValue = "") String keyword
    ) {
        return userRepository.select()
                .stream()
                .filter(user -> user.fullName().toLowerCase()
                        .contains(keyword.toLowerCase())
                )
                .toList();
    }

}
