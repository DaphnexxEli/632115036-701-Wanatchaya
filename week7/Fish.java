package week7;
//632115036 Wanatchaya Kaewwongwan
public class Fish extends Pet {
    String size;
    boolean water;
    String speed;
    
    
    

    public Fish (String name ,String species , String color , int age) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.color = color;
        
    }

    public void size() {
        System.out.println("The size is " + size);
        
    }
    public void speed() {
        System.out.println("Swim " + speed);
        
    }
    public void isSwim() {
        System.out.println("fresh water: " + water);
    }
    
    

    
}
