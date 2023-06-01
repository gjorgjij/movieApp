//package com.example.movieApp.model;
//
//import com.example.movieApp.model.Movie;
//import com.example.movieApp.model.User;
//
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import java.io.Serializable;
//
//public class UserMoviePrimaryKey implements Serializable {
//    @ManyToOne
//    @JoinColumn(name = "user_id", nullable = false)
//    private User user;
//
//    @ManyToOne
//    @JoinColumn(name = "movie_id", nullable = false)
//    private Movie movie;
//
//    public UserMoviePrimaryKey() {
//    }
//
//    public UserMoviePrimaryKey(User user, Movie movie) {
//        this.user = user;
//        this.movie = movie;
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
//}
