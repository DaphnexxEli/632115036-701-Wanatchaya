package week6;
//632115036 Wanatchaya Kaewwongwan

public class InheritanceExample {
    public static void main(String[] args) {
        Artist art = new Artist("Ball", 20 , "male");
        art.genre = "hip hop";
        art.introduce();
        art.playMusic();

        Job1 job1 = new Job1("Idea" , 19 , "Female");
        job1.introduce();
        job1.genre1 = "engineer";
        job1.job1();

        Job2 job2 = new Job2("Ivy" , 19 , "Female");
        job2.introduce();
        job2.genre2 = "doctor";
        job2.job2();

        Job3 job3 = new Job3("Ray" , 18 , "Male");
        job3.introduce();
        job3.genre3 = "farmer";
        job3.job3();

        Job4 job4 = new Job4("Love" , 19 , "Male");
        job4.introduce();
        job4.genre4 = "teacher";
        job4.job4();


        Job5 job5 = new Job5("Prius" , 18 , "Male");
        job5.introduce();
        job5.genre5 = "professor";
        job5.job5();
        
    }
    
}
