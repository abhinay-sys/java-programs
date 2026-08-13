interface Animal {
    void eat();
}

class Dog implements Animal {
    public void eat() {
        System.out.println("Dog eats");
    }

    void bark() {
        System.out.println("Dog barks");
    }
}
class Puppy extends Dog {
    void play() {
        System.out.println("Puppy plays");
    }
}
class Cat implements Animal {
    public void eat() {
        System.out.println("Cat eats");
    }
    void meow() {
        System.out.println("Cat meows");
    }
}

public class Hybrid {
    public static void main(String[] args) {
        Puppy p = new Puppy();

        p.eat();
        p.bark();
        p.play();
        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}