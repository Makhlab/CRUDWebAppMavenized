package ru.javageek.ddm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.javageek.ddm.model.Student;
import ru.javageek.ddm.service.StudentService;

import java.util.Map;

/**
 * Created by max on 05/02/15.
 */
@Controller
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping("/*")
//    @RequestMapping("/index.do")
    public String setupForm(Map<String, Object> map) {
        Student student = new Student();
        map.put("student", student);
        map.put("studentList", studentService.getAllStudent());
        return "student";
    }

    @RequestMapping(value = "student.do", method = RequestMethod.POST)
    public String doActions(@ModelAttribute Student student,
                            BindingResult result,
                            @RequestParam String action, Map<String, Object> map) {
        Student studentResult = new Student();
        if (action.toLowerCase().equals("add")) {
            studentService.add(student);
            studentResult = student;
        } else if (action.toLowerCase().equals("edit")) {
            studentService.edit(student);
            studentResult = student;
        } else if (action.toLowerCase().equals("delete")) {
            studentService.delete(student.getStudentId());
            studentResult = student;
        } else if (action.toLowerCase().equals("search")) {
            Student searchedStudent = (Student) studentService.getStudent(student.getStudentId());
            studentResult = searchedStudent != null ? searchedStudent : new Student();
        }
        map.put("student", studentResult);
        map.put("studentList", studentService.getAllStudent());
        return "student";
    }

    @RequestMapping("/studentByHQL.do")
    public String studentByHQL(@RequestParam int id, Map<String, Object> map) {
        map.put("studentList", studentService.getAllNamesOfStudent());
//        map.put("studentNames", studentService.getAllNamesOfStudent());
        return "studenthql";
    }
}
