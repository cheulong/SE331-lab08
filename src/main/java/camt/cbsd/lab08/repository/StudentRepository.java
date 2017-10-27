package camt.cbsd.lab08.repository;

import camt.cbsd.lab08.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository <Student,Long> {
}
