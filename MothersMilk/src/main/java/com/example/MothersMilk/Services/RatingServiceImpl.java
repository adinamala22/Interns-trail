package com.example.MothersMilk.Services;
import com.example.MothersMilk.Model.Ratings;
import com.example.MothersMilk.Repository.RatingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {
    private final RatingsRepository ratingsRepository;

    @Autowired
    public RatingServiceImpl(RatingsRepository ratingsRepository) {
        this.ratingsRepository = ratingsRepository;
    }

    @Override
    public List<Ratings> getRatings() {
        return new ArrayList<>(ratingsRepository.findAll());
    }

    @Override
    public Ratings insert(Ratings rating) {
        return ratingsRepository.save(rating);
    }
}


