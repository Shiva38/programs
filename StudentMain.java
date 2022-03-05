package studentDetails;




import java.text.ParseException;

public class StudentMain {

	public static void main(String[] args) throws ParseException {
		
		//following statement creates an object
		DetailsOfStudent st = new DetailsOfStudent();
		st.readStudentDetails();
		st.displayStudentDetails();
		
		DetailsOfStudent st1 = new DetailsOfStudent();
		st1.readStudentDetails();
		st1.displayStudentDetails();
	}

}

