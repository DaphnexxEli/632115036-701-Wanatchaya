// package week11;

public class StudentData {
    public static void main(String[] args) {
        //Student object include name,age,gpa
        Stu std01 = new Stu("Mark",18,4.00);
        Stu std02 = new Stu("Jane",18,2.20);
        Stu std03 = new Stu("Peter",19,4.00);
        Stu std04 = new Stu("Mark",22,1.75);

        //Name
        System.out.println(std01.getName().equals(std02.getName()));
        System.out.println(std01.getName().equals(std03.getName()));
        System.out.println(std02.getName().equals(std04.getName()));
        System.out.println(std01.getName().equals(std04.getName()));

        //Age
        System.out.println(std01.getAge().equals(std02.getAge()));
        System.out.println(std03.getAge().equals(std04.getAge()));
        System.out.println(std01.getAge().equals(std03.getAge()));

        //GPA
        System.out.println(std01.getGPA().equals(std03.getGPA()));
        System.out.println(std02.getGPA().equals(std04.getGPA()));
        System.out.println(std02.getGPA().equals(std03.getGPA()));
    }
}

class Stu {
    private Object name;
    private Object age;
    private Object gpa;

    public Stu (String name, int age , double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public Object getName(){
        return this.name;
    }

    public Object getAge(){
        return this.age;
    }

    public Object getGPA(){
        return this.gpa;
    }
    
    
}

