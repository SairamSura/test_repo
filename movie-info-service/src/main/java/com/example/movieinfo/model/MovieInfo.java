package com.example.movieinfo.model;

public class MovieInfo {

	private int movieId;
	private String imdbId;
	private String title;
	private String overview;

	public MovieInfo(int movieId, String imdbId, String title, String overview) {
		super();
		this.movieId = movieId;
		this.imdbId = imdbId;
		this.title = title;
		this.overview = overview;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getImdbId() {
		return imdbId;
	}

	public void setImdbId(String imdbId) {
		this.imdbId = imdbId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public MovieInfo() {
		super();
	}

}