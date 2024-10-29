package MySpringBoot2Dbase.src.main.java.ru.shilov.MySpringBoot2Dbase.service;

import org.springframework.stereotype.Service;
import ru.shilov.MySpringBoot2Dbase.entity.Student;

import java.util.List;

@Service
public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudent(int id);

    void deleteStudent(int id);
}
