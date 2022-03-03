package ru.dnsosnovskiy.ProjectsAggregator.dto.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@Accessors(chain = true)
public class UserResponse {
    private String email;
    private String firstName;
    private String secondName;
    private String phoneNumber;
}
