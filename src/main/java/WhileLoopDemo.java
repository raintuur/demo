// TODO: https://ained.ttu.ee/javadoc/control_flow/loop.html

import java.util.Scanner;

public class WhileLoopDemo {

    public static void main(String[] args) {

// todo   Süntaks:
//        while (condition) {
//            do something.... Multiple times.....
//        }

        Scanner scanner = new Scanner(System.in);

        int intInput = 0;

        while (intInput != 10) {
            System.out.println("Palun sisesta number 10");
            intInput = scanner.nextInt();
            System.out.println("Sisestasid numbri: " + intInput);
            System.out.println();
        }


        int i = 0;

        while (i < 3) {
            System.out.println("\ni väärtus: " + i);
            i++;
            System.out.println("i väärtus peale i++: " + i);
            System.out.println();
        }


        System.out.println("Finito!");


    }
}
