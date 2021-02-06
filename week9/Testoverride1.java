package week9;

public class Testoverride1 {
    public static void main(String[] args) {
        Person person1;
        person1 = new Person("Mark", 2001);
        person1 = new sheriff("Mark", 2001 , "Asisi");
        person1.introduce();
        System.out.println("---------------------------------------");

        Person person2;
        person1 = new Person("Mateo", 1988);
        person2 = new sheriff("Mateo", 1988, "California");
        person2.introduce();
        System.out.println("---------------------------------------");

        Person person3;
        person3 = new Person("Alex", 1999);
        person3 = new job("Alex", 1999 , "Mechanic");
        person3.introduce();
        System.out.println("---------------------------------------");

        Person person4;
        person4 = new Person("Meson" , 1998);
        person4 = new job("Meson", 1998 , "Football player");
        person4.introduce();
        
    }

}
