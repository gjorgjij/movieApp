//package com.example.movieApp.model;
//
//import com.example.movieApp.model.Movie;
//import com.example.movieApp.model.User;
//import com.example.movieApp.model.UserMoviePrimaryKey;
//
//import javax.persistence.*;
//import java.util.Date;
//
//@Entity
//@Table(name = "user_movies")
//@IdClass(UserMoviePrimaryKey.class)
//public class UserMoviesWatched {
//    @Id
//    @ManyToOne
//    @JoinColumn(name = "user_id", nullable = false)
//    private User user;
//
//    @Id
//    @ManyToOne
//    @JoinColumn(name = "movie_id", nullable = false)
//    private Movie movie;
//
//    @Column(name = "created_at")
//    private Date createdAt;
//
//    public UserMoviesWatched() {
//    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    public Movie getMovie() {
//        return movie;
//    }
//
//    public void setMovie(Movie movie) {
//        this.movie = movie;
//    }
//
//    public Date getCreatedAt() {
//        return createdAt;
//    }
//
//    public void setCreatedAt(Date createdAt) {
//        this.createdAt = createdAt;
//    }
//
//    @Override
//    public String toString() {
//        return "UserMoviesWatched{" +
//                "user=" + user +
//                ", movie=" + movie +
//                ", createdAt=" + createdAt +
//                '}';
//    }
//}
