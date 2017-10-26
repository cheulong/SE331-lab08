package camt.cbsd.lab05.dao;

import camt.cbsd.lab05.entity.Student;

import camt.cbsd.lab05.repository.StudentRespository;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Profile("DBDataSource")
public class StudentDaoDBImpl implements StudentDao {
    StudentRespository studentRepository;
    @Override
    public List<Student> getStudents() {
        return Lists.newArrayList(studentRepository.findAll());
    }

    @Override
    public Student findById(long id) {
        return null;
    }

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Autowired
    public void setStudentRepository(StudentRespository studentRepository){
        this.studentRepository = studentRepository;
    }
    @Override
    public Integer size(){
        return (int)studentRepository.count();
    }

}