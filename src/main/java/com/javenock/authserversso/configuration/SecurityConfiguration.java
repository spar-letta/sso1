package com.javenock.authserversso.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;

@EnableWebSecurity
@Configuration(proxyBeanMethods = false)
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http
    ) throws Exception {
        return http
            .authorizeHttpRequests(
                authorize -> authorize
                    .anyRequest().authenticated()
            )
            .formLogin(withDefaults())
            .logout((logout) -> logout.permitAll())
            .build();
    }

}
