package io.noobi.springdemo.service.impl;

import io.noobi.springdemo.model.Student;
import io.noobi.springdemo.repository.StudentRepository;
import io.noobi.springdemo.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

  private final StudentRepository studentRepository;

  public StudentServiceImpl(StudentRepository studentRepository){
    this.studentRepository = studentRepository;
  }

  @Override
  public List<Student> getAllStudents(){
    return studentRepository.findAll();
  }

  @Override
  public Student getStudent(Long id){
    return studentRepository.findById(id).orElse(null);
  }

  @Override
  public void addStudent(Student student){
    studentRepository.save(student);
  }

  @Override
  public void updateStudent(Long id, Student student){
    Student existingStudent = getStudent(id);
    if(existingStudent != null){
      existingStudent.setName(student.getName());
      existingStudent.setDepartment(student.getDepartment());
      existingStudent.setCgpa(student.getCgpa());
      studentRepository.save(existingStudent);
    }
  }

  @Override
  public void deleteStudent(Long id){
    studentRepository.deleteById(id);
  }

}
