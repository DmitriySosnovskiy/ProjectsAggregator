package ru.dnsosnovskiy.ProjectsAggregator.controller.organization;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/organizations")
@RestController
public class OrganizationControllerImpl implements OrganizationController {
    @Override
    public String viewAllOrganizations() {
        return "Hello, I am organizations list";
    }
}
