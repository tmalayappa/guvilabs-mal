package Task3;

class AgeNotWithinRangeException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NameNotValidException(String message) {
        super(message);
    }
}

public class Student {

	private int rollID;
	private String name;
	private int age;
	private String course;
	
	//construct with rollID, name, age and course
	public Student(int rollID, String name, int age, String course) throws AgeNotWithinRangeException,NameNotValidException{
		if (age < 15 || age > 21) {
			throw new AgeNotWithinRangeException("for " + name + " Age must be between 15 and 21");
		}
		
		if (!name.matches("[a-zA-Z\\s]+")) {
			throw new NameNotValidException("for " + name + " Name must contain only letters and spaced" );
		}
		
		this.rollID = rollID;
		this.name = name;
		this.age = age;
		this.course = course;
	}
	
	
	//Getter and setter
	public int getRollID () {
		return rollID;
	}
	
	public String getName () {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getCourse () {
		return course;
	}
	
	public void setRollID (int rollID) {
		this.rollID = rollID;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setCourse (String course) {
		this.course = course;
	}

	public void DisplayStudent () {
        System.out.println("Student's RollID : " + rollID);
        System.out.println("Student's Name : " + name);
        System.out.println("Student's Age : " + age);
        System.out.println("Student's Course : " + course);

	}
}
