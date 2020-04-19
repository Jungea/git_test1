package net.skhu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.skhu.domain.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	List<Student> findByName(String name);

	List<Student> findByNameStartsWith(String name);

	List<Student> findByDepartment_Name(String name);

	List<Student> findByDepartment_NameStartsWith(String name);

	List<Student> findAllByOrderByName();

	List<Student> findAllByOrderByNameDesc();

	List<Student> findByDepartment_IdOrderByNameDesc(int id);
	//order by name은 어디꺼? Student꺼
	
	List<Student> findByDepartment_IdAndDepartment_NameStartsWith(int id, String name);
}
