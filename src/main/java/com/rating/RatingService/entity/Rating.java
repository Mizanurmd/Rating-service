package com.rating.RatingService.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="user_rating")
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ratingId;
    private Long userId;
    private int hotelId;
    private int rating;
    private String feedback;
    private String remarks;
}
