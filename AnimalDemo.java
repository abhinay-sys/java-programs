package csmd264;
abstract class Animal {
    void sleep() {
        System.out.println("Animal is sleeping");
    }
     abstract void sound();
}
public class AnimalDemo extends Animal {
    @Override
    void sound() {
        System.out.println("Dog says: Bark");
    }
    public static void main(String[] args) {
        AnimalDemo a = new AnimalDemo();
        a.sleep();
        a.sound();
    }
}

