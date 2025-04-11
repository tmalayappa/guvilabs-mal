package Task3;

public class VoterRegistration {
    public static void main(String[] args) {

	    Voter[] voters = new Voter[3];
	    
        try {
            voters[0] = new Voter(1, "Rose", 25);
            voters[0].DisplayVoter();

            voters[1] = new Voter(2, "Steve", 28); 
            voters[1].DisplayVoter();
            
            voters[2] = new Voter(3, "Jasmine1", 10); // This will throw an exception
            voters[2].DisplayVoter();
            
        	} catch (InvalidAgeException e) {
        		System.err.println("Age Exception: " + e.getMessage());
        	} catch (NameNotValidException e) {
        		System.err.println("Name Exception: " + e.getMessage());
        	} catch (Exception e) { // Catch any other unexpected exceptions.
        		System.err.println("An unexpected error occurred: " + e.getMessage());
    }
        System.out.println("--------------------");

        System.out.println("Program continues..."); // Demonstrates that the program can continue after the exception.
        // Display valid voters details
        for (Voter voter : voters) {
            if (voter != null) {
                System.out.println("--------------------");
                voter.DisplayVoterDetails();
            }
        }
    }
}
