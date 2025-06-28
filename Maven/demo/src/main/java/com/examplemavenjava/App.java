package com.examplemavenjava;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");

        User userOne = new User();
        userOne.setId(1L);
        userOne.setName("John Doe");
        System.out.println("User ID: " + userOne.getId());
        System.out.println("User Name: " + userOne.getName());
    }
}
