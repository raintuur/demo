
public class ModuloDemo {

    // todo:     mod/modulo
    //  https://et.wikipedia.org/wiki/Jagatis
    //    jagatav : jagaja = jagatis (täisosa) ja jääk   (modulo on siis jääk)

    // todo: mod

    // todo:    Näiteks jagamisülesande 13 : 5 puhul on jagatise täisosa 2 ja jääk on 3.
    //          Kõige klassikalisem modulo kasutamine:
    //          n % 2 (ehk mingit arvu jagatakse 2-ga)


    public static void main(String[] args) {
        int n = 2;
        studyExample(n);

        boolean isEven = isEvenNumber(n);
        System.out.println("\nNumber " + n + " on paaris arv: " + isEven);

        boolean isOdd = isOddNumber(n);
        System.out.println("\nNumber " + n + " on paaritu arv: " + isOdd);

    }

    private static boolean isEvenNumber(int n) {
        // 2 % 2 = 0
        // 4 % 2 = 0
        // 6 % 2 = 0
        return n % 2 == 0;
    }

    private static boolean isOddNumber(int n) {
        // 3 % 2 = 1
        // 5 % 2 = 1
        // 7 % 2 = 1
        return n % 2 == 1;
    }


    private static void studyExample(int n) {
        System.out.println("\n");
        int lenght = 5;

        for (int i = 0; i <= lenght; i++) {
            System.out.println(i + " % " + n + " = " + i % n);
        }

        System.out.println("\n");

        System.out.println("jagatav : jagaja =\nmitu korda mahub\t\t\tjäägi leidmine");
        for (int i = 0; i <= lenght; i++) {
            System.out.println(i + ":" + n + " = " + i / n + "\t\t\t\t\t\t " + i + " - (" + n + "*" + i / n + ") = " + i % n);
        }

    }


}

