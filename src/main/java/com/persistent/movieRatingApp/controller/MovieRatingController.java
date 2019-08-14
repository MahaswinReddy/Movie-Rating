package com.persistent.movieRatingApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieRatingController {
@RequestMapping("/rating")
	public int getRating() {
	return 2;
}
}
