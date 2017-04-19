/*
 In the Initialization & Cleanup chapter,
 locate the Overloading.java example and add Javadoc documentation.
  Extract this comment documentation into an HTML file using Javadoc and view it with your Web browser.
 
 */


import static jdk.nashorn.internal.objects.Global.print;


   public class Tree {
        /**
         * add comments documentation
         *
         */
        int height;

        Tree() {
            print("Planting a seedling");
            height = 0;
        }

        Tree(int initialHeight) {
            height = initialHeight;
            print("Creating new Tree that is " + height + " feet tall");
        }

        void info() {
            print("Tree is " + height + " feet tall");
        }

        void info(String s) {
            print(s + ": Tree is " + height + " feet tall");
        }

    }


    class Overloading {


        public static void main(String[] args) {
            for (int i = 0; i < 5; i++) {
                Tree t = new Tree(i);

                t.info();
                t.info("overloaded method");
            }
            /**
             *  Overloaded constructor:
              */

            new Tree();
        }
}

