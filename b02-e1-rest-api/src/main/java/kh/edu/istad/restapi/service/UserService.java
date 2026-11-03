package kh.edu.istad.restapi.service;

import kh.edu.istad.restapi.model.User;

import java.util.List;

public interface UserService {

    // Define business logic
    List<User> getAll(String keyword);

}
