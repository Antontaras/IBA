/*
Exercise 9:   (2) Write a program that demonstrates that autoboxing works for all the primitive types and their wrappers.
 */
public class Exercise9 {

    public static void main (String... args){
        Integer a = 9;
        int secondA = 5;
        a = secondA;

        Boolean b = false;
        boolean secondB = true;
        b = secondB;

        Character c = 'c';
        char secondC = 'e';
        c = secondC;

        Double d = 4.2;
        double secondD = 0.2;
        d = secondD;

        Float e = 0.12f;
        float secondE = 0.1f;
        e = secondE;

        Long l = 125l;
        long secondL = 14l;
        l = secondL;

        Byte w = 7;
        byte secondW = 0;
        w = secondW;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(l);
        System.out.println(w);





    }
}
