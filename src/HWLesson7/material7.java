package HWLesson7;
import java.util.Scanner;
public class material7 {

        public static void main(String[] args) {


//        String s0 = "Hello_Java";
//        String s1 = "Hello_";
//        s1 += "Java";
//
//        String s2 = scanner.nextLine(); //Hello_Java
//        String s3 = "Hello_Java";
//
//        System.out.println("s0 = " + s0);
//        System.out.println("s1 = " + s1);
//        System.out.println("s2 = " + s2);
//        System.out.println("***");
//        System.out.println("s0 == s1 > " + (s0 == s1)); //
//        System.out.println("s0 == s2 > " + (s0 == s2));
//        System.out.println("s0 == s3 > " + (s0 == s3));
//        System.out.println("s0 == s1 > " + s0.equals(s1));
//        System.out.println("s0 == s2 > " + s0.equals(s2));
//        System.out.println("s0 == s3 > " + s0.equals(s3));
            int[] value = {0,0,0,0,0,0};
            System.out.println(value.toString() + " Nina");

            for (int i = 0; i < value.length; i++) {
                System.out.print(value[i]);
            }
            System.out.print(" Nina");


            String testString = "ExampleText";
            StringBuilder testStringBuilder = new StringBuilder("ExampleText");

            long startTime = System.nanoTime(); //timestamp Unix 1624471561 (GMT: Wednesday, 23 June 2021 г., 18:06:01)

            for (int i = 0; i < 50000; i++) {
                testString += i; //ExampleText012345678910...49999
            }

            float deltaTime = System.nanoTime() - startTime;
            System.out.println(testString);
            System.out.println("Time String > " + deltaTime * 0.000001f + " millisec.");

            startTime = System.nanoTime();

            for (int i = 0; i < 50000; i++) {
                testStringBuilder.append(i); // //ExampleText012345678910...49999
            }
            deltaTime = System.nanoTime() - startTime;
            System.out.println(testStringBuilder.toString());
            System.out.println("Time SB > " + deltaTime * 0.000001f + " millisec.");
            System.out.println(testString.equals(testStringBuilder.toString()));

        }
}
