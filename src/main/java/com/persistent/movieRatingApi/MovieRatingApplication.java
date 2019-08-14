package com.persistent.movieRatingApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
//@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages= {"com.persistent.movieRatingApp.controller"})
public class MovieRatingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieRatingApplication.class, args);
		System.out.println("MovieRatingApplication is up");
	}

}
