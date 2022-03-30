package com.example.movieinfo.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
 
import com.example.movieinfo.model.Movie;
import com.example.movieinfo.model.MovieInfo;
 
@RestController
public class MovieInfoController {
 
    @Value("${api.key}")
    private String apiKey;
 
    @Autowired
    private RestTemplate restTemplate;
 
    @GetMapping("/movies/{id}")
	public MovieInfo getMovieInfo(@PathVariable int id) {
		Movie movie = restTemplate.getForObject("https://api.themoviedb.org/3/movie/" + id + "?api_key=" + apiKey,
				Movie.class);
		return new MovieInfo(id, movie.getImdb_id(), movie.getOriginal_title(), movie.getOverview());
	}
}