package com.rating.RatingService.repository;

import com.rating.RatingService.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Integer> {

    // Customer method here for userId and hotelId
    List<Rating> findByUserId(long userId);
    List<Rating> findByHotelId(int hotelId);

}
