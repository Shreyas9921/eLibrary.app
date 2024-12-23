package com.library.guardian.elibrary.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

/*
@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/h2-console/**").permitAll() // Allow access to H2 console
                .anyRequest().authenticated() // Secure other endpoints
            )
            .csrf(csrf -> csrf.disable()) // Disable CSRF for simplicity
            .headers(headers -> headers.frameOptions().disable()) // Enable frames for H2 console
            .formLogin(); // Enable form-based login
        
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
*/

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .anyRequest().permitAll() // Allow all requests without authentication
            )
            .csrf(csrf -> csrf.disable()) // Disable CSRF for simplicity
            .headers(headers -> headers.frameOptions().disable()); // Enable frames for H2 console

        return http.build();
    }
}

