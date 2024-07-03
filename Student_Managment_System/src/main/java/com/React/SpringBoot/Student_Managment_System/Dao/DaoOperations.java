package com.React.SpringBoot.Student_Managment_System.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.React.SpringBoot.Student_Managment_System.model.Student;

@Component
public class DaoOperations {
	@Autowired
    Repointerface repo;
	
	public List<Student> getstudentsdata(){
		 return repo.findAll();
	}
	public Student InsertStudentData(Student student) {
		return repo.save(student);
	}
    public Student findStudnetByid(Integer id) {
    Optional<Student> student=repo.findById(id);
    return student.get();
    }
    public Student updateStudentdata(Student student) {
    	return repo.save(student);
    }
    public void delatestudentdata(Integer id) {
         repo.deleteById(id);
    }
}
