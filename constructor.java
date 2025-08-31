public class constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Java");
        System.out.println(s2.name);

        s1.name = "Java Program";
        s1.roll = 123;
        Student s3 = new Student(s1);
        System.out.println(s3.name);
        System.out.println(s3.roll);
    }
}

class Student {
    String name;
    int roll;

    Student() {                                             // Non-parameterized constructor
        System.out.println("Constructor is called.");
    }

    Student(String name) {                           // Parameterized constructor
        this.name = name;
    }

    Student(Student s1) {                       // Copy constructor
        this.name = s1.name;
        this.roll = s1.roll;
    }
}