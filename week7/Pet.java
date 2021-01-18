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
        System.out.println("Name: " + name + " Species: " + species + " Color: " + color + " Age: " + age );
       
        
         
     }
}

