/*
 Write a program that demonstrates that,
 no matter how many objects you create of a particular class,
  there is only one instance of a particular static field in that class.
 */
public class Exercise8 {

    private static int task;

    public static int getTask() {
        return 1;
    }

    public static void main(String ... args){

         Exercise8 ex = new Exercise8();
        System.out.println(ex.getTask());
        Exercise8 ex2 = new Exercise8();
        System.out.println(ex2.getTask());
    }
}
