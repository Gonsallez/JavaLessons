package HWLesson6;

public class runswim {

    public static void main(String[] args) {
        String WinEvent = " и это получилось.";
        String FailedEvent = " и это не получилось.";
        String eventName;
        String eventResult;


        Cat cat1 = new Cat("Мурзик", 200, 0);// максимальное расстояние для каждого животного
        Cat cat2 = new Cat("Пух", 200,  0);
        Dog dog1 = new Dog("Шарик", 500, 10);
        Dog dog2 = new Dog("Нолик", 500, 10);

        Animal[] Animals = {cat1, cat2, dog1, dog2};

        float runLength = 250;// длина дистанции бега
        float swimLength = 100;// длина дистанции заплыва

        for (int i = 0; i < Animals.length; i++) {
            String nameString = Animals[i].getType() + " " + Animals[i].getName() + " может ";

            eventName = "пробежать " + Animals[i].getMaxRun() + "м. Пытается пробежать ";
            eventResult = Animals[i].run(runLength) ? WinEvent : FailedEvent;
            result(nameString, eventName, runLength, eventResult);

            int swimResult = Animals[i].swim(swimLength);
            eventName = "проплыть " + Animals[i].getMaxSwim() + "м. Попытка проплыть ";
            eventResult = (swimResult == Animal.SWIM_OK) ? WinEvent : FailedEvent;

            if (swimResult == Animal.SWIM_NONE)
                eventResult = " провалена, т.к. Коты не умеют плавать!";
            result(nameString, eventName, swimLength, eventResult);
        }
        System.out.println("______________________________________");
        System.out.println("Все животные: " + Animal.countAnimal);
        System.out.println("Количество котов: " + Cat.countCat);
        System.out.println("Количество собак: " + Dog.countDog);
        diedanimals();
    }

    private static void result(String nameAnimal, String event, float eventLength, String resultEvent) {
        System.out.println(nameAnimal + event + eventLength + "м" + resultEvent);
    }
    public static void diedanimals(){
        int aliveanimals;
        int deadanimals;
        int alldead;
        aliveanimals = Animal.countAnimal;
        deadanimals = Cat.countCat + Dog.countDog;
        alldead = aliveanimals - deadanimals;
        System.out.println("Количество животных после соревнований: " + alldead);
    }
}

