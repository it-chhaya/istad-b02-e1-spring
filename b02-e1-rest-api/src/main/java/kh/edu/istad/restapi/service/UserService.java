package kh.edu.istad.restapi.service;

import kh.edu.istad.restapi.dto.UserAddDto;
import kh.edu.istad.restapi.dto.UserDto;

import java.util.List;
import java.util.UUID;

public interface UserService {

    // Define business logic
    void deleteById(UUID id);


    // 0. What is your logic?
    // 1. Return type តើត្រូវប្រគល់ទិន្នន័យអ្វីត្រឡប់មកវិញ?
    // 2. Parameter type
    UserDto getById(UUID id);

    UserDto addNew(UserAddDto userAddDto);

    List<UserDto> getAll(String keyword);

}
