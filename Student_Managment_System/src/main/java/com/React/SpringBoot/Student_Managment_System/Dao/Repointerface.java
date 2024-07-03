package com.React.SpringBoot.Student_Managment_System.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.React.SpringBoot.Student_Managment_System.model.Student;

public interface Repointerface extends JpaRepository<Student, Integer> {

}
