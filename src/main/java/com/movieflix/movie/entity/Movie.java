package com.movieflix.movie.entity;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "movies")
public class Movie {
	@Id
	private ObjectId _id;
	private Long id;
	private Long budget;
	private String genres;
	private String homepage;
	private String keywords;
	private String original_language;
	private String original_title;
	private String overview;
	private Float popularity;
	private String production_companies;
	private String production_countries;
    private Date release_date;
	
	private Long revenue;
	private Long runtime;
	private String status;
	private String tagline;
	private String title;
	private Float vote_average;
	private Long vote_count;
	
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(ObjectId _id, Long id, Long budget, String genres, String homepage, String keywords,
			String original_language, String original_title, String overview, Float popularity,
			String production_companies, String production_countries, Date release_date, Long revenue, Long runtime,
			String status, String tagline, String title, Float vote_average, Long vote_count) {
		super();
		this._id = _id;
		this.id = id;
		this.budget = budget;
		this.genres = genres;
		this.homepage = homepage;
		this.keywords = keywords;
		this.original_language = original_language;
		this.original_title = original_title;
		this.overview = overview;
		this.popularity = popularity;
		this.production_companies = production_companies;
		this.production_countries = production_countries;
		this.release_date = release_date;
		this.revenue = revenue;
		this.runtime = runtime;
		this.status = status;
		this.tagline = tagline;
		this.title = title;
		this.vote_average = vote_average;
		this.vote_count = vote_count;
	}

	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBudget() {
		return budget;
	}

	public void setBudget(Long budget) {
		this.budget = budget;
	}

	public String getGenres() {
		return genres;
	}

	public void setGenres(String genres) {
		this.genres = genres;
	}

	public String getHomepage() {
		return homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getOriginal_language() {
		return original_language;
	}

	public void setOriginal_language(String original_language) {
		this.original_language = original_language;
	}

	public String getOriginal_title() {
		return original_title;
	}

	public void setOriginal_title(String original_title) {
		this.original_title = original_title;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public Float getPopularity() {
		return popularity;
	}

	public void setPopularity(Float popularity) {
		this.popularity = popularity;
	}

	public String getProduction_companies() {
		return production_companies;
	}

	public void setProduction_companies(String production_companies) {
		this.production_companies = production_companies;
	}

	public String getProduction_countries() {
		return production_countries;
	}

	public void setProduction_countries(String production_countries) {
		this.production_countries = production_countries;
	}

	public Date getRelease_date() {
		return release_date;
	}

	public void setRelease_date(Date release_date) {
		this.release_date = release_date;
	}

	public Long getRevenue() {
		return revenue;
	}

	public void setRevenue(Long revenue) {
		this.revenue = revenue;
	}

	public Long getRuntime() {
		return runtime;
	}

	public void setRuntime(Long runtime) {
		this.runtime = runtime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTagline() {
		return tagline;
	}

	public void setTagline(String tagline) {
		this.tagline = tagline;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Float getVote_average() {
		return vote_average;
	}

	public void setVote_average(Float vote_average) {
		this.vote_average = vote_average;
	}

	public Long getVote_count() {
		return vote_count;
	}

	public void setVote_count(Long vote_count) {
		this.vote_count = vote_count;
	}
	
}
	