package org.notna.studentmanagement.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

	public List<Student> getStudents(){
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(1L,"Tim", "tim@gmail.com", LocalDate.of(2000, Month.SEPTEMBER, 10), 21));
		return studentList;
	}

}

