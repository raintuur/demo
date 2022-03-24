public class IfAndOrDemo {
    public static void main(String[] args) {
        // todo: Logical operators
        //  && 	returns true if BOTH statements are TRUE	        x < 5 &&  x < 10
        //  || 	returns true if ONE of the statements is TRUE	    x < 5 || x < 10
        //  !	returns false if the result is true	                !(x < 5 && x < 10)


        //  kood peaks olema alati Inglise keeles
        int väike = 10;
        int suur = 20;
        int võrdneA = 1;
        int võrdneB = 1;

        // todo: saab olla true või false
        boolean booleanState;
        System.out.println();

//-----------------------------------------------------------------------------------------
// todo:      &&    AND operator    returns true if BOTH statements are true

        booleanState = võrdneA == võrdneB && väike < suur;

        if (võrdneA == võrdneB && väike < suur) {
            System.out.println("PEAB välja printima rida 25");
        }


        booleanState = võrdneA == võrdneB && väike < suur && suur > väike;

        if (võrdneA == võrdneB && väike < suur && suur > väike) {
            System.out.println("PEAB välja printima rida 32");
        }


        booleanState = võrdneA == võrdneB && väike > suur && suur > väike;

        if (võrdneA == võrdneB && väike > suur && suur > väike) {
            System.out.println("EI TOHI välja printida rida 39");
        }


        booleanState = true && false && true;

        if (true && false && true) {
            System.out.println("EI TOHI välja printida rida 46");
        }


        booleanState = true;

        //  todo: üks varasemalt nähud viga (booleanState == true)
        if (booleanState) {
            System.out.println("PEAB välja printima rida 54");
        }


        booleanState = false && false;

        if (booleanState) {
            System.out.println("EI TOHI välja printida rida 61");
        }


//-----------------------------------------------------------------------------------------
// todo:     ||	OR operator     returns true if ONE of the statements is true

        booleanState = true || true;

        if (booleanState) {
            System.out.println("PEAB välja printima rida 71");
        }


        booleanState = true || false;

        if (booleanState) {
            System.out.println("PEAB välja printima rida 78");
        }


        booleanState = false || true;

        if (booleanState) {
            System.out.println("PEAB välja printima rida 85");
        }


        booleanState = false || false;

        if (booleanState) {
            System.out.println("EI TOHI välja printida rida 92");
        }


        booleanState = false || false || false || false || false || false || false || true || false;

        if (booleanState) {
            System.out.println("PEAB välja printima rida 99");
        }


//-----------------------------------------------------------------------------------------
// todo:      && ja || kombineeritult


        booleanState = (true || false) && false;

        if (booleanState) {
            System.out.println("EI TOHI välja printida rida 110");
        }


        booleanState = (true && false) || true;

        if (booleanState) {
            System.out.println("PEAB välja printima rida 117");
        }


        booleanState = (true && false) || true || (true && false);

        if (booleanState) {
            System.out.println("PEAB välja printima rida 124");
        }


        booleanState = (true && false) || true && (false || false);

        if (booleanState) {
            System.out.println("EI TOHI välja printida rida 131");
        }

    }
}
