package com.hamza.school.repositories.students;

import com.hamza.school.domain.Student;

import java.util.List;

public interface StudentRepository {

    List<Student> getAll();

    Student get(String id);

    void add(Student item);

    void update(Student item);

    boolean delete(Student item);
}