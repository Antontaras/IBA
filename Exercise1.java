/*
Create a class containing an int and a char that are not initialized,
 and print their values to verify that Java performs default initialization.
 */
public class Exercise1 {

        public int a;
        public char b;


    public static void main(String... args){
       Exercise1 type = new Exercise1();
      System.out.println(type.a);
     System.out.println(type.b);
    }
}
