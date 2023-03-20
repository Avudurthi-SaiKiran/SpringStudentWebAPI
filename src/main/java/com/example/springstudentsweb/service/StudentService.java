package com.example.springstudentsweb.service;

import com.example.springstudentsweb.data.entity.Student;

public interface StudentService {

	Iterable<Student> all();

    Student get( int studentId );

    Student save( Student student );

    void delete( int studentId );

    
}
