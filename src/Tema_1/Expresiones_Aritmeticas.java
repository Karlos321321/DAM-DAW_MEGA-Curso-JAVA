package Tema_1;

/*********************
Modificado desde el PC 
*********************/

public class Expresiones_Aritmeticas {

    static int a = 3;
    static int b = 2;
    static int d = 0;

    public static void main(String[] args) {

        // Programa expr3 
        int c = a + b;
        c *= a;
        c--;
        System.out.println(c); // c = 14

        // Programa expr4
        a = 2;
        b = 1;
        c = a%b;
        d = c-b;
        d += a+b+c;
        System.out.println(d); // d = 2

        // Programa expr5
        double a2 = 2;
        double b2 = 3;
        double c1 = 0.5;
        a2 *= b2;
        a2 *= c1;
        a2 *= c1;       
        a2 *= b2;
        System.out.println(a2); // a2 = 4.5

        // Programa expr6;
        int a3 = 2;
        int b3 = 3;
        double c3 = 0.5;
        a3 *= b3;
        a3 *= c3;
        a3 *= c3;
        a3 *= b3;
        System.out.println(a3); // a = 3


    }
}
