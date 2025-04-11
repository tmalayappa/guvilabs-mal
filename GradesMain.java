package Task3;

public class GradesMain {


	public static void main(String[] args) {
	    Grades grades = new Grades();

	    grades.addGrade("Kumar", 91);
	    grades.addGrade("Sita", 95);
	    grades.addGrade("Malar", 95);

	    grades.displayGrade("Kumar");
	    grades.displayGrade("Sara"); // Non-existent

	    grades.removeGrade("Sita");
	    grades.displayGrade("Sita"); // "not found"

	    grades.removeGrade("Selva"); // Non-existent
	}
	
}