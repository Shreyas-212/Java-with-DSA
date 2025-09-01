public class functionOverriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
}

class Animal {
    void eat() {
        System.out.println("Eats Anything");
    }
}

class Deer {
    void eat() {
        System.out.println("Eats grass");
    }
}