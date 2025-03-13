package Task3;

import java.util.HashMap;

public class Grades {

    private HashMap<String, Integer> Grades;

    public Grades() {
        this.Grades = new HashMap<>();
    }

    public void addGrade(String name, int grade) {
        Grades.put(name, grade);
        System.out.println(name + "'s grade added: " + grade);
    }

    public void removeGrade(String name) {
        if (Grades.containsKey(name)) {
            Grades.remove(name);
            System.out.println(name + "'s grade removed.");
        } else {
            System.out.println(name + " not found.");
        }
    }

    public void displayGrade(String name) {
        if (Grades.containsKey(name)) {
            int grade = Grades.get(name);
            System.out.println(name + "'s grade: " + grade);
        } else {
            System.out.println(name + " not found.");
        }
    }
}