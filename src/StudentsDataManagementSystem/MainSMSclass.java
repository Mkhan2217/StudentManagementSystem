package StudentsDataManagementSystem;

public class MainSMSclass {
	public static void main(String[] args) {
		StudentManagementSystem sms = new StudentManagementSystem();
		sms.addStudent(1, "Muzaffar Khan", "R and D");
		sms.addStudent(2, "Shubham", "Operation");
		sms.addStudent(3, "Gupta", "Technical support");
		sms.addStudent(4, "Ankit", "Sales");
		sms.addStudent(5, "Aditi", "HR dpt.");
		System.out.println("Data of All students:");
		
		System.out.println("--------next operation started-----------");
		sms.sortStudents("id");
		sms.listStudents().forEach(System.out::println);
		
		System.out.println("sorting byt name ");
		sms.sortStudents("name");
		
		System.out.println("--------next operation started-----------");
		System.out.println("Searching for students with name 'Muzaffar Khan':");
		sms.searchStudents("name", "Muzaffar Khan").forEach(System.out::println);
		
		System.out.println("--------next operation started-----------");
		System.out.println("Sorting students by branch:");
		sms.sortStudents("branch");
		sms.listStudents().forEach(System.out::println);
		
		System.out.println("--------next operation started-----------");
		System.out.println("Filtering students by ID starting with '1':");
		sms.filterStudents("id", "1").forEach(System.out::println);
		
		System.out.println("--------next operation started-----------");
		System.out.println("Deleting student with ID 3:");
		sms.deleteStudent(3);
		sms.listStudents().forEach(System.out::println);
		
		System.out.println("--------next operation started-----------");
		System.out.println("Listing students in Sales:");
		sms.listStudentsByBranch("Sales").forEach(System.out::println);
		System.out.println("List all students:");
		sms.listStudents().forEach(System.out::println);
		 
		
		System.out.println("--------next operation started-----------");
		System.out.println("\nSort students by name:");
		sms.sortStudents("name");
		sms.listStudents().forEach(System.out::println);
		
		System.out.println("--------next operation started-----------");
		System.out.println("\nSearch students by name 'Aditi':");
		sms.searchStudents("name", "Aditi").forEach(System.out::println);
		
		System.out.println("--------next operation started-----------");
		System.out.println("\nSearch students by id '4':");
		sms.searchStudents("id", "4").forEach(System.out::println);
		
		System.out.println("--------next operation started-----------");
		System.out.println("\nDelete student with id '2':");
		sms.deleteStudent(2);
		sms.listStudents().forEach(System.out::println);
		
		System.out.println("--------next operation started-----------");
		System.out.println("\nFilter students by name 'M':");
		sms.filterStudents("name", "M").forEach(System.out::println);
	}
}
