package ru.dnsosnovskiy.ProjectsAggregator.dto.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Access;

@Data
@AllArgsConstructor
@Accessors(chain = true)
public class UserAddRequest {
    private String email;
    private String password;
    private String firstName;
    private String secondName;
    private String phoneNumber;
}
