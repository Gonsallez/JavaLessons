package HWLesson6;

public class Cat extends Animal {

    public static int countCat = 0;

    public Cat(String name, float maxRun, float maxSwim) {
        super("Кот", name, maxRun, maxSwim);
        ++countCat;
    }

    @Override
    public int swim(float distance) {
        return Animal.SWIM_NONE;
    }

}

