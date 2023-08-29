package com.example.MothersMilk.Controller;
import com.example.MothersMilk.Model.Ratings;
import com.example.MothersMilk.Services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/rating")
public class RatingsController {

    private final RatingService ratingService;
    @Autowired
    public RatingsController(RatingService ratingService){
        this.ratingService=ratingService;
    }
    @PostMapping
    public ResponseEntity<Ratings> saveRating(@RequestBody Ratings ratings) {
        Ratings ratings1 = ratingService.insert(ratings);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Rating", "/api/v1/rating/" + ratings1.getRatingId().toString());
        return new ResponseEntity<>(ratings1, httpHeaders, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<Ratings>> getRatings() {
        List<Ratings> ratings = ratingService.getRatings();
        return new ResponseEntity<>(ratings, HttpStatus.OK);
    }
}
