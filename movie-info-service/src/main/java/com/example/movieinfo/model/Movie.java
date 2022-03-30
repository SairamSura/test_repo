package com.example.movieinfo.model;

public class Movie {
	private int id;
	private String imdb_id;
	private String original_title;
	private String overview;

	public Movie(int id, String imdb_id, String original_title, String overview) {
		super();
		this.id = id;
		this.imdb_id = imdb_id;
		this.original_title = original_title;
		this.overview = overview;
	}

	public Movie() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImdb_id() {
		return imdb_id;
	}

	public void setImdb_id(String imdb_id) {
		this.imdb_id = imdb_id;
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
	public void foo() {
	}

}