package com.galvanize.gmdb.gmdb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/movies")
public class MoviesController {



	@Autowired
	private  MovieRepository r;



	public MoviesController(MovieRepository v){
		this.r = v;
	}

	@GetMapping("/show")
	public List<Movies> ViewAllMovies() {
		return r.findAll();
	}

	@PostMapping("/add")
	public String addMovies(@RequestBody Movies m) {
		r.save(m);
		return "New Movie Saved as "+m.getMovieTitle();
	}






}
