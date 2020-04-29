package com.cognizant.truyum;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.truyum.model.Movie;
import com.cognizant.truyum.service.MovieService;
import com.cognizant.truyum.util.DateUtil;

public class App {
	@Autowired
	static MovieService movieService;
	private static ApplicationContext context;
    public static void main( String[] args ){
    	context = new ClassPathXmlApplicationContext("spring-config.xml");
    	movieService = context.getBean(MovieService.class);
    	
    	Movie movie = new Movie(1, "The Martian", "$2,514,512,988", true, 
				DateUtil.convertToDate("16/08/2022"), "Fiction", false);
		movieService.modifyMovie(movie);
		List<Movie> movies = movieService.getMovieListAdmin();
		
    }
}
