package Task3;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Student[] students = new Student[5]; // Array to store 5 students
        try {
            students[0] = new Student(1201, "Devika Perumal", 19, "Computer Science");

            students[1] = new Student(1202, "Kumar Selva", 20, "Cyber Security"); 

            students[2] = new Student(1203, "Peter Johnson", 25, "Mathematics"); // Invalid age

            students[3] = new Student(1204, "Steve_Job", 14, "Mathematics"); // Invalid age and name

            students[4] = new Student(1205, "Gates B1ll", 18, "Cyber Security"); // invalid name

        } catch (AgeNotWithinRangeException e) {
            System.err.println("Age Exception: " + e.getMessage());
        } catch (NameNotValidException e) {
            System.err.println("Name Exception: " + e.getMessage());
        } catch (Exception e) { // Catch any other unexpected exceptions.
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
        
        // Display valid student details
        for (Student student : students) {
            if (student != null) {
                System.out.println("--------------------");
                student.DisplayStudent();
            }
        }

	}
}
