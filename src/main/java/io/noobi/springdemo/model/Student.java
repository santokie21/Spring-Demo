package io.noobi.springdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String department;
  private double cgpa;

  public Student(){
  }

  public Student(Long id, String name, String department, double cgpa){
    this.id = id;
    this.name = name;
    this.department = department;
    this.cgpa = cgpa;
  }

  public Long getId(){
    return id;
  }

  public void setId(Long rollNumber){
    this.id = rollNumber;
  }

  public String getName(){
    return name;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getDepartment(){
    return department;
  }

  public void setDepartment(String department){
    this.department = department;
  }

  public double getCgpa(){
    return cgpa;
  }

  public void setCgpa(double cgpa){
    this.cgpa = cgpa;
  }

  @Override
  public String toString(){
    return "Student{" +
        "rollNumber=" + id +
        ", name='" + name + '\'' +
        ", department='" + department + '\'' +
        ", cgpa=" + cgpa +
        '}';
  }
}
