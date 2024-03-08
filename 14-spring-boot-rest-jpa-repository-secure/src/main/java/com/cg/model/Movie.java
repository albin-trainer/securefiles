package com.cg.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement 
public class Movie {
	@Id
private int movieId;
private String movieName;
private String genre;
private String language;
public int getMovieId() {
	return movieId;
}
public void setMovieId(int movieId) {
	this.movieId = movieId;
}
public String getMovieName() {
	return movieName;
}
public void setMovieName(String movieName) {
	this.movieName = movieName;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public String getLanguage() {
	return language;
}
public void setLanguage(String language) {
	this.language = language;
}

}
