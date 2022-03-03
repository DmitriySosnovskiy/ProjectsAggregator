package ru.dnsosnovskiy.ProjectsAggregator.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.dnsosnovskiy.ProjectsAggregator.dto.user.UserAddRequest;
import ru.dnsosnovskiy.ProjectsAggregator.dto.user.UserResponse;
import ru.dnsosnovskiy.ProjectsAggregator.entity.user.User;
import ru.dnsosnovskiy.ProjectsAggregator.service.user.UserServiceImpl;

@RequestMapping("/users")
@RestController
public class UserControllerImpl implements UserController {
    @Autowired
    UserServiceImpl userService;

    @Override
    public UserResponse addUser(UserAddRequest  userAddRequest) {
        User newUser = new User()
                .setPassword(userAddRequest.getPassword())
                .setEmail(userAddRequest.getEmail())
                .setFirstName(userAddRequest.getFirstName())
                .setSecondName(userAddRequest.getSecondName())
                .setPhoneNumber(userAddRequest.getPhoneNumber());

        userService.addUser(newUser);

        return new UserResponse(newUser.getEmail(),
                newUser.getFirstName(),
                newUser.getSecondName(),
                newUser.getPhoneNumber());
    }
}
