package by.mikem.jonline.module4.simpleclass.task03.logic;

import java.util.ArrayList;
import java.util.List;

import by.mikem.jonline.module4.simpleclass.task03.entity.Course;
import by.mikem.jonline.module4.simpleclass.task03.entity.Student;

public class CourseLogic {

	public List<Student> findExcelentStudents(Course course) {
		List<Student> excelentStudents = new ArrayList<Student>();

		Student[] students;

		students = course.getCourse();

		StudentLogic searcher = new StudentLogic();

		for (Student student : students) {
			if (searcher.isExcelentStudent(student)) {
				excelentStudents.add(student);
			}
		}
		return excelentStudents;
	}
}
