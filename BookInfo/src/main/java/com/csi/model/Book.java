package com.csi.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Book {
    @Id
    @GeneratedValue
    private long bookId;
    private String bookName;
    private String authorName;
    private double bookPrice;


}
