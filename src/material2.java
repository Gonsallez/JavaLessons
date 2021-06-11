public class material2 {

    /**
     * Created by Aleksandr Gladkov [Anticisco]
     * Date: 05.06.2021
     */


        public static int valueInClass = 999;

        public static void main(String[] args) {
            table(10,10);

//        int valueInMethod = 998;
//
//        System.out.println(valueInClass);
//        System.out.println(valueInMethod);

//        int a = 20;
//        int b = 15;
//        int result;
//
//        if (a > b) {
//            result = a;
//        } else {
//            result = b;
//        }
//
//        result = (a > b) ? a : b;// тернарный оператор (переменные)
//        result = (a > b) ? doSomething1() : doSomething2();// тернарный оператор (методы)
//
//        System.out.println("Result = " + result);

//        String nameLetter = "Qwerty";
//
//        if (nameLetter == "Olga") {
//            System.out.println("Give letter to Olga");
//        } else if (nameLetter == "Boris") {
//            System.out.println("Give letter to Boris");
//        } else if (nameLetter == "Maria") {
//            System.out.println("Give letter to Maria");
//        } else if (nameLetter == "Alex") {
//            System.out.println("Give letter to Alex");
//        } else {
//            System.out.println("Go out office");
//        }
//
//        System.out.println("***********");
//
//        switch (nameLetter) {
//            case "Olga": // if (nameLetter == "Olga") {
//                System.out.println("Give letter to Olga");
//                break; //}
//            case "Boris":  // if (nameLetter == "Boris") {
//                System.out.println("Give letter to Boris");
//                break;
//            case "Maria":
//                System.out.println("Give letter to Maria");
//                break;
//            case "Alex":
//                System.out.println("Give letter to Alex");
//                break;
//            default:
//                System.out.println("Go out office");
//                break;
//        }

//        for (int i = 0; i < 10; i++) { // i++ -> i = i + 1 // i-- -> i = i - 1
//            System.out.print(i + " ");
//        }

//        for (int i = 0; i < 10; i++) {  //вложенный цикл
//            for (int j = 0; j < 5; j++) {
//
//            }
//        }

//        System.out.println("Result = " + myMath(2, 10)); //1024
        }

        public static void table(int width, int height) {
            for (int y = 1; y < height; y++) {
                for (int x = 1; x < width; x++) {
                    System.out.print(y * x + "\t");
                }
                System.out.println();
            }
        }

//    public static int myMath(int base, int signature) {
//        int result = 1;
//
//        for (int i = 1; i <= signature ; i++) {
//            result = result * base;
//        }
//
//        return result;
//    }

//    public static void method3() {
//        if () {
//            System.out.println(valueInClass);
//            System.out.println(valueInMethod);
//        } else {
//
//        }
//
//        switch () {
//
//        }
//    }

//    public static int doSomething1() {
//        ///....
//        return 45;
//    }
//
//    public static int doSomething2() {
//        ///....
//        return 80;
//    }


}
