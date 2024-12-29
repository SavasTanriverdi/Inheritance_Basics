# Inheritance_Basics

This project demonstrates the use of inheritance in Java, focusing on the **super** keyword, **method overriding**, and adding extra attributes in subclasses. The example uses an `Animal` parent class and two subclasses, `Dog` and `Bird`, to showcase these concepts.

---

## Features
- **Inheritance**: Implements base class functionality in subclasses.
- **super Keyword**: Calls parent class constructors and methods from child classes.
- **Method Overriding**: Modifies the behavior of a method in a subclass.
- **Extra Features in Subclasses**: Adds subclass-specific attributes and methods.

---

## Code Overview

### 1. `Animal` Class
- **Attributes**:
    - `name`: Name of the animal.
    - `age`: Age of the animal.
- **Methods**:
    - `displayInfo()`: Displays the animal's name and age.
    - `makeSound()`: Generic method to simulate animal sounds.

### 2. `Dog` Class (Subclass)
- Inherits from `Animal`.
- **Extra Attribute**:
    - `breed`: Breed of the dog.
- **Overridden Methods**:
    - `makeSound()`: Outputs "Woof! Woof!".
    - `displayInfo()`: Displays additional breed information.

### 3. `Bird` Class (Subclass)
- Inherits from `Animal`.
- **Extra Attribute**:
    - `canFly`: Indicates whether the bird can fly.
- **Overridden Methods**:
    - `makeSound()`: Outputs "Tweet! Tweet!".
    - `displayInfo()`: Displays additional flight capability information.

---

## How to Run

1. Clone the repository or download the project files.
2. Open the project in an IDE such as **IntelliJ IDEA** or **Eclipse**.
3. Compile and run the `InheritanceBasics.java` file.

---

## Sample Output

```plaintext
Dog Information:
Animal Name: Buddy, Age: 3
Breed: Golden Retriever
Woof! Woof!

Bird Information:
Animal Name: Tweety, Age: 2
Can Fly: Yes
Tweet! Tweet!
