package com.React.SpringBoot.Student_Managment_System.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.React.SpringBoot.Student_Managment_System.Dao.DaoOperations;
import com.React.SpringBoot.Student_Managment_System.model.Student;
@Component
public class ImplementationClass  implements InterfaceImplementation{
	@Autowired
	DaoOperations dbop;

	@Override
	public List<Student> getallStudentsdata() {
		// TODO Auto-generated method stub
		return dbop.getstudentsdata();
	}

	@Override
	public Student SaveStudentdata(Student student) {
		// TODO Auto-generated method stub
		return dbop.InsertStudentData(student);
	}

	@Override
	public Student getStudentById(Integer id) {
		// TODO Auto-generated method stub
		return dbop.findStudnetByid(id);
	}

	@Override
	public Student UpdateStudent(Student student) {
		// TODO Auto-generated method stub
		return dbop.updateStudentdata(student);
		
	}

	@Override
	public void deleteStudentById(Integer id) {
		// TODO Auto-generated method stub
		dbop.delatestudentdata(id);
	}
   
	
}
