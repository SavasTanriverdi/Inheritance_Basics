// Main class to demonstrate inheritance
public class InheritanceBasics {
    public static void main(String[] args) {
        // Create instances of Dog and Bird
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        Bird bird = new Bird("Tweety", 2, true);

        // Display information and sounds
        System.out.println("Dog Information:");
        dog.displayInfo();
        dog.makeSound();

        System.out.println("\nBird Information:");
        bird.displayInfo();
        bird.makeSound();
    }
}