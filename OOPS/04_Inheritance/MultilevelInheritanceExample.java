class LivingThing {
    void breathe() {
        System.out.println("Breathing");
    }
}

class MammalType extends LivingThing {
    void walk() {
        System.out.println("Walking");
    }
}

class HumanType extends MammalType {
    void think() {
        System.out.println("Thinking");
    }
}

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        HumanType human = new HumanType();
        human.breathe();
        human.walk();
        human.think();
    }
}