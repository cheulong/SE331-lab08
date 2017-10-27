package camt.cbsd.lab05.repository;

import camt.cbsd.lab05.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRespository extends CrudRepository<Student,Long> {
    Student findById(long id);
}
