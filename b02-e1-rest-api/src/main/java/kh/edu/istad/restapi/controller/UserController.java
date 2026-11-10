package kh.edu.istad.restapi.controller;

import kh.edu.istad.restapi.dto.UserDto;
import kh.edu.istad.restapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<UserDto> getAll(
            @RequestParam(required = false, defaultValue = "") String keyword
    ) {
        return userService.getAll(keyword);
    }

    // Add a new user to data

}
