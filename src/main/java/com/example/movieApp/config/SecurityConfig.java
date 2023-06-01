package com.example.movieApp.config;

import com.example.movieApp.model.Role;
import com.example.movieApp.service.UserInfoDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig {
//    private final UserInfoDetailsService userInfoDetailsService;
//    @Autowired
//    public SecurityConfig(UserInfoDetailsService userInfoDetailsService) {
//        this.userInfoDetailsService = userInfoDetailsService;
//    }
//
    @Bean
    //authentication
    public UserDetailsService userDetailsService(PasswordEncoder encoder){
//    public UserDetailsService userDetailsService(){
        UserDetails admin = User.withUsername("adminUser@gmail.com")
                .password(encoder.encode("pass"))
                .roles(String.valueOf(Role.ADMIN))
                .build();

        UserDetails user = User.withUsername("userUser@gmail.com")
                .password(encoder.encode("pass"))
                .roles(String.valueOf(Role.USER))
                .build();

        return new InMemoryUserDetailsManager(admin,user);
//        return new UserInfoDetailsService();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception{
        return authenticationConfiguration.getAuthenticationManager();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeHttpRequests()
                .antMatchers("/api/v1/login").permitAll()
                .antMatchers("/api/v1/logout").permitAll()
                .antMatchers("/api/v1/register").permitAll()
                .and()
                .authorizeHttpRequests()
                .antMatchers("/api/v1/greetings/say-good-bye")
                .authenticated()
                .and().formLogin()
                .loginPage("/login.html")
                .failureUrl("/login-error.html")
                .and()
                .logout()
                .logoutSuccessUrl("/index.html");;

        return http.build();
    }
//
//    @Bean
//    public AuthenticationProvider authenticationProvider(){
//        DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
//        authenticationProvider.setUserDetailsService(userInfoDetailsService);
//        authenticationProvider.setPasswordEncoder(passwordEncoder());
//        return authenticationProvider;
//    }
}
