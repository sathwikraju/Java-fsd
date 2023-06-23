package practice_problem_9;

interface Animal {
    void sound();
}

interface Cat extends Animal {
    default void sound() {
        System.out.println("Meow");
    }
}

interface Dog extends Animal {
    default void sound() {
        System.out.println("Woof");
    }
}

class CatDog implements Cat, Dog {
    public void sound() {
        // Resolve the diamond problem by explicitly calling the desired superclass method
        Cat.super.sound(); // Resolves to Cat's sound() method
        Dog.super.sound(); // Resolves to Dog's sound() method
    }
}

public class Diamond_Problem {
    public static void main(String[] args) {
        CatDog cd = new CatDog();
        cd.sound();
    }
}
