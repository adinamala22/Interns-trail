package com.example.MothersMilk.Services;

import com.example.MothersMilk.Model.Ratings;

import java.util.List;

public interface RatingService {
    List<Ratings> getRatings();

    Ratings insert(Ratings rating);

}
