package org.notna.studentmanagement;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.notna.studentmanagement.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StudentManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@GetMapping
	public List<Student> hello(){
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(1L,"Tim", "tim@gmail.com", LocalDate.of(2000, Month.SEPTEMBER, 10), 21));
		return studentList;
	}

}
