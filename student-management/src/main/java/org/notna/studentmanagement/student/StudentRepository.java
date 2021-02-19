package org.notna.studentmanagement.student;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

	//Select * FROM student where email = ?;
	@Query("SELECT s FROM Student s WHRE s.email = ?1")
	Optional<Student> findStudentByEmail(String email);

}
