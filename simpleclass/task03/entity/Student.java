package by.mikem.jonline.module4.simpleclass.task03.entity;

import java.util.Arrays;
import java.util.Objects;

public class Student {
	private String surnameAndInitials;
	private int groupNumber;
	private int[] grades;

	public Student() {
	}

	public Student(String surnameAndInitials, int groupNumber, int[] grades) {
		this.surnameAndInitials = surnameAndInitials;
		this.groupNumber = groupNumber;
		this.grades = grades;
	}

	public String getSurnameAndInitials() {
		return surnameAndInitials;
	}

	public void setSurnameAndInitials(String surnameAndInitials) {
		this.surnameAndInitials = surnameAndInitials;
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}

	public int[] getGrades() {
		return grades;
	}

	public void setGrades(int[] grades) {
		this.grades = grades;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(grades);
		result = prime * result + Objects.hash(groupNumber, surnameAndInitials);
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
		Student other = (Student) obj;
		return Arrays.equals(grades, other.grades) && groupNumber == other.groupNumber
				&& Objects.equals(surnameAndInitials, other.surnameAndInitials);
	}

	@Override
	public String toString() {
		return String.format("Student [surnameAndInitials=%s, groupNumber=%s, grades=%s]", surnameAndInitials,
				groupNumber, Arrays.toString(grades));
	}
}
