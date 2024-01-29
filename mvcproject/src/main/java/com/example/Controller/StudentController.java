package com.example.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Entity.Student;
@Controller
public class StudentController {
	private List<Student> students=new ArrayList<>();
	@GetMapping("/students")
	public String listStudents(Model model)
	{
		model.addAttribute("students",students);
		return "students/list";
		
	}
	@GetMapping("/students/new")
    public String showStudentForm(Model model) {
        model.addAttribute("student", new Student());
        return "students/form";
    }
 
    @PostMapping("/students")
    public String addStudent(Student student) {
        students.add(student);
        return "redirect:/students";
    }

}
