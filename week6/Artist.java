package week6;
    //632115036 Wanatchaya Kaewwongwan

public class Artist extends Person {
    String genre ;
    String genre1;
    String genre2;
    String genre3;
    String genre4;
    String genre5;

    public Artist(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void playMusic() {
        System.out.println(name + " is playing " + genre + " music.");
         
    }
    public void job1() {
        System.out.println("My job1 is " + genre1);
        
    }
    public void job2() {
        System.out.println("My job2 is " +genre2);
        
    }
    public void job3() {
        System.out.println("My job3 is " +genre3);
        
    }
    public void job4() {
        System.out.println("My job4 is " +genre4);
        
    }
    public void job5() {
        System.out.println("My job5 is " +genre5);
        
    }
    
}
    

