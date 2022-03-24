package ru.dnsosnovskiy.ProjectsAggregator.config;


import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AuthenticationEntryPointImpl implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response,
                         AuthenticationException authenticationException) throws IOException {
        response.setContentType("application/json");
        response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        response.getOutputStream().println(
                "{\n" +
                        "  \"status\" : \"FAIL\",\n" +
                        "  \"error\" : {\n" +
                        "  \"code\" : \"no.session\",\n" +
                        "  \"description\" : \"User authentication is required\",\n" +
                        "  \"message\" : \"You need to authenticate\"\n" +
                        "  }\n" +
                        "}");
    }
}
