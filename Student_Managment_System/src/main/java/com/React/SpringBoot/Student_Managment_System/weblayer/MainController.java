package com.React.SpringBoot.Student_Managment_System.weblayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.React.SpringBoot.Student_Managment_System.Service.InterfaceImplementation;
import com.React.SpringBoot.Student_Managment_System.model.Student;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:5173/")
public class MainController {
	@Autowired
	InterfaceImplementation implementation;
	
	@GetMapping("/Students")
	public ResponseEntity<List<Student>> getallStudents(){
     	List<Student> list=implementation.getallStudentsdata();
		return new ResponseEntity<List<Student>>(list,HttpStatus.OK);
	}
	
	@PostMapping("/Student")
	public ResponseEntity<Student> SaveStudent(@RequestBody Student student){
		Student data=implementation.SaveStudentdata(student);
		return new ResponseEntity<Student>(data,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/Student/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable Integer id){
	        return new ResponseEntity<Student>(implementation.getStudentById(id),HttpStatus.OK);
	}
	
	@PutMapping("/Student/{id}")
	public ResponseEntity<Student> UpdateStudentData(@PathVariable Integer id,@RequestBody Student student){
		Student studentdata=implementation.getStudentById(id);
		studentdata.setName(student.getName());
		studentdata.setClassName(student.getClassName());
		studentdata.setAddress(student.getAddress());
		studentdata.setEmail(student.getEmail());
		studentdata.setFathersName(student.getFathersName());
		studentdata.setPhoneNumber(student.getPhoneNumber());
		
		Student updated=implementation.UpdateStudent(studentdata);
		return new ResponseEntity<Student>(updated,HttpStatus.OK);
		
	}
	@DeleteMapping("/Student/{id}")
	public ResponseEntity<Student> deleteStudnetdataById(@PathVariable Integer id){
		implementation.deleteStudentById(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
