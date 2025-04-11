package Task3;

class InvalidAgeException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidAgeException(String message) {
        super(message);
    }
}

public class Voter {
	private int voterID ;
	private String name;
	private int age;
	
	//construct with rollID, name, age and course
	public Voter (int voterID, String name, int age) throws InvalidAgeException,NameNotValidException{
		if (age < 18) {
			throw new InvalidAgeException("for " + name + " ,voter has a invalid age");
		}
		
		if (!name.matches("[a-zA-Z\\s]+")) {
			throw new NameNotValidException("for " + name + " Name must contain only letters and spaced" );
		}
		
		this.voterID = voterID;
		this.name = name;
		this.age = age;
	}
	//Getter and setter
	public int getVoterID () {
		return voterID;
	}
	
	public String getName () {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setVoterID (int voterID) {
		this.voterID = voterID;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public void DisplayVoterDetails () {
        System.out.println("Voter's ID : " + voterID);
        System.out.println("Voter's Name : " + name);
        System.out.println("Voter's Age : " + age);
	}
	public void DisplayVoter() {
		// TODO Auto-generated method stub
        System.out.println("Voter's ID : " + voterID);
        System.out.println("Voter's Name : " + name);
        System.out.println("Voter's Age : " + age);
	}

}
