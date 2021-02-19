package org.notna.studentmanagement.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository){
		return args ->{
			Student tim = new Student("Tim", "tim@gmail.com", LocalDate.of(2000, Month.SEPTEMBER, 10));
			Student alex = new Student("Alex", "alex@gmail.com", LocalDate.of(2007, Month.SEPTEMBER, 10));
			repository.saveAll(Arrays.asList(tim,alex));
		};
	}
}


