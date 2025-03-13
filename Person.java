package Task2;

public class Person {

	private String name;
	private int age;
	
	// construct with default age of 18
	public Person() {
		age = 18;
	}
	
	//construct with age and name
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(String name) {
		age = 18;
		this.name = name;
	}
	
	//getter for age
	public int getAge() {
		return age;
	}
	
	//getter for name
	public String getName() {
		return name;
	}
	
	//setter for age
	public void setAge(int age) {
		this.age = age;
	}
	//setter for name
	public void setName(String name) {
		this.name = name;
	}
	
	public void Display () {
        System.out.println("Person's Name : " + name);
        System.out.println("Person's Age : " + age);
	}
	
    @Override
    public String toString() {
        return "Person's [name=" + name + ", age=" + age + "]";
    }
}
