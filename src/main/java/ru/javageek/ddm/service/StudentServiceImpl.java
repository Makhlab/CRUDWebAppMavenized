package ru.javageek.ddm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.javageek.ddm.model.Student;
import ru.javageek.ddm.dao.StudentDao;

import java.util.List;

/**
 * Created by max on 05/02/15.
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentDao studentDao;
    @Override
    @Transactional
    public void add(Student student) {
        studentDao.add(student);
    }

    @Override
    @Transactional
    public void edit(Student student) {
        studentDao.edit(student);
    }

    @Override
    @Transactional
    public void delete(int studentId) {
        studentDao.delete(studentId);
    }

    @Override
    @Transactional
    public Object getStudent(int studentId) {
        return studentDao.getStudent(studentId);
    }

    @Override
    @Transactional
    public List getAllStudent() {
        return studentDao.getAllStudent();
    }

    @Override
    @Transactional
    public List getAllStudent(int whereStudentId) {
        return studentDao.getAllStudent(whereStudentId);
    }

    @Override
    @Transactional
    public List getAllNamesOfStudent() {
        return studentDao.getAllNamesOfStudent();
    }
}
