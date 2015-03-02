package ru.javageek.ddm.dao;

import ru.javageek.ddm.model.Student;

import java.util.List;

/**
 * Created by max on 05/02/15.
 */
public interface StudentDao {
    public void add(Student student);
    public void edit(Student student);
    public void delete(int studentId);
    public Object getStudent(int studentId);
    public List getAllStudent();
    public List getAllStudent(int whereStudentId );
    public List getAllNamesOfStudent();
}
