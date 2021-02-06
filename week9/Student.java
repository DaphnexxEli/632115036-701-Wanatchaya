package week9;

import java.util.Scanner;

public class Student {
    private String firstname = "Hello";
    private String lastname = "World";
    // Scanner firstname = new Scanner(System.in);
    // Scanner lastname = new Scanner(System.in);

    public static void main(String[] args) {
        // System.out.println("please input you name: ");
        // System.out.println("please input your surname: ");
        Student p = new Student();
        System.out.println(p.toString());

    }

    // public String toString() {
        // String name = firstname.nextLine();
        // String surname = lastname.nextLine();
    //     return "My name is " + firstname + " " + lastname;

    // }
}
