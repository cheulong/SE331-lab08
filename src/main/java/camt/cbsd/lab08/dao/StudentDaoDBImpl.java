package camt.cbsd.lab08.dao;

import camt.cbsd.lab08.entity.Student;
import camt.cbsd.lab08.repository.StudentRepository;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.List;

@Profile("DBDataSource")
@ConfigurationProperties(prefix = "server")
@Repository
public class StudentDaoDBImpl implements StudentDao {
    StudentRepository studentRepository;

    @Autowired
    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

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

    @Override
    public Integer size() {
        return (int) studentRepository.count();
    }
}
