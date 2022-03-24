package ru.dnsosnovskiy.ProjectsAggregator.entity.user;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
public class UserAuth {
    @NonNull private Long id;
    @NonNull private String email;
    @NonNull private String password;
}
