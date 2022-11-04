package com.example.spring.librarymanagement.Repository;

import com.example.spring.librarymanagement.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
