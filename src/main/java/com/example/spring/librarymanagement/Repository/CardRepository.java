package com.example.spring.librarymanagement.Repository;

import com.example.spring.librarymanagement.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card,Integer> {
}
