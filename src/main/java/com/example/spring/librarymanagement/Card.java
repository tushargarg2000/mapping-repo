package com.example.spring.librarymanagement;


import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="card_table")
public class Card {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    private int fine;

    public Card(){


    }

    public Card(int fine){
        this.fine = fine;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    @CreationTimestamp
    private Date createdOn;




}
