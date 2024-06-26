class Animal {

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Animals {

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeSound();
        Animal myDog = new Dog();
        myDog.makeSound();
        Animal myCat = new Cat();
        myCat.makeSound();  
    }
}
