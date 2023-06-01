package com.example.movieApp.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private Integer userId;
    @Column(name = "email", nullable = false)

    private String email;
    @Column(name = "password", nullable = false)

    private String password;

    @Column(name = "created_at", nullable = false)

    private Date createdAt;
    @Column(name = "role", nullable = false)
    private Role role;

//    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
//    private List<UserMoviesWatched> userMoviesWatchedList;
//
//    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
//    private List<Movie> movies;

    public User() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

//    public List<UserMoviesWatched> getUserMoviesWatchedList() {
//        return userMoviesWatchedList;
//    }
//
//    public void setUserMoviesWatchedList(List<UserMoviesWatched> userMoviesWatchedList) {
//        this.userMoviesWatchedList = userMoviesWatchedList;
//    }
//
//    public List<Movie> getMovies() {
//        return movies;
//    }
//
//    public void setMovies(List<Movie> movies) {
//        this.movies = movies;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "userId=" + userId +
//                ", email='" + email + '\'' +
//                ", password='" + password + '\'' +
//                ", createdAt=" + createdAt +
//                ", role=" + role +
//                ", userMoviesWatchedList=" + userMoviesWatchedList +
//                ", movies=" + movies +
//                '}';
//    }
}
