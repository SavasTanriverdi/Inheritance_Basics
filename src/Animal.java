// Parent class
class Animal {
    private String name;
    private int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display general information
    public void displayInfo() {
        System.out.println("Animal Name: " + name + ", Age: " + age);
    }

    // Method to make sound
    public void makeSound() {
        System.out.println("This animal makes a sound.");
    }
}
