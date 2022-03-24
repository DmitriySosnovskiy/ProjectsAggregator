package ru.dnsosnovskiy.ProjectsAggregator.controller.organization;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface OrganizationController {
    @GetMapping("/all")
    @ResponseStatus(HttpStatus.ACCEPTED)
    String viewAllOrganizations();
}
