package Task2;

public class MainPerson {
	
    public static void main(String[] args) {
        // Example usage
        Person person1 = new Person(); // Default age 18, name null
        person1.Display();

        Person person2 = new Person("Ram"); // Default age 18, name Ram
        person2.Display();

        Person person3 = new Person("Siva", 20); // Age 30, name Bob
        person3.Display();

        person1.setAge(28);
        person1.setName("Tomaz");
        person1.Display();
    }
}

