public class NegateDemo {

    public static void main(String[] args) {

        //  todo:
        //   ! märgi (negate) kasutamise näited

        boolean booleanState = true;
        System.out.println(booleanState);
        System.out.println(!booleanState);


        //  todo:
        //   eituse näide Raamatukogu näitel

        // Saadame kasutajale jõulukaardi
        String name = "Mari-Liis";
        if (personHasReturnedAllBooks("Mari-Liis")) {
            System.out.println("Saadame Mari-Liis'ile jõulukaardi\n");
        }

        // Saadame kasutajale meeldetuletuse, et ta tagastaks raamatud
        name = "Karu Kati";
        if (!personHasReturnedAllBooks("Karu Kati")) {
            System.out.println("Saadame Karu Katile meeldetuletuse");
        }

    }

    private static boolean personHasReturnedAllBooks(String personName) {
        if (personName.equals("Mari-Liis")) {
            // Süsteemis tehakse kontroll, et kas Mari-Liis on tagastanud kõik raamatud.
            // Meie välja mõeldud näites on Mari-Liis kõik raamatud tagastanud.
            // Seega tagastatakse 'true' ehk isik on tagastanud kõik raamatud
            return true;
        }

        if (personName.equals("Karu Kati")) {
            // Süsteemis tehakse kontroll, et kas Karu Kati on tagastaunud kõik raamatud
            // Meie välja mõeldud näites on Karu Katil mõned raamatud tagastamata. Ta on võlglane.
            // Siis tagastatakse 'false' ehk personHasReturnedAllBooks
            return false;
        }

        // kui on personName väärtuseks on mõni muu nimi siis jõutakse siia ja tagastatakse 'true'
        return true;
    }


    //  todo: Veel mõned näited

    //        !personlsAdult(name)
    //        "!" eitusega kontrollitakse: person is NOT adult

    //        !personHasValidDrivingLicense(name)
    //        "!" eitusega kontrollitakse: person does NOT have valid driving license

    //        !personlsAllowedToVote(name)
    //        "!" eitusega kontrollitakse: person is NOT allowed to vote

    //        !orderContainsProductNumber(productNumber)
    //        "!" eitusega kontrollitakse: order does not NOT contain given product number
}
