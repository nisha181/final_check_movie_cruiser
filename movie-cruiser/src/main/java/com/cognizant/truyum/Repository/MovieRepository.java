package com.cognizant.truyum.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.truyum.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

	public List<Movie> findByActiveAndDateOfLaunchLessThan(boolean active,Date dateOfLaunch);   
}
