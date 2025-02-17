package org.example.controller;


import org.example.controller.dto.UserCreateRequest;
import org.example.controller.dto.UserResponse;
import org.example.controller.dto.UserUpdateRequest;
import org.example.entity.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("{id}")
    public UserResponse getUser(@PathVariable("id") int id) {
        return userService.getUser(id);
    }

    @PostMapping
    public UserResponse createUser(@RequestBody UserCreateRequest user) {
        return userService.createUser(user);
    }

    @PutMapping("{id}")
    public UserResponse updateUser(@PathVariable("id") int id, @RequestBody UserUpdateRequest user) {
        return userService.updateUser(id, user);
    }

    @DeleteMapping("{id}")
    public void deleteUser(@PathVariable("id") int id) {
        userService.deleteUser(id);
    }

}
