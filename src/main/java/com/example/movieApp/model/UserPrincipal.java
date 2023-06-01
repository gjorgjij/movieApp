//package com.example.movieApp.model;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Collections;
//
//public class UserPrincipal implements UserDetails {
//    private String email;
//    private String password;
//
//    private Collection<? extends GrantedAuthority>authorities;
//
//    public UserPrincipal()
//    {
//    }
//
//    public UserPrincipal(User user) {
//        this.email = user.getEmail();
//        this.password = user.getPassword();
//        this.authorities = Collections.singleton(new SimpleGrantedAuthority(user.getRole().toString()));
//    }
//
//    public static UserPrincipal create(User user)
//    {
//        UserPrincipal userPrincipal = new UserPrincipal();
//        userPrincipal.email = user.getEmail();
//        userPrincipal.password = user.getPassword();
//        userPrincipal.authorities = new ArrayList<>();
//        return userPrincipal;
//    }
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return authorities;
//    }
//
//    @Override
//    public String getPassword() {
//        return password;
//    }
//
//    @Override
//    public String getUsername() {
//        return email;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//}
