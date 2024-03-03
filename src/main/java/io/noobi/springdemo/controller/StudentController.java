package io.noobi.springdemo.controller;

import io.noobi.springdemo.model.Student;
import io.noobi.springdemo.service.StudentService;
import io.noobi.springdemo.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

  private final StudentService studentService;

  public StudentController(StudentService studentService){
    this.studentService = studentService;
  }

  @GetMapping
  public List<Student> getStudents(){
    return this.studentService.getAllStudents();
  }

  @GetMapping("/{id}")
  public Student getStudent(@PathVariable Long id){
    return this.studentService.getStudent(id);
  }

  @PostMapping
  public void addStudent(@RequestBody Student student){
    this.studentService.addStudent(student);
  }

  @PutMapping("/{id}")
  public void updateStudent(@PathVariable Long id,@RequestBody Student student){
    this.studentService.updateStudent(id,student);
  }

  @DeleteMapping("/{id}")
  public void deleteStudent(@PathVariable Long id){
    this.studentService.deleteStudent(id);
  }
}
