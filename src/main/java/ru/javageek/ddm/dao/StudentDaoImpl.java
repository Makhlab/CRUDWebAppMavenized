package ru.javageek.ddm.dao;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.javageek.ddm.model.Student;

import java.util.List;

/**
 * Created by max on 05/02/15.
 */
@Repository
public class StudentDaoImpl implements StudentDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void add(Student student) {
        sessionFactory.getCurrentSession().save(student);
    }

    @Override
    public void edit(Student student) {
        sessionFactory.getCurrentSession().update(student);
    }

    @Override
    public void delete(int studentId) {
        sessionFactory.getCurrentSession().delete(this.getStudent(studentId));
    }

    @Override
    public Student getStudent(int studentId) {
        return (Student) sessionFactory.getCurrentSession().get(Student.class, studentId);
    }

    @Override
    public List getAllStudent() {
        return sessionFactory.getCurrentSession().createQuery("from Student ").list();
    }

    @Override
    public List getAllStudent(int whereStudentId) {
//        Query query = sessionFactory.getCurrentSession().createQuery("from Student where studentId > :id");
//        query.setInteger("id", whereStudentId);
////        query.setFirstResult(1);
        Query query = sessionFactory.getCurrentSession().getNamedQuery("Student.byIdSql");
        query.setInteger("id", whereStudentId);
        query.setMaxResults(4);
        return query.list();
    }

    @Override
    @Cacheable(value = "getAllNamesOfStudent")
    public List getAllNamesOfStudent() {
//        Query query = sessionFactory.getCurrentSession().createQuery("select new map (studentId, firstname) from Student");
//        return query.list();
        Student studentExample = new Student();
        studentExample.setFirstname("Max"); // %like%

        Example example = Example.create(studentExample).enableLike(MatchMode.ANYWHERE);

        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Student.class)
                .addOrder(Order.desc("studentId"))
                .add(example);
//                .setProjection(Projections.property("studentId"));
        criteria.add(Restrictions.ge("studentId", 5))
                .add(Restrictions.like("firstname", "%Max%"))
                .add(Restrictions.between("studentId", 5, 9));
        return criteria.list();
    }
}
