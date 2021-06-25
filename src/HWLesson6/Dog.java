package HWLesson6;

public class Dog extends Animal {

    public static int countDog = 0;
    public static int maxRunDog = 500;
    public static int maxSwimDog = 10;
    public Dog(String name, float maxRun, float maxSwim) {
        super("Пес", name, maxRun, maxSwim);
        ++countDog;
    }

    @Override
    float getMaxRun() {
        return super.getMaxRun();
    }
}
