package ru.javageek.ddm.model;

import org.hibernate.annotations.*;
import org.hibernate.annotations.Cache;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import java.util.Date;

/**
 * Created by max on 05/02/15.
 */
@Entity
//@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
//@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@NamedQuery(name = "Student.ById", query = "from Student where studentId > :id") // HQL
@NamedNativeQuery(name = "Student.byIdSql", query = "select * from student where studentId > :id", resultClass = Student.class) // SQL
@DynamicUpdate // select and figure out if smth was changed
public class Student {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;
    @Column
    private String firstname;
    @Column
    private String lastname;
    @Column
    private String email;
    @Column
    private Date studentdob;
    public Student() {}
    public Student(int studentId, String firstname, String lastname, String email, Date studentdob) {
        this.studentId = studentId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.studentdob = studentdob;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getStudentdob() {
        return studentdob;
    }

    public void setStudentdob(Date studentdob) {
        this.studentdob = studentdob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
