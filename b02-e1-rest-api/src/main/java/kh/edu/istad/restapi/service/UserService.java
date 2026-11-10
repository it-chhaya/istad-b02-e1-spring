package kh.edu.istad.restapi.service;

import kh.edu.istad.restapi.dto.UserAddDto;
import kh.edu.istad.restapi.dto.UserDto;

import java.util.List;

public interface UserService {

    // Define business logic
    UserDto addNew(UserAddDto userAddDto);
    List<UserDto> getAll(String keyword);

}
