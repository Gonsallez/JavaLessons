package HWLesson3;
/**
 * Выполнил: Осыкин Александр
 * Факультет "Тестирование ПО"
 * Домашнее задание урока 3
 */
import java.util.Random;

public class HomeWork3 {
    public static Random random = new Random();
    public static void main(String[] args) {
// Задание 1
        System.out.println("Задание 1");
        int[] array1 = {1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1};
        printArray1(array1);
        binarychange(array1);
        printArray1(array1);

// Задание 2
        System.out.println("Задание 2");

        int[] array2 = new int[100];
        fillin(array2);
        printArray1(array2);

// Задание 3
        System.out.println("Задание 3");

        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        printArray1(array3);
        multiplication(array3);
        printArray1(array3);

// Задание 4
        System.out.println("Задание 4");

        int[][] array4 = new int[3][3];
        crossFill(array4);
        printArray2(array4);

// Задание 5
        System.out.println("Задание 4");

        int[] array5 = returnArray(6, 666);
        printArray1(array5);

// Задание 6
        System.out.println("Задание 6");

        int[] randomarray = new int[10];
        fillran(randomarray);
        printArray1(randomarray);
//        int[] array6 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 42};
//        printArray1(array6);
        System.out.println("6. Min: " + findMin(randomarray));
        System.out.println("6. Max: " + findMax(randomarray));

//        /*
//         * 6.   ** Написать метод, в который передается не пустой
//         * одномерный целочисленный массив, метод должен вернуть
//         * true если в массиве есть место, в котором сумма
//         * левой и правой части массива равны.
//         * Примеры: checkBalance([1, 1, 1, || 2, 1]) → true,
//         * checkBalance ([2, 1, 1, 2, 1]) → false,
//         * checkBalance ([10, || 10]) → true,
//         * граница показана символами ||, эти символы в массив не входят.
//         */
//        int[] balance = {1, 1, 1, 1, 1, 1, 6};
//        printArray1("6 Array for balance", balance);
//        System.out.println(checkBalance(balance));
    }
// Метод вывода одномерного массива
    public static void printArray1(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + "\t");
        }
        System.out.println();
    }
 //Метод вывода двумерного массива
    public static void printArray2(int[][] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[i].length; j++) {
                System.out.print(inputArray[i][j] + " ");
            }
            System.out.println();
        }
    }

// Метод задания 1
    public static void binarychange(int[] array) {
        for (int i = 0; i < array.length; i++)
        array[i] = (array[i] == 1) ? 0 : 1;
    }
// Метод задания 2
    public static void fillin(int[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] = i + 1;
    }
// Метод задания 3
    public static void multiplication(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6)
                array[i] *= 2;
        }
    }
// Метод задания 4
    public static void crossFill(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - 1 - i] = 1;
        }
    }
// Метод задания 5
    public static int[] returnArray(int len, int initialValue) {
        int[] tempArray = new int[len];

        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = initialValue;
        }

        return tempArray;
    }
// Метод задания 6
    public static void fillran(int[] array) {
    for (int i = 0; i < array.length; i++)
        array[i] = random.nextInt(30);
    }
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

//    public static boolean checkBalance(int[] array) {
//        int right = 0, left = 0;
//        for (int i = 0; i < array.length - 1; i++) {
//            left += array[i];
//            for (int j = i + 1; j < array.length; j++)
//                right += array[j];
//            if (left == right) return true;
//            right = 0;
//        }
//        return false;
//    }
}
