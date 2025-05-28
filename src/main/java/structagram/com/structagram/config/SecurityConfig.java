package structagram.com.structagram.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable() // Disable CSRF for simplicity; enable in production with proper config
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/users/register").permitAll()  // Allow public access to register endpoint
                .anyRequest().authenticated()  // All other endpoints require authentication
            )
            .httpBasic();  // Use HTTP Basic authentication for simplicity

        return http.build();
    }
}
