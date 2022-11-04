package com.example.spring.librarymanagement;

import com.example.spring.librarymanagement.Repository.CardRepository;
import com.example.spring.librarymanagement.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LibraryManagementApplication.class, args);
	}

	@Autowired
	CardRepository cardRepository;

	@Autowired
	StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {

		//Run automatically when the application starts

		Student student = new Student("Piyush",22,"Australia");

		Card card = new Card();

		student.setCard(card); //Filling the information

		int amount = student.getCard().getFine();


		cardRepository.save(card);


		studentRepository.save(student);

	}
}
