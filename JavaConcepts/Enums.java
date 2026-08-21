enum Level {
    BEGINNER, INTERMEDIATE, ADVANCED
}

public class Enums {
    public static void main(String[] args) {
        Level level = Level.INTERMEDIATE;

        System.out.println("Level: " + level);
        System.out.println("Ordinal: " + level.ordinal());

        for (Level currentLevel : Level.values()) {
            System.out.println(currentLevel);
        }
    }
}