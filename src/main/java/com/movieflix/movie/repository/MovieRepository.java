package com.movieflix.movie.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.movieflix.movie.entity.Movie;

public interface MovieRepository extends MongoRepository<Movie, Integer>{

	 @Query("{'title': ?0}")   
	Movie findByTitle(String title);
	 
	 @Query("{'vote_average':{$gte : ?0}}")
	 List<Movie> findMovieByRating(int rating);

//	 @Query("{'release_date' :{$gte : ?0}}")
//	 List<Movie> findMovieByDate(String date);

	 @Query("{'genres':{$regex : ?0}}")
	 List<Movie> findMovieByGenre(String genre);
	 

}
