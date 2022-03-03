package ru.dnsosnovskiy.ProjectsAggregator.controller.user;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.dnsosnovskiy.ProjectsAggregator.dto.user.UserAddRequest;
import ru.dnsosnovskiy.ProjectsAggregator.dto.user.UserResponse;

import javax.validation.Valid;

public interface UserController {
    @PostMapping("/add")
    UserResponse addUser(@RequestBody UserAddRequest userAddRequest);
}
