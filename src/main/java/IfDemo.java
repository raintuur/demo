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
            System.out.println("x: " + x + ", y: " + y + ", x == y (võrdne)");
            System.out.println();
        }

        if (väike == suur) {
            System.out.println("rida 43");
        }

//-----------------------------------------------------------------------------------------
//      !=	Not equal       x != y  (mitte võrdne)

//todo:
//      ! märk tähendab eitust (Inglise keeles negate)

        if (väike != suur) {
            x = väike;  y = suur;
            System.out.println("x: " + x + ", y: " + y + ", x != y (mitte võrdne)");
            System.out.println();
        }

        if (võrdneA != võrdneB) {
            System.out.println("rida 59");
        }

//  todo:
//      ! märgi (negate) kasutamise näited
        boolean booleanState = true;
        System.out.println(booleanState);

        booleanState = !booleanState;
        System.out.println(booleanState);

        booleanState = !booleanState;
        System.out.println(booleanState);
        System.out.println();


//  todo:
//      eituse näide Raamatukogu näitel

        String name = "Mari-Liis";
        if (personHasReturnedAllBooks(name)) {
            System.out.println("Mari-Liis on tagastanud kõiki raamatud. Ta on hea inimene");
            System.out.println();
        }

        name = "Karu Kati";
        if (!personHasReturnedAllBooks(name)) {
            System.out.println("Karu Kati ei ole tagastanud kõiki raamatud. Ta on võlglane!!! :(");
            System.out.println("Saadame Karu Katile meeldetuletuse, et tagastaks koheselt kõik raamatud:");
            /// süsteem otsib välja kõik võlgu olevad raamatud
            System.out.println("'Mõmmi aabits, '1000 retsepti - Mesi!', ....");
            System.out.println();
        }

//        !personlsAdult(name)
//        "!" eitusega kontrollitakse: person is NOT adult

//        !personHasValidDrivingLicense(name)
//        "!" eitusega kontrollitakse: person does NOT have valid driving license

//        !personlsAllowedToVote(name)
//        "!" eitusega kontrollitakse: person is NOT allowed to vote

//        !orderContainsProductNumber(productNumber)
//        "!" eitusega kontrollitakse: order does not NOT contain given product number

//-----------------------------------------------------------------------------------------
//      >	Greater than        x > y   (suurem)

        if (suur > väike) {
            x = suur;   y = väike;
            System.out.println("x: " + x + ", y: " + y + ", x > y (suurem)");
            System.out.println();
        }

        if (väike > suur) {
            System.out.println("rida 115");
        }

//-----------------------------------------------------------------------------------------
        //  <	Less than       x < y   (väiksem)

        if (väike < suur) {
            x = suur;   y = väike;
            System.out.println("x: " + x + ", y: " + y + ", x < y (väiksem)");
            System.out.println();
        }

        if (suur < väike) {
            System.out.println("rida 128");
        }

//-----------------------------------------------------------------------------------------
        //  <=	Less than or equal to	    x <= y  (väiksem või võrdne)

        if (9 <= 10) {
            x = 9;  y = 10;
            System.out.println("x: " + x + ", y: " + y + ", x <= y (väiksem või võrdne)");
            System.out.println();
        }

        if (10 <= 10) {
            x = 10; y = 10;
            System.out.println("x: " + x + ", y: " + y + ", x <= y (väiksem või võrdne)");
            System.out.println();
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

    private static boolean personHasReturnedAllBooks(String personName) {
        if (personName.equals("Mari-Liis")) {
            // Süsteemis tehakse kontroll, et kas Mari-Liis on tagastanud kõik raamatud.
            // Meie välja mõeldud näites on Mari-Liis kõik raamatud tagastanud.
            // seega tagastatakse 'true' ehk personHasReturnedAllBooks
            return true;
        }

        if (personName.equals("Karu Kati")) {
            // süsteemis tehakse kontroll, et kas Karu Kati on tagastaunud kõik raamatud
            // meie välja mõeldud näites on Karu Katil mõned raamatud tagastamata. Ta on võlglane.
            // siis tagastatakse 'false' ehk personHasReturnedAllBooks
            return false;
        }
        return true;
    }

}
