package MySpringBoot2Dbase.src.main.java.ru.shilov.MySpringBoot2Dbase.dao;

import org.springframework.stereotype.Repository;
import ru.shilov.MySpringBoot2Dbase.entity.Student;

import java.util.List;

@Repository
public interface StudentDAO {
    List<Student> getAllStudents();

    Student saveStudent (Student student);

    Student getStudent(int id);

    void deleteStudent(int id);
}
