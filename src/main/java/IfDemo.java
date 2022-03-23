public class IfDemo {


    public static void main(String[] args) {
        System.out.println();

        // todo: Java Comparison Operators
        //  ==	Equal to 	                x == y  (võrdne)
        //  !=	Not equal                   x != y  (mitte võrdne)
        //  >	Greater than                x > y   (suurem)
        //  <	Less than	                x < y   (väiksem)
        //  >=	Greater than or equal to	x >= y  (suurem või võrdne)
        //  <=	Less than or equal to	    x <= y  (väiksem või võrdne)

        //  kood peaks olema alati Inglise keeles
        int x;
        int y;
        int väike = 10;
        int suur = 20;
        int võrdneA = 1;
        int võrdneB = 1;


//todo:
//        if (condition) {
//            // block of code to be executef the condition is true
//        }


//-----------------------------------------------------------------------------------------
//      ==	Equal to        x == y  (võrdne)
//todo:     NB! "Equal to" tavapärane viga  (== vs =)


        if (võrdneA == võrdneB) {
            x = võrdneA; y = võrdneB;
            System.out.println("x: " + x + ", y: " + y + ", x == y (võrdne)\n");
        }

        if (väike == suur) {
            System.out.println("rida 41 - konsooli ei prindi");
        }

//-----------------------------------------------------------------------------------------
//      !=	Not equal       x != y  (mitte võrdne)

//todo:
//      ! märk tähendab eitust (Inglise keeles negate/inversion)

        if (väike != suur) {
            x = väike;  y = suur;
            System.out.println("x: " + x + ", y: " + y + ", x != y (mitte võrdne)\n");
        }

        if (võrdneA != võrdneB) {
            System.out.println("rida 56 - konsooli ei prindi");
        }

//-----------------------------------------------------------------------------------------
//      >	Greater than        x > y   (suurem)

        if (suur > väike) {
            x = suur;   y = väike;
            System.out.println("x: " + x + ", y: " + y + ", x > y (suurem)\n");
        }

        if (väike > suur) {
            System.out.println("rida 103 - konsooli ei prindi");
        }

//-----------------------------------------------------------------------------------------
        //  <	Less than       x < y   (väiksem)

        if (väike < suur) {
            x = suur;   y = väike;
            System.out.println("x: " + x + ", y: " + y + ", x < y (väiksem)\n");
        }

        if (suur < väike) {
            System.out.println("rida 115 - konsooli ei prindi");
        }

//-----------------------------------------------------------------------------------------
        //  <=	Less than or equal to	    x <= y  (väiksem või võrdne)

        if (9 <= 10) {
            x = 9;  y = 10;
            System.out.println("x: " + x + ", y: " + y + ", x <= y (väiksem või võrdne)\n");
        }

        if (10 <= 10) {
            x = 10; y = 10;
            System.out.println("x: " + x + ", y: " + y + ", x <= y (väiksem või võrdne)\n");
        }

        if (20 <= 10) {
            System.out.println("rida 147");
        }

//-----------------------------------------------------------------------------------------
        //  <=	Less than or equal to	    x <= y  (väiksem või võrdne)
//todo:
//          Sama nagu eelmine näide ainult arvud on vastupidised.

        System.out.println();
    }

}
