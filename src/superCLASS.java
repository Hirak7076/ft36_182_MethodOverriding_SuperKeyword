class Animal {
    String name;
    String species;
    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    String breed;

    public Dog(String name, String species, String breed) {
        super(name, species); 
        this.breed = breed;
    }    
    @Override
    public void makeSound() {
        super.makeSound(); 
        System.out.println("Dog barks");
    }
}
public class superCLASS {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Canine", "Golden Retriever");
        System.out.println("Name: " + dog.name);
        System.out.println("Species: " + dog.species);
        System.out.println("Breed: " + dog.breed);
        dog.makeSound();  
    }
}
