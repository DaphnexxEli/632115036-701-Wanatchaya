package week7;
//632115036 Wanatchaya Kaewwongwan
public class Bird extends Pet {
    String country;
    boolean fly;
    String speak;
    

    public Bird (String name ,String species , String color , int age) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.color = color;
        
    }

    public void country() {
        System.out.println("Country of this bird is " + country);
        
    }
    public void speak() {
        System.out.println(speak);
        
    }
    public void fly() {
        System.out.println("Can fly: " + fly);
        
    }

    
}
