public class IfElseIf {

    public static void main(String[] args) {
//  todo:
//        if (condition1) {
//            // block of code to be executed if condition1 is TRUE
//        } else if (condition2) {
//            // block of code to be executed if the condition1 is FALSE and condition2 is TRUE
//        } else {
//            // block of code to be executed if the condition1 is FALSE and condition2 is FALSE
//        }

        int x = 300;

        System.out.println("\nNäide if else if'iga");

        if (x < 0) {
            System.out.println("x on negatiivne");
        } else if (x == 0) {
            System.out.println("x on null");
        } else if (x <= 100) {
            System.out.println("x on 1 ja 100 vahepeal");
        } else if (x > 100 && x <= 200) {
            System.out.println("x on 101 ja 200 vahepeal");
        } else {
            System.out.println("x üle 200");
        }


//        System.out.println("\nNäide if'iga");
//
//        if (x < 0) {
//            System.out.println("x on negatiivne");
//        }
//
//        if (x == 0) {
//            System.out.println("x on null");
//        }
//
//        if (x < 0 && x <= 100) {
//            System.out.println("x on 1 ja 100 vahepeal");
//        }
//
//        if (x > 100 && x <= 200) {
//            System.out.println("x on 101 ja 200 vahepeal");
//        }
//
//        if (x > 200) {
//            System.out.println("x üle 200");
//        }

        System.out.println();


    }
}
