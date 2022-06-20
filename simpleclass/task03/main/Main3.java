package by.mikem.jonline.module4.simpleclass.task03.main;

import java.util.List;

import by.mikem.jonline.module4.simpleclass.task03.entity.Course;
import by.mikem.jonline.module4.simpleclass.task03.entity.Student;
import by.mikem.jonline.module4.simpleclass.task03.logic.CourseLogic;

/* Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, 
 * успеваемость (массив из пяти элементов). Создайте массив из десяти элементов такого типа. 
 * Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки,
 * равные только 9 или 10.
*/

public class Main3 {

	public static void main(String[] args) {
		Course course = new Course(10);

		course.addStudent("Иванов И.И.", 113113, new int[] { 7, 8, 9, 3, 5 });
		course.addStudent("Иванов К.И.", 113113, new int[] { 3, 2, 4, 3, 5 });
		course.addStudent("Петров И.И.", 113113, new int[] { 9, 9, 9, 10, 10 });
		course.addStudent("Селиванов К.К.", 113123, new int[] { 10, 10, 9, 9, 9 });
		course.addStudent("Сидоров С.С.", 113123, new int[] { 7, 6, 5, 3, 5 });
		course.addStudent("Зеленчик К.И.", 113123, new int[] { 7, 6, 9, 4, 5 });
		course.addStudent("Бубнов Б.Б.", 113123, new int[] { 7, 2, 9, 3, 5 });
		course.addStudent("Баянов В.В.", 113133, new int[] { 10, 9, 9, 9, 9 });
		course.addStudent("Кержачков С.С.", 113133, new int[] { 4, 8, 9, 3, 6 });
		course.addStudent("Бердышан А.А.", 113133, new int[] { 9, 8, 9, 4, 5 });		

		CourseLogic searcher = new CourseLogic();

		List<Student> excelentStudents;

		excelentStudents = searcher.findExcelentStudents(course);

		printExcelentStudents(excelentStudents);
	}

	public static void printStudent(Student student) {
		System.out.println(
				"The student " + student.getSurnameAndInitials() + " from the group " + student.getGroupNumber() + ".");
	}

	public static void printExcelentStudents(List<Student> excelentStudents) {
		System.out.println("The list of students that have excelent grades:");

		for (Student student : excelentStudents) {
			printStudent(student);
		}
	}
}
