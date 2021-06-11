package HWLesson2;
/**
 * Выполнил: Осыкин Александр
 * Факультет "Тестирование ПО"
 * Домашнее задание урока 2
 */
public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println(Ex1(10, 10));
        System.out.println("Задание 2");
        Ex2(-5);
        System.out.println("Задание 3");
        System.out.println(Ex3(3));
        System.out.println("Задание 4");
        Ex4("Java is so cute ♡" , 3);
        System.out.println("Задание 5");
        int Year = 2020;
        System.out.println(Year + " год високостный? > " + isLeapYear(Year));
    }
    // метод 1
    public static boolean Ex1(int a, int b) {
        int Result;
        Result = a + b;
        return (10 <= Result) && (Result <= 20);
    }
    // метод 2
    public static void Ex2(int a) {
        if (a >= 0) {
            System.out.println("число " + a + " положительное");
        } else {
            System.out.println("число " + a + " отрицательное");
        }
    }
    // метод 3
    public static boolean Ex3(int a) {
        return a <= 0; // true, если число отрицательное
    }
    // метод 4
    public static void Ex4(String value, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(value);
        }
    }
    // метод 5
    public static boolean isLeapYear(int a) {
        return (a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0);
    }
}
