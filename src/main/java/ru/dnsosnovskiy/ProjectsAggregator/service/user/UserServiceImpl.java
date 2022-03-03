package ru.dnsosnovskiy.ProjectsAggregator.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.dnsosnovskiy.ProjectsAggregator.entity.user.User;
import ru.dnsosnovskiy.ProjectsAggregator.repository.user.UserRepository;

@Service
public class UserServiceImpl {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User addUser(User newUser) {
        return userRepository.saveAndFlush(newUser);
    }
}
