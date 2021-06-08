public class material1 {
//one line comment

/*
multiline comment
 */

/**
 * JavaDoc comment
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 02.06.2021
 */

    public static void main(String[] args) {
//        System.out.println("Privet Mir"); //
//        System.out.println("Hello Java"); //
//        System.out.println("שלום עולם"); //
//
//        String myFirstString = "My First Value";
//        System.out.println("My first message " + myFirstString);

//        //целые числа
//        byte myByte = 35; //-128..127 (1 byte)
//        short myShort = 350; //-32768..+32767 (2 bytes)
//        int myInteger = 5412058; //-2.1млдр..+2.1млрд (4 bytes) //default
//        long myLong = 3500000000L; //-2^63 .. +2^63 (8 bytes)
//
//        System.out.println("Value in myInteger is " + myInteger);
//
//        //числа с точкой
//        float myFloat = 15.456f; // (4 bytes) <>.0000000
//        double myDouble = 15.456; // (8 bytes) <>.00000000000000 //default
//
//        //symbols
//        char myChar = 'Q'; //(2 bytes)
//        System.out.println(myChar + " " + myDouble);
//
//        //boolean
//        boolean myBoolean = true; // = false; //(1 bytes)
//        System.out.println("Value my boolean is " + myBoolean);

        //+,-,*,/,^
//
//        float a = 15;
//        float b = 4;
//        float c = a % b;
//        System.out.println(c);

//        int a = 45;
//        System.out.println("Hello");
//
//        if (a == 30) {
//            System.out.println("a = 30");
//        } else {
//            System.out.println("a <> 30");
//        }
//
//        int b = 250;
//        if (b > 20) {
//            System.out.println("b > 20");
//        } else if (b > 200) {
//            System.out.println("b > 200");
//        } else {
//            System.out.println("Unknown!");
//        }
//
//        int c = 500;
//        if (c > 1000) {
//            System.out.println("c > 1000");
//        }

//        int a1 = 150;
//        int a2 = 350;
//        int result;
//
//        result = myMath(a1, a2);
//        a1 = a1 + 1;
//        result = myMath(a1, a2);
//        a2 = a2 + 1;
//        result = myMath(a1, a2);
//        a1 = a1 + 1;
//        result = myMath(a1, a2);
//        a2 = a2 + 1;
//        result = myMath(a1, a2);
//
//        System.out.println("Result = " + result); //504
        int abc = 450;
        doSomething1();
        doSomething2("MyString", abc, 15.0f, 'W');
    }

    public static int myMath(int myValue1, int myValue2) { // возвращающий тип метода
        return myValue1 + myValue2;
    }

    public static void doSomething1() { // ничего не возвращающий метод
        System.out.println("Hello from method doSomething1");
    }

    public static void doSomething2(String v1, int v2, float v3, char v4) {
        System.out.println("Hello from method doSomething2 > " + v1 + ":" + v2 + "=" + v3 + "-" + v4);
    }


}

