//package com.example.movieApp.model;
//
//import javax.persistence.*;
//import java.util.Date;
//import java.util.List;
//
//@Entity
//@Table(name = "movies")
//public class Movie {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "movie_id", nullable = false)
//    private Integer movieId;
//
//    @Column(name = "title", nullable = false)
//    private String title;
//    @Column(name = "genre", nullable = false)
//    private String genre;
//    @Column(name = "year", nullable = false)
//    private Integer year;
//
//    @Column(name = "duration_in_minutes")
//    private Integer durationInMinutes;
//
//    @Column(name = "rating")
//    private Double rating;
//
//    @Column(name = "release_date")
//    private Date releaseDate;
//
//    @Column(name = "created_at")
//    private Date createdAt;
//
//    @Column(name = "image", nullable = false, length = 10000000)
//    private String image;
//
//    @Id
//    @ManyToOne
//    @JoinColumn(name = "user_id", nullable = false)
//    private User user;
//
//    @OneToMany(mappedBy = "movie", fetch = FetchType.EAGER)
//    private List<UserMoviesWatched> userMoviesWatchedList;
//
//    public Movie() {
//    }
//
//    public Integer getMovieId() {
//        return movieId;
//    }
//
//    public void setMovieId(Integer movieId) {
//        this.movieId = movieId;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getGenre() {
//        return genre;
//    }
//
//    public void setGenre(String genre) {
//        this.genre = genre;
//    }
//
//    public Integer getYear() {
//        return year;
//    }
//
//    public void setYear(Integer year) {
//        this.year = year;
//    }
//
//    public Integer getDurationInMinutes() {
//        return durationInMinutes;
//    }
//
//    public void setDurationInMinutes(Integer durationInMinutes) {
//        this.durationInMinutes = durationInMinutes;
//    }
//
//    public Double getRating() {
//        return rating;
//    }
//
//    public void setRating(Double rating) {
//        this.rating = rating;
//    }
//
//    public Date getReleaseDate() {
//        return releaseDate;
//    }
//
//    public void setReleaseDate(Date releaseDate) {
//        this.releaseDate = releaseDate;
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
//    public String getImage() {
//        return image;
//    }
//
//    public void setImage(String image) {
//        this.image = image;
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
//    public List<UserMoviesWatched> getUserMoviesWatchedList() {
//        return userMoviesWatchedList;
//    }
//
//    public void setUserMoviesWatchedList(List<UserMoviesWatched> userMoviesWatchedList) {
//        this.userMoviesWatchedList = userMoviesWatchedList;
//    }
//
//    @Override
//    public String toString() {
//        return "Movie{" +
//                "movieId=" + movieId +
//                ", title='" + title + '\'' +
//                ", genre='" + genre + '\'' +
//                ", year=" + year +
//                ", durationInMinutes=" + durationInMinutes +
//                ", rating=" + rating +
//                ", releaseDate=" + releaseDate +
//                ", createdAt=" + createdAt +
//                ", image='" + image + '\'' +
//                ", user=" + user +
//                ", userMoviesWatchedList=" + userMoviesWatchedList +
//                '}';
//    }
//}
//
