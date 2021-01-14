package week6;
//632115036 Wanatchaya Kaewwongwan
public class Job2 extends Person {
    String genre2;
    

    public Job2 (String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void job1() {
        System.out.println(name +"'s job2 is " + genre2);
        
    }

    
}
