package camt.cbsd.lab08.dao;

import camt.cbsd.lab08.entity.Student;

import java.util.List;

public interface StudentDao {
    List<Student> getStudents();
    Student findById(long id);
    Student addStudent(Student student);
    Integer size();
}
