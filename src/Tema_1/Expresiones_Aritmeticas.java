package Tema_1;

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
        a = 2;
        b = 3;
        double c1 = 0.5;
        a *= b;
        a *= c1;
        a *= c1;
        a *= b;
        System.out.println(a); // a = 3

        // Programa expr6
        a = 2;
        b = 3;
        double c2 = 0.5;
        a *= b;
        a *= c2;
        a *= c2;
        a *= b;
        System.out.println(a); // a = 3
        

    }
}
