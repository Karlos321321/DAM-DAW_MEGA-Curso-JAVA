package Tema_1;

public class Expresiones_Aritmeticas_2 {

    static boolean a = false;
    static boolean b = false;
    static boolean c = false;

    public static void main(String[] args) {

        // Programa expr 7
        a = 1 > 2;
        b = 1 < 2;
        c = (1 * 2 + 1) > (1 + 2 * 1);

        System.out.println(a); // a = false
        System.out.println(b); // b = true
        System.out.println(c); // c = false

        System.out.println("-----------------------------");

        // Programa expr 8
        int x = 5;
        int y = 1;
        boolean b1 = false;
        boolean b2 = false;
        boolean b3 = false;

        b1 = x != y;
        b2 = x < y;
        b3 = (x + y) == 6;

        System.out.println(b1); // b1 = true
        System.out.println(b2); // b2 = false
        System.out.println(b3); // b3 = true

        // Programa expr 9
        a = 4 > 5;
        b = 6 != 3;
        c = a == b;

        System.out.println(a); // a = false
        System.out.println(b); // b = true
        System.out.println(c); // c = false

        // Programa expr 10

        x = 6;
        b1 = x <= 7;
        System.out.println(b1); // b1 = true

        b2 = (4 + x) > 10;
        System.out.println(b2); // b2 = false

        b1 = b2;
        System.out.println(b1); // b1 = false

        b1 = b1 == b2;
        System.out.println(b1); // b1 = true

    }
}
