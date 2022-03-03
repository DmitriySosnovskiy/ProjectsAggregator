package ru.dnsosnovskiy.ProjectsAggregator.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dnsosnovskiy.ProjectsAggregator.entity.user.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
