package week7;
    //632115036 Wanatchaya Kaewwongwan

public class Pet {
    String name;
    String species;
    String color;
    int age;
    
    public Pet(){

    }
    
    public Pet(String name ,String species , String color , int age) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.color = color;
        
    }
    public void introduce() {
        System.out.println("My dog");
        System.out.println("Name: " + name + " Species: " + species + " Color: " + color + " Age: " + age );
        System.out.println("My dog is " + name + " run to the jungle");
        System.out.println("Small bark Box Box!!");
        
         
     }
}

