package io.noobi.springdemo.service;


import io.noobi.springdemo.model.Student;

import java.util.List;

public interface StudentService {
  List<Student> getAllStudents();

  Student getStudent(Long id);

  void addStudent(Student student);

  void updateStudent(Long id,Student student);

  void deleteStudent(Long id);
}
