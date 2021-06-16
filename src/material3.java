import java.util.Random;
import java.util.Scanner;
public class material3 {

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {

//        int[] myArrayInt = new int[4];
//        myArrayInt[0] = 15;
//        myArrayInt[1] = -20;
//        myArrayInt[2] = 0;
//        myArrayInt[3] = 11;
//
//        String[] myArrayString = new String[3];
//        myArrayString[0] = "Hello";
//        myArrayString[1] = " world";
//        myArrayString[2] = "!!!";
//
//        System.out.println("myArrayInt[0] = " + myArrayInt[0]);
//        System.out.println("myArrayInt[3] = " + myArrayInt[3]);
//        System.out.println("Result = " + myArrayString[0] + myArrayString[1] + myArrayString[2]);
//
//        float[] myArrayFloat = {15.8f, 20.6f, 323.99f}; // = new float[3]; myArrayFloat[0] = 15.8f; ...

//        String[] boxes = new String[10]; // Box1, Box2
//        String[] cats = new String[25]; //Cat1, Cat2

//        fillStringArray(boxes, "Box #");
//        fillStringArray(cats, "Cat #");
//
//        readStringArray(boxes);
//        readStringArray(cats);
//
//        String[] userArray = createStringArray(10);
//        readStringArray(userArray);
//
//        readStringArray(createStringArray(10));
//        /*
//        * Steps in readStringArray(createStringArray(10));
//        * 1) In method createStringArray - create new Array (String) size (value)
//        * 2) In method createStringArray - fill array -> value from method randomWord()
//        * 3) return Array(String) from createStringArray
//        * 4) transfer [Array(String) from createStringArray] in method readStringArray()
//        */

//        System.out.println("Random Float = " + random.nextFloat()); // [0;1)
//        System.out.println("Random Int = " + random.nextInt()); // [-int;+int]
//        System.out.println("Random Int [0;20] = " + random.nextInt(30)); // [0;+30]
//
//        for (int i = 0; i < 15; i++) {
//            System.out.print(randomIntRange(-20, 15) + " | ");
//        }

//        int valueUserChars = scanner.nextInt();
//        System.out.println("User's random word = " + randomWord(valueUserChars));
//        welcomeUser("Alex", " Petrovich", 38);
//        welcomeUser("Alex", 38, " Petrovich");

        int[][] myArrayInt2 = new int[10][10];

        fillArray2(myArrayInt2);
        readArray2(myArrayInt2);

    }

    public static void fillArray2(int[][] input) {
        int count = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                input[i][j] = count;
                count++;
            }
        }
    }

    public static void readArray2(int[][] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                System.out.print(input[i][j] + "\t");
            }
            System.out.println();
        }
    }

//    public static String[] createStringArray(int value) {
//        String[] tmpArray = new String[value];
//        fillStringArray(tmpArray, randomWord(value));
//        return tmpArray;
//    }
//
//
//    public static void fillStringArray(String[] input, String userValue) {
//        for (int i = 0; i < input.length; i++) {
//            input[i] = userValue + (i + 1);
//        }
//    }
//
//    public static void readStringArray(String[] input) {
//        for (int i = 0; i < input.length; i++) {
//            System.out.print(input[i] + " | ");
//        }
//        System.out.println();
//    }

//    public static void welcomeUser(String userName) {
//        System.out.println("Hello " + userName);
//    }
//
//    public static void welcomeUser(String userName, String userSurname) {
//        System.out.println("Hello " + userName + " " + userSurname);
//    }
//
//    public static void welcomeUser(String userName, String userSurname, int userAge) {
//        System.out.println("Hello " + userName + " " + userSurname + " (" + userAge + ")");
//    }
//
//    public static void welcomeUser(String userName, int userAge, String userSurname) {
//        System.out.println("Hello " + userName + " " + userSurname + " (" + userAge + ")");
//    }
//
//
//    public static String randomWord(int value) {
//        String tmpString = "";
//
//        for (int i = 0; i < value; i++) {
//            int valueAscii = randomIntRange(30, 60);
//            char tmpChar = (char)valueAscii;
//            tmpString += tmpChar;
//        }
//
//        return tmpString;
//    }
//
//    public static int randomIntRange(int min, int max) {
//        int diff = max - min;
//        int value = random.nextInt(diff + 1);
//        return min + value;
//    }
//
//    private static void studyScanner() {
//        String tmpContainer = scanner.next();
//
//        System.out.println("Hello " + tmpContainer);
//
//        int a = scanner.nextInt();
//        int result = 4 * a;
//        System.out.println("result = " + result);
//        scanner.close();
//    }
}
