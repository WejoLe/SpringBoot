package MySpringBoot2Dbase.src.main.java.ru.shilov.MySpringBoot2Dbase.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.shilov.MySpringBoot2Dbase.dao.DisciplineDAO;
import ru.shilov.MySpringBoot2Dbase.entity.Discipline;

import java.util.List;
@Service
public class DisciplineServiceImpl implements DisciplineService {
    @Autowired
    private DisciplineDAO disciplineDAO;

    @Override
    @Transactional
    public List<Discipline> getAllDisciplines() {return disciplineDAO.getAllDisciplines();}

    @Override
    @Transactional
    public Discipline saveDiscipline(Discipline discipline) {return disciplineDAO.saveDiscipline(discipline);}

    @Override
    @Transactional
    public Discipline getDiscipline(int id) {return disciplineDAO.getDiscipline(id);}


    @Override
    @Transactional
    public void deleteDiscipline(int id) {disciplineDAO.deleteDiscipline(id);}
}