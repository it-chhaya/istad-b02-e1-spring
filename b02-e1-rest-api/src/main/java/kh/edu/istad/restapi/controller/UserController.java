package kh.edu.istad.restapi.controller;

import kh.edu.istad.restapi.dto.UserAddDto;
import kh.edu.istad.restapi.dto.UserDto;
import kh.edu.istad.restapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    // Add a new user to data
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public UserDto addNew(@RequestBody UserAddDto userAddDto) {
        return userService.addNew(userAddDto);
    }


    @GetMapping
    public List<UserDto> getAll(
            @RequestParam(required = false, defaultValue = "") String keyword
    ) {
        return userService.getAll(keyword);
    }
}
