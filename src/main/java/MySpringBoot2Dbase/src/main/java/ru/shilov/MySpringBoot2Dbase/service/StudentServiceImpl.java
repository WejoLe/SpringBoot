package MySpringBoot2Dbase.src.main.java.ru.shilov.MySpringBoot2Dbase.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
import ru.shilov.MySpringBoot2Dbase.dao.StudentDAO;
import ru.shilov.MySpringBoot2Dbase.entity.Student;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDAO studentDAO;

    @Override
    @Transactional
    public List<Student> getAllStudents() {return studentDAO.getAllStudents();}

    @Override
    @Transactional
    public Student saveStudent(Student student) {return studentDAO.saveStudent(student);}

    @Override
    @Transactional
    public Student getStudent(int id) {return studentDAO.getStudent(id);}

    @Override
    @Transactional
    public void deleteStudent(int id) {studentDAO.deleteStudent(id);}
}
