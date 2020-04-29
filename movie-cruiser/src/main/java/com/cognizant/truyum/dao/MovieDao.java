package com.cognizant.truyum.dao;
import java.util.List;

import com.cognizant.truyum.model.Movie;

public interface MovieDao {
	public List<Movie> getMovieListAdmin();

	public List<Movie> getMovieListCustomer();

	public void modifyMovie(Movie movie);

	public Movie getMovie(long movieId);
}
