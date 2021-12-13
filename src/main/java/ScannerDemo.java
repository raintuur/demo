import java.util.Scanner;

public class ScannerDemo {
// todo: https://ained.ttu.ee/javadoc/input_output/input.html

// todo:
//      Skänneri abil saame konsoolist küsida mingeid väärtusi

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.printf("Palun sisesta tekst\n>");
        String stringInput = inputScanner.nextLine();

        System.out.printf("Palun sisesta täisarvuga number\n>");
        int intInput = inputScanner.nextInt();

        System.out.println("\nSisestasid tekstiks: " + stringInput);
        System.out.println("Sisestasid täisarvuks: " + intInput);

        inputScanner.close();
    }

}
