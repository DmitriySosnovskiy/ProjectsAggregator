package ru.dnsosnovskiy.ProjectsAggregator.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.dnsosnovskiy.ProjectsAggregator.entity.user.User;
import ru.dnsosnovskiy.ProjectsAggregator.entity.user.UserAuth;
import ru.dnsosnovskiy.ProjectsAggregator.repository.user.UserRepository;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Autowired
    public PasswordEncoder passwordEncoder;

    public User addUser(User newUser) {
        return userRepository.saveAndFlush(newUser);
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        final User user = userRepository.findByEmail(email);
        if(user == null) throw new UsernameNotFoundException(email);

        final String password = passwordEncoder.encode(user.getPassword());

        return new org.springframework.security.core.userdetails.User(
                user.getEmail(),
                user.getPassword(),
                true,
                true,
                true,
                true,
                Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"))
        );
    }
}
