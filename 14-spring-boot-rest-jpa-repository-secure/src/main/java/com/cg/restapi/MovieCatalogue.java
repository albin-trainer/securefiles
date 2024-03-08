package com.cg.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.cg.model.Movie;
import com.cg.service.MovieService;
@RestController
@RequestMapping("/movies")
public class MovieCatalogue {
	@Autowired
 private MovieService movieService;
 @PostMapping
	public Movie addMovie( @RequestBody Movie m) {
		return movieService.addNewMovieService(m);
	}
 @GetMapping //XML wont work in Arrays
 public List<Movie> listAllMovies(){
	 //call service
	 System.out.println("yes");
	 return movieService.allmoviesService();
 }
 @GetMapping(value =  "/{movieId}",produces = {"application/json","application/xml"} )
 public Movie searchById(@PathVariable("movieId")int mid) {
	 //call service
	 return movieService.searchMovieService(mid);
 }
 @GetMapping(value =  "/search",produces = {"application/json"} )
 public List<Movie> searchByGenre(@RequestParam("genre") String genre) {
	 //call service
	 return movieService.searchByGenreService(genre);
 }

 @GetMapping(value =  "/searchByLang",produces = {"application/json"} )
 public List<Movie> searchByLang(@RequestParam("genre") String lang) {
	 //call service
	 return movieService.searchByLanguageService(lang);
 }
}
