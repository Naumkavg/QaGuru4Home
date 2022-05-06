package home4;

public class Home4Operators {

    // Примитивные типы данных
    byte aByte; // 8 bit -128 ... 127
    short aShort = 100; // 16 bit -32768 ... 32767
    int aInt = 1_100_000; // 32 bit -2 ^ 31 ... (2 ^ 31) -1   самый используемый
    long aLong = 100L; // 64 bit -2 ^ 63 ... (2 ^ 63) -1

    float aFloat = 0.0F; // 32 bit
    double aDouble = 0.0D; // 64 bit   самый используемый (если просто хранить, но не использовать арифметику)

    char aChar = 'c';
    boolean aBoolean = false;

    // Ссылочный тип данных
    String aString = "hello , qa.guru!";

    public static void main(String[] args) {
        // + -- сложение
        // - -- вычитание
        // * -- умножение
        // / -- целочисленное деление
        // % -- остаток от деления
        // инкремент ++
        // декремент --

        //тип данных boolean будет true или  false читай ниже
        // >
        // <
        // >=
        // <=
        // ==
        // !=

        // =
        // +=
        // -=

        // && (&)
        // || (|)
        // !

        byte z = 8;
        int i =95, m = 67;
        long l = 540_000_000_000L;

        System.out.println((m + i) > (i - m));
        System.out.println(m * i);
        System.out.println(m / i);
        System.out.println(m % i);
        System.out.println(i += m);

        System.out.println(l + m);

        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

        System.out.println(z > i);
        System.out.println(m != i);



        float f = 0.7F;
        double d = 7.89D;

        System.out.println(((f - d) > 0) && ((d - f) > 0));
        System.out.println(((f - d) > 0) || ((d - f) > 0));
        System.out.println(d / f);
        System.out.println(d % f);

        char c = 'x', t = 'y';
        boolean finish = true;

        System.out.println(c + t);
        System.out.println(finish);
    }

}
