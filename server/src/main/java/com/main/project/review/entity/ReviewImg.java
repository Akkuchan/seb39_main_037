package com.main.project.review.entity;

import javax.persistence.*;

@Entity
public class ReviewImg {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long reveiwImgId;

    byte reviewImgFile;

    @ManyToOne
    @JoinColumn(name="review_Id")
    Review review;



}
