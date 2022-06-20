package by.mikem.jonline.module4.simpleclass.task03.entity;

import java.util.Arrays;
import java.util.Objects;

public class Course {
	Student[] course;
	private int actualGroupSize;

	public Course() {
	}

	public Course(int courseSize) {
		this.course = new Student[courseSize];
		actualGroupSize = 0;
	}

	public Student[] getCourse() {
		return this.course;
	}

	public void setCourse(Student[] course) {
		this.course = course;
	}

	public int getActualGroupSize() {
		return actualGroupSize;
	}

	public void setActualGroupSize(int actualGroupSize) {
		this.actualGroupSize = actualGroupSize;
	}

	public void addStudent(String surnameAndInitials, int groupNumber, int[] grades) {
		Student student = new Student(surnameAndInitials, groupNumber, grades);

		if (actualGroupSize < 10) {
			this.course[actualGroupSize] = student;
		} else {
			return;
		}

		actualGroupSize++;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(course);
		result = prime * result + Objects.hash(actualGroupSize);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return actualGroupSize == other.actualGroupSize && Arrays.equals(course, other.course);
	}

	@Override
	public String toString() {
		return String.format("Course [course=%s, actualGroupSize=%s]", Arrays.toString(course), actualGroupSize);
	}	
}
