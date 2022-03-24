package ru.dnsosnovskiy.ProjectsAggregator.dto.auth;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class UserAuthRequest {
    private String email;
    private String password;
}
