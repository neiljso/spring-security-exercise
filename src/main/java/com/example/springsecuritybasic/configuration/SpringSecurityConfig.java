package com.example.springsecuritybasic.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((requests) -> ((AuthorizeHttpRequestsConfigurer.AuthorizedUrl)
                requests.requestMatchers("/accounts/**", "/balances/**", "/cards/**", "/loans/**")).authenticated());
        http.authorizeHttpRequests((requests) -> ((AuthorizeHttpRequestsConfigurer.AuthorizedUrl)
                requests.requestMatchers("/notices", "/welcome")).permitAll());
        http.formLogin(Customizer.withDefaults());
        http.httpBasic(Customizer.withDefaults());
        return http.build();
    }
}
