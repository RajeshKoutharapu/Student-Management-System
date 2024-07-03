package com.React.SpringBoot.Student_Managment_System.Service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.React.SpringBoot.Student_Managment_System.model.Student;
@Component
public interface InterfaceImplementation {
      public List<Student> getallStudentsdata();
      public Student SaveStudentdata(Student student);
      public Student getStudentById(Integer id);
      public Student UpdateStudent(Student student);
      public void deleteStudentById(Integer id);
}
