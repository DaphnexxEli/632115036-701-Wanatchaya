package week6;
//632115036 Wanatchaya Kaewwongwan
public class Job1 extends Person {
    String genre1;
    

    public Job1 (String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void job1() {
        System.out.println(name +"'s job1 is " + genre1);
        
    }

    
}
