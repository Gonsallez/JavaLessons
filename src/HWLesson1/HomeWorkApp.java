package HWLesson1;

/**
     * Выполнил: Осыкин Александр
     * Факультет "Тестирование ПО"
     */
    public class HomeWorkApp {
        //метод main
        public static void main(String[] args) {

            printThreeWords(); // задание 2

            System.out.println(" ");

            checkSumSign(); // задание 3

            System.out.println(" ");

            System.out.println(printColor(-1)); // задание 4
            System.out.println(printColor(100));
            System.out.println(printColor(500));


            System.out.println(" ");

            System.out.println(compareNumbers(1, 2)); // задание 5


        }
        // задание 2
        public static void printThreeWords() {
            System.out.println("_Orange");
            System.out.println("_Banana");
            System.out.println("_Apple");
        }
        // задание 3
        public static boolean checkSumSign(int a, int b) {
            return (a + b) >= 0;
        }
        public static void checkSumSign() {
            int a = -2;
            int b = 1;
            if ((a + b) >= 0) {
                System.out.println("Сумма положительная"); //если больше нуля
            } else {
                System.out.println("Сумма отрицательная");//если меньше нуля
            }
        }
        // задание 4
        public static String printColor(int value) {
            if (value <= 0) {
                return "Красный";
            } else if (value > 0 && value <= 100) {
                return "Желтый";
            } else {
                return "Зеленый";
            }
        }
        // задание 5
        public static String compareNumbers(int a, int b) {
            if (a >= b) {
                return "a >= b";
            } else {
                return "a < b";
            }
        }

    }
