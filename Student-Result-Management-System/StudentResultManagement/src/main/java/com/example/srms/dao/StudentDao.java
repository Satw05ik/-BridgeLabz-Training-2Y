package com.example.srms.dao;

import com.example.srms.model.Student;

import java.util.List;

public interface StudentDao {
    boolean addStudent(Student student);
    Student findById(int studentId);
    List<Student> findAll();
    boolean updateStudent(Student student);
    boolean deleteStudent(int studentId);
}
