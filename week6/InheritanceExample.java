package week6;
//632115036 Wanatchaya Kaewwongwan

public class InheritanceExample {
    public static void main(String[] args) {
        Artist art = new Artist("Ball", 20 , "male");

        art.genre = "hip hop";
        art.introduce();
        art.playMusic();
        art.genre1 = "engineer";
        art.job1();
        art.genre2 = "doctor";
        art.job2();
        art.genre3 = "farmer";
        art.job3();
        art.genre4 = "teacher";
        art.job4();
        art.genre5 = "programmer";
        art.job5();
    }
    
}
