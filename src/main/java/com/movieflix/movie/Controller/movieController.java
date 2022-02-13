package com.movieflix.movie.Controller;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.movieflix.movie.entity.Movie;
import com.movieflix.movie.repository.MovieRepository;

@RestController
@CrossOrigin(origins="http://localhost:3000/")
public class movieController {

	
	@Autowired
	private MovieRepository movieRepository;

	@GetMapping("/movies")
	public List<Movie> getMovies(){
		List<Movie> allMovies = (List<Movie>) movieRepository.findAll();
		return allMovies;
	}
	
	@GetMapping("/movies/{title}")
	public Movie getMoviesByTitle(@PathVariable(value = "title") String title){
		return movieRepository.findByTitle(title);
		
	}
		
	@GetMapping("movies/filterRating/{rating}")
	public List<Movie> getMoviesFilterByRating(@PathVariable(value = "rating") int rating){
		List<Movie> m = movieRepository.findMovieByRating(rating);
		return m;
	}
	
	
	@GetMapping("movies/filterGenre/{genre}")
	public List<Movie> getMoviesFilterByGenre(@PathVariable(value = "genre") String genre){
		List<Movie> m = movieRepository.findMovieByGenre(genre);
		return m;
	}
	
	@GetMapping("/movies/number")
	public HashMap<String,Integer> getNumber(){
		HashMap<String, Integer> map = new HashMap<>();
		List<Movie> m = movieRepository.findMovieByGenre("Action");
		map.put("Action",m.size());
		List<Movie> n = movieRepository.findMovieByGenre("Adventure");
		map.put("Adventure",n.size());
		List<Movie> o = movieRepository.findMovieByGenre("Fantasy");
		map.put("Fantasy",o.size());
		List<Movie> p = movieRepository.findMovieByGenre("Science Fiction");
		map.put("Science Fiction",p.size());
		List<Movie> q = movieRepository.findMovieByGenre("Crime");
		map.put("Action",q.size());
		List<Movie> r = movieRepository.findMovieByGenre("Drama");
		map.put("Drama",r.size());
		List<Movie> s = movieRepository.findMovieByGenre("Thriller");
		map.put("Thriller",s.size());
		List<Movie> t = movieRepository.findMovieByGenre("Animation");
		map.put("Animation",t.size());
		List<Movie> u = movieRepository.findMovieByGenre("Family");
		map.put("Family",u.size());
		
		return map;
			
	}
	
	@GetMapping("/movies/budget")
	public HashMap<String,Long> getBudget(){
		HashMap<String, Long> map = new HashMap<>();
		
		Long actionBudget=(long) 0;
		List<Movie> m = movieRepository.findMovieByGenre("Action");
		for(Movie movie : m) {
			actionBudget += movie.getBudget();
		}
		map.put("Action",actionBudget);
		
		Long advBudget = (long) 0;
		List<Movie> n = movieRepository.findMovieByGenre("Adventure");
		for(Movie movie:n) {
			advBudget += movie.getBudget();
		}
		map.put("Adventure",advBudget);
		
		Long fanBudget = (long) 0;
		List<Movie> o = movieRepository.findMovieByGenre("Fantasy");
		for(Movie movie : o) {
			fanBudget += movie.getBudget();
		}
		map.put("Fantasy",fanBudget);
		
		Long sciFiBudget = (long) 0;
		List<Movie> p = movieRepository.findMovieByGenre("Science Fiction");
		for(Movie movie : p) {
			sciFiBudget += movie.getBudget();
		}
		map.put("Science Fiction",sciFiBudget);
		
		Long crimeBudget = (long) 0;
		List<Movie> q = movieRepository.findMovieByGenre("Crime");
		for(Movie movie: q) {
			crimeBudget += movie.getBudget();
		}
		map.put("Crime",crimeBudget);
		
		Long dramaBudget = (long) 0;
		List<Movie> r = movieRepository.findMovieByGenre("Drama");
		for(Movie movie: r) {
			dramaBudget += movie.getBudget();
		}
		map.put("Drama",dramaBudget);
		
		Long thrillBudget = (long) 0;
		List<Movie> s = movieRepository.findMovieByGenre("Thriller");
		for(Movie movie: s) {
			thrillBudget += movie.getBudget();
		}
		map.put("Thriller",thrillBudget);
		
		Long animBudget = (long) 0;
		List<Movie> t = movieRepository.findMovieByGenre("Animation");
		for(Movie movie:t) {
			animBudget += movie.getBudget();
		}
		map.put("Animation",animBudget);
		
		Long familyBudget = (long) 0;
		List<Movie> u = movieRepository.findMovieByGenre("Family");
		for(Movie movie:u) {
			familyBudget += movie.getBudget();
		}
		map.put("Family",familyBudget);
		
		return map;
			
	}
	
	
	@GetMapping("/movies/revenue")
	public HashMap<String,Long> getRevenue(){
		HashMap<String, Long> map = new HashMap<>();
		
		Long actionRevenue=(long) 0;
		List<Movie> m = movieRepository.findMovieByGenre("Action");
		for(Movie movie : m) {
			actionRevenue += movie.getRevenue();
		}
		map.put("Action",actionRevenue);
		
		Long advRevenue = (long) 0;
		List<Movie> n = movieRepository.findMovieByGenre("Adventure");
		for(Movie movie:n) {
			advRevenue += movie.getRevenue();
		}
		map.put("Adventure",advRevenue);
		
		Long fanRevenue = (long) 0;
		List<Movie> o = movieRepository.findMovieByGenre("Fantasy");
		for(Movie movie : o) {
			fanRevenue += movie.getRevenue();
		}
		map.put("Fantasy",fanRevenue);
		
		Long sciFiRevenue = (long) 0;
		List<Movie> p = movieRepository.findMovieByGenre("Science Fiction");
		for(Movie movie : p) {
			sciFiRevenue += movie.getRevenue();
		}
		map.put("Science Fiction",sciFiRevenue);
		
		Long crimeRevenue = (long) 0;
		List<Movie> q = movieRepository.findMovieByGenre("Crime");
		for(Movie movie: q) {
			crimeRevenue += movie.getRevenue();
		}
		map.put("Crime",crimeRevenue);
		
		Long dramaRevenue = (long) 0;
		List<Movie> r = movieRepository.findMovieByGenre("Drama");
		for(Movie movie: r) {
			dramaRevenue += movie.getRevenue();
		}
		map.put("Drama",dramaRevenue);
		
		Long thrillRevenue = (long) 0;
		List<Movie> s = movieRepository.findMovieByGenre("Thriller");
		for(Movie movie: s) {
			thrillRevenue += movie.getRevenue();
		}
		map.put("Thriller",thrillRevenue);
		
		Long animRevenue = (long) 0;
		List<Movie> t = movieRepository.findMovieByGenre("Animation");
		for(Movie movie:t) {
			animRevenue += movie.getRevenue();
		}
		map.put("Animation",animRevenue);
		
		Long familyRevenue = (long) 0;
		List<Movie> u = movieRepository.findMovieByGenre("Family");
		for(Movie movie:u) {
			familyRevenue += movie.getRevenue();
		}
		map.put("Family",familyRevenue);
		
		return map;
			
	}	
	

	
	
}		
