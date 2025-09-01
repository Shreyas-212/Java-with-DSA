public class inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
}

//Base class
class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    }
    void Breathe() {
        System.out.println("Breathes");
    }
}

//Derived class
class Fish extends Animal {                        //Single level inheritance
    int fins;

    void swim() {
        System.out.println("Swims in water");
    }
}

class Mammal extends Animal {                       //Hierarchial inheritance 
    int legs;
}

class Dog extends Mammal {                        //Multi level inheritance
    String breed;
}
