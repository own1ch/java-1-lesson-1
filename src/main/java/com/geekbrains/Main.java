package com.geekbrains;

public class Main {
    //Создаем hello world
    /*public static void main(String[] args) {
        System.out.println("Hello world");

        byte b = (byte) 127; // -128 до 127
        short s = (short) 10; // -32768 до 32767
        int i = 128; // -млн до млн
        long l = 19090L; // -млрд до млрд 9223372036854775807

        float f = 1.2f; //
        double d = 5.4;

        char c = 'c';

        boolean bool = false;

        String string = "Здесь я запишу свой текст";

        System.out.println(b + s);
        System.out.println(b - s);
        System.out.println(b * i);
        System.out.println(b / s);
        System.out.println(b % s);

        double result = (double) b / s;
        System.out.println(result);

        int intA = 10;
        int intB = 20;
        intA *= intB;
        intB -= intA;
        System.out.println(intA);
        System.out.println(intB);

        intB++;
        System.out.println(intB);

        String sValue = "123";
        int sVal = Integer.parseInt(sValue);
        System.out.println(sVal);


    }*/

    /*public static void main(String[] args) {
        int a = 400;
        int b = 300;

        if(a > b) {
            System.out.println("a > b");
        } else if(a < b) {
            System.out.println("a < b");
        } else if (a == b) {
            System.out.println("a = b");
        }

        String s = "Виталя";
        if(s.equals("Виталя")) {
            System.out.println("Привет Виталя!");
        }

        if(a > b || s.equals("Виталя")) {
            System.out.println("Профит!11111");
        }

        if(!(a>b)) {
            System.out.println("А не больше Б");
        }
    }*/

    public static void main(String[] args) {
        int result = plusInteger(1, 3);
        print(result);
        drawCat();
        String s1 = "Виталя";
        String s2 = "Привет";
        String s3 = s1 + s2;
        System.out.println(s1 + " " + s2);
        System.out.println(s2 + " " + result);
    }

    public static int plusInteger(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void drawCat() {
        System.out.println("           _..---...,\"\"-._     ,/}/)\n" +
                "        .''        ,      ``..'(/-<\n" +
                "       /   _      {      )         \\\n" +
                "      ;   _ `.     `.   <         a(\n" +
                "    ,'   ( \\  )      `.  \\ __.._ .: y\n" +
                "   (  <\\_-) )'-.____...\\  `._   //-'\n" +
                "    `. `-' /-._)))      `-._)))\n" +
                "      `...'         ");
    }


    public static void print(int b) {
        System.out.println(b);
    }


}
