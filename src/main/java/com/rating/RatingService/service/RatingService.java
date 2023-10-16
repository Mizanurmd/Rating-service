package com.rating.RatingService.service;

import com.rating.RatingService.entity.Rating;

import java.util.List;

public interface RatingService {
    Rating createtRating(Rating rating);
    List<Rating>listAllRating(Rating rating);
    Rating ratingSingleById(int ratingId);
    void ratingDelete(int ratingId);

    List<Rating>getRatingByUserId(long userId);
    List<Rating>getRatingByhotelId(int hotelId);

}
