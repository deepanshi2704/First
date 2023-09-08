interface AnimalEat {
    void eat();
}

interface AnimalTravel {
    void travel();
}

class Animal implements AnimalEat, AnimalTravel {
    public void eat() {
        System.out.println("Animal is eating");
    }

    public void travel() {
        System.out.println("Animal is traveling");
    }

    public void walk() {
        System.out.println("Animal is walking");
    }

    public void fly() {
        System.out.println("Animal is flying");
    }
}

public class first {
    public static void main(String args[]) {
        Animal a = new Animal();
        a.eat();
        a.travel();
    }
}