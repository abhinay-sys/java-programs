class FarmAnimal {
    String name;
    String place;
    String food;
    String sound;

    // Constructor
    FarmAnimal(String name, String place, String food, String sound) {
        this.name = name;
        this.place = place;
        this.food = food;
        this.sound = sound;
    }

    // Method
    void display() {
        System.out.println("Animal : " + name);
        System.out.println("Where it stays : " + place);
        System.out.println("What it eats : " + food);
        System.out.println("Sound : " + sound);
        System.out.println();
    }
}

public class FarmAnimals {
    public static void main(String[] args) {

        // Creating objects
        FarmAnimal cow = new FarmAnimal(
            "Cow", "Cowshed", "Grass", "Moo");

        FarmAnimal pig = new FarmAnimal(
            "Pig", "Pigsty", "Grains", "Oink");

        FarmAnimal horse = new FarmAnimal(
            "Horse", "Stable", "Grass", "Neigh");

        // Calling method
        cow.display();
        pig.display();
        horse.display();
    }
}