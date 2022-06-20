package by.mikem.jonline.module4.simpleclass.task03.logic;

import by.mikem.jonline.module4.simpleclass.task03.entity.Student;

public class StudentLogic {

	public boolean isExcelentStudent(Student student) {
		int[] grades = student.getGrades();

		for (int grade : grades) {
			if (grade != 9 && grade != 10) {
				return false;
			}
		}

		return true;
	}
}
