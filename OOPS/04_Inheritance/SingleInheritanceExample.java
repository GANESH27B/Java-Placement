class AnimalBase {
    void eat() {
        System.out.println("Animal eats");
    }
}

class DogChild extends AnimalBase {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class SingleInheritanceExample {
    public static void main(String[] args) {
        DogChild dog = new DogChild();
        dog.eat();
        dog.bark();
    }
}