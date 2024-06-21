package com.package_stud.main;

public class Student {

	private String name;
	private String groupNumber;
	private int[] grades;

	public Student(String name, String groupNumber, int[] grades) {
		this.name = name;
		this.groupNumber = groupNumber;
		this.grades = grades;
	}

	public String getName() {
		return name;
	}

	public String getGroupNumber() {
		return groupNumber;
	}

	public int[] getGrades() {
		return grades;
	}

	public static void main(String[] args) {
		Student[] students = new Student[10];

		// Инициализация массива студентов
		students[0] = new Student("Иванов И.И.", "Группа 1", new int[] { 9, 9, 10, 9, 10 });
		students[1] = new Student("Петров П.П.", "Группа 2", new int[] { 8, 7, 9, 10, 9 });
		students[2] = new Student("Сидоров С.С.", "Группа 1", new int[] { 9, 10, 10, 9, 10 });
		students[3] = new Student("Козлов К.К.", "Группа 3", new int[] { 9, 9, 9, 9, 9 });
		students[4] = new Student("Иванова А.И.", "Группа 2", new int[] { 10, 10, 10, 10, 10 });
		students[5] = new Student("Петрова М.П.", "Группа 1", new int[] { 7, 8, 9, 10, 9 });
		students[6] = new Student("Сидорова Л.С.", "Группа 4", new int[] { 9, 9, 9, 8, 9 });
		students[7] = new Student("Козлова О.К.", "Группа 3", new int[] { 9, 10, 9, 10, 10 });
		students[8] = new Student("Иванов И.П.", "Группа 2", new int[] { 8, 9, 10, 10, 10 });
		students[9] = new Student("Петрова А.П.", "Группа 4", new int[] { 10, 10, 10, 10, 10 });

		// Вывод фамилий и номеров групп студентов с оценками 9 или 10
		System.out.println("Студенты с оценками 9 или 10:");
		for (Student student : students) {
			boolean hasOnlyHighGrades = true;
			for (int grade : student.getGrades()) {
				if (grade < 9) {
					hasOnlyHighGrades = false;
					break;
				}
			}
			if (hasOnlyHighGrades) {
				System.out.println("Фамилия: " + student.getName() + ", Группа: " + student.getGroupNumber());
			}
		}
	}
}
