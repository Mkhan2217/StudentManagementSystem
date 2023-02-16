package StudentsDataManagementSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class StudentManagementSystem {
	private List<Student> students = new ArrayList<>();

	public void addStudent(int id, String name, String branch) {
		students.add(new Student(id, name, branch));
	}

	public void updateStudent(int id, String name, String branch) {
		students.stream().filter(s -> s.getId() == id).findFirst().ifPresent(s -> {
			s.setName(name);
			s.setBranch(branch);
		});
	}

	public List<Student> searchStudents(String field, String value) {
		return students.stream().filter(s -> {
			switch (field) {
			case "id":
				return String.valueOf(s.getId()).equals(value);
			case "name":
				return s.getName().equals(value);
			case "branch":
				return s.getBranch().equals(value);
			default:
				throw new IllegalArgumentException("Unexpected value: " + field);
			}
		}).collect(Collectors.toList());
	}

	public void sortStudents(String field) {
		switch (field) {
		case "id":
			Collections.sort(students, Comparator.comparingInt(Student::getId));
			break;
		case "name":
			Collections.sort(students, Comparator.comparing(Student::getName));
			break;
		case "branch":
			Collections.sort(students, Comparator.comparing(Student::getBranch));
			break;
		}
	}

	public List<Student> listStudents() {
		return students;
	}

	public List<Student> listStudentsByBranch(String branch) {
		return students.stream().filter(s -> s.getBranch().equals(branch)).collect(Collectors.toList());
	}

	public void deleteStudent(int id) {
		students.removeIf(s -> s.getId() == id);
	}

	public List<Student> filterStudents(String field, String value) {
		return students.stream().filter(s -> {
			switch (field) {
			case "id":
				return String.valueOf(s.getId()).startsWith(value);
			case "name":
				return s.getName().startsWith(value);
			case "branch":
				return s.getBranch().startsWith(value);
			default:
				throw new IllegalArgumentException("Unexpected value: " + field);
			}
		}).collect(Collectors.toList());
	}
}