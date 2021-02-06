package week9;

public class Person {
    String name;
    int bornYear;

    public Person(String name, int bornYear) {
        this.name = name;
        this.bornYear = bornYear;
    }

    public void introduce() {
        System.out.print("My name is " + name + ",");
        System.out.println(" I was born in " + bornYear + ".");
    }

}

class sheriff extends Person {
    String workState;
    String job;

    public sheriff(String name, int bornYear, String workState) {
        super(name, bornYear);
        this.workState = workState;
    }

    public void introduce() {
        super.introduce();
        System.out.println("I'm a sheriff and work in " + workState + ".");
    }
}

    class job extends Person {
        String job;

        public job(String name, int bornYear, String job) {
            super(name, bornYear);
            this.job = job;
        }

        public void introduce() {
            super.introduce();
            System.out.println("I'm a " + job  + " and work in Asisi.");
        }
    }

