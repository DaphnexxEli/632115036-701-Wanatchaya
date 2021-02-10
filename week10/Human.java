package week10;

public class Human {
    public void hit(Animal animal) {
        System.out.println(animal.roar());

    }

    public static void main(String[] args) {
        Animal dog = new Dog(); // Q1
        Human human = new Human();
        System.out.println("The first calling hit(Animal)");
        human.hit(dog); // Q2

        dog = new Cat();
        System.out.println("The second calling hit(Animal)");
        human.hit(dog);

        // Animal fish = new Fish();
        dog = new Fish();
        System.out.println("The third calling hit(Animal)");
        human.hit(dog); // Q3

    }
}
