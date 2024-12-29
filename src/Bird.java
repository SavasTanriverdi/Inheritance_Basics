// Subclass: Bird
class Bird extends Animal {
    private boolean canFly;

    // Constructor
    public Bird(String name, int age, boolean canFly) {
        super(name, age); // Call parent class constructor
        this.canFly = canFly;
    }

    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Tweet! Tweet!");
    }

    // Method to display additional information
    public void displayInfo() {
        super.displayInfo(); // Call the parent class method
        System.out.println("Can Fly: " + (canFly ? "Yes" : "No"));
    }
}