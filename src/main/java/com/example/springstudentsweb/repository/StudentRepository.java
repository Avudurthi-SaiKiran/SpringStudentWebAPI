package com.example.springstudentsweb.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springstudentsweb.data.entity.Student;


public interface StudentRepository extends CrudRepository<Student, Integer>
{

    Student findById( int id );

}
