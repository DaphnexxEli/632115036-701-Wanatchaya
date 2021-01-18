package week7;
//632115036 Wanatchaya Kaewwongwan
public class Bird extends Pet {
    String genre1;
    

    public Bird (String name ,String species , String color , int age) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.color = color;
        
    }

    public void bird() {
        System.out.println(name +"'s job1 is " + genre1);
        
    }

    
}
