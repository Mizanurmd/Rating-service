package com.rating.RatingService.serviceImp;

import com.rating.RatingService.entity.Rating;
import com.rating.RatingService.repository.RatingRepository;
import com.rating.RatingService.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepository ratingRepo;
    @Override
    public Rating createtRating(Rating rating) {
        return ratingRepo.save(rating);
    }

    @Override
    public List<Rating> listAllRating(Rating rating) {
        return ratingRepo.findAll();
    }

    @Override
    public Rating ratingSingleById(int ratingId) {
        return ratingRepo.findById(ratingId).get();
    }

    @Override
    public void ratingDelete(int ratingId) {
        this.ratingRepo.deleteById(ratingId);

    }

    @Override
    public List<Rating> getRatingByUserId(long userId) {
        return ratingRepo.findByUserId(userId);
    }

    @Override
    public List<Rating> getRatingByhotelId(int hotelId) {
        return ratingRepo.findByHotelId(hotelId);
    }


}
