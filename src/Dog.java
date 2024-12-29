// Subclass: Dog
class Dog extends Animal {
    private String breed;

    // Constructor
    public Dog(String name, int age, String breed) {
        super(name, age); // Call parent class constructor
        this.breed = breed;
    }

    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    // Method to display additional information
    public void displayInfo() {
        super.displayInfo(); // Call the parent class method
        System.out.println("Breed: " + breed);
    }
}