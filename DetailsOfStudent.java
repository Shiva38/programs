package studentDetails;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DetailsOfStudent {
	
	//variables
	int studentId;
	String studentName;
	Date studentDob;
	
	Scanner sc  = new Scanner(System.in);
	//methods to access above variables
	void readStudentDetails() throws ParseException {
		System.out.println("Enter the Student data");
		System.out.println("Enter the student id");
		studentId = sc.nextInt();
		System.out.println("Enter the student name");
		sc.nextLine();//throw away the newline read by scanner
		studentName = sc.nextLine();
		System.out.println("Enter the student dob in 'dd/MM/yyyy' ");
		String dob = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		studentDob = sdf.parse(dob);
	}
	
	@SuppressWarnings("deprecation")
	void displayStudentDetails(){
		System.out.println("Entered the Student data ...............");
		System.out.println("Student id = " + studentId );
		System.out.println("Student name = " + studentName);
		System.out.println("Student dob = " + studentDob.getDate()+"/"+studentDob.getMonth()+"/"+studentDob.getYear());
	}
}

