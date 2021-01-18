package week7;
//632115036 Wanatchaya Kaewwongwan

public class main {
    public static void main(String[] args) {
        Dog dog = new Dog("Lucky", "Poodle" , "brown" , 2);
        System.out.println("My dog");;
        dog.introduce();
        dog.run = "run";
        dog.run();
        dog.size = "medium";
        dog.size();
        dog.bark = "Box Box!!";
        dog.bark();
        dog.hair = true;
        dog.hair();
        System.out.println("---------------------------------------------------------");

        Fish fish = new Fish("vivi", "Dragon Fish", "Gold", 10);
        System.out.println("My Fish");
        fish.introduce();
        fish.size = "medium";
        fish.size();
        fish.speed = "fast";
        fish.speed();
        fish.water = true;
        fish.isSwim();
        System.out.println("---------------------------------------------------------");
        
        Bird bird = new Bird("Xiao Bi", "Parrot", "Red", 1);
        System.out.println("My bird");
        bird.introduce();
        bird.country = "Chinese";
        bird.country();;
        bird.speak = "I am a bird of god";
        bird.speak();
        bird.fly = true;
        bird.fly();
        System.out.println("---------------------------------------------------------");
    }
    
}
