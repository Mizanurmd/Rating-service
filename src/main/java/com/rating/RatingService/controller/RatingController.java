package com.rating.RatingService.controller;

import com.rating.RatingService.entity.Rating;
import com.rating.RatingService.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {


    @Autowired
    private RatingService ratingSer;

    ///////// save Rating Controller here ////
    @PostMapping()
    public ResponseEntity<Rating>saveRating(@RequestBody Rating rating){
        Rating r = ratingSer.createtRating(rating);

        return  new ResponseEntity<Rating>(r, HttpStatus.CREATED);
    }

    ///////// Get all Rating Controller here //////

    @GetMapping()
    public ResponseEntity<List<Rating>> getAllRatings(Rating rating){
        List<Rating>allR = ratingSer.listAllRating(rating);
        return  new ResponseEntity<List<Rating>>(allR, HttpStatus.OK);
    }

    ///////// get single Rating controller here ////////////
    @GetMapping("/{id}")
    public ResponseEntity<Rating>getRatingById(@PathVariable("id")int ratingId){
        Rating rId = ratingSer.ratingSingleById(ratingId);
        return  new ResponseEntity<Rating>(rId,HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String>getDeleteRating(@PathVariable("id")int ratingId){
        this.ratingSer.ratingDelete(ratingId);
        return  new ResponseEntity<String>(ratingId+" is deleted.",HttpStatus.OK);
    }

    /////////// geting Rating by calling userId here//////////
    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Rating>>getRatingByUserId(@PathVariable long userId){

        return ResponseEntity.ok(ratingSer.getRatingByUserId(userId));
    }

    /////////// getting Rating by calling hotelId here//////////
    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>>getRatingByhotelId(@PathVariable int hotelId){

        return ResponseEntity.ok(ratingSer.getRatingByhotelId(hotelId));
    }



}
