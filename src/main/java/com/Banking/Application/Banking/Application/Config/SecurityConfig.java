package com.Banking.Application.Banking.Application.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

public class SecurityConfig {
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .sessionManagement(management->management.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests(authorization->authorization
                        .requestMatchers("/api/login/**").hasAnyRole("users")
                                .requestMatchers("/api/**")
                                .authenticated()
                                .anyRequest().permitAll()
                        ).csrf(csrf->csrf.disable());

        return http.build();
    }
}

