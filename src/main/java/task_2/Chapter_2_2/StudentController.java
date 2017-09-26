package task_2.Chapter_2_2;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	@RequestMapping("/hello")
	public String showStudents(Model model){
		//ArrayList to store Student objects
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		//create 3 student objects
		
		Student student1 = new Student("Peck","Tokin");
		Student student2 = new Student("Joshen","Tango");
		Student student3 = new Student("Lilo","Lingo");
		
		//add objects to the list
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		model.addAttribute("students",studentList);
		
		
		return "hello";
		
	}
	
}
