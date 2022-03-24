// TODO: https://ained.ttu.ee/javadoc/data_types/boolean-data-type.html#pohioperatsioonid

public class IfAndOrDemo {
    public static void main(String[] args) {
        // todo: Logical operators
        //  &&  AND     (tõene ainult, kui mõlemad pooled on tõesed)    x < 5 &&  x < 10
        //  ||  OR      (tõene, kui vähemalt üks pooltest on tõene)	    x < 5 || x < 10
        //  !   NOT     (inversioon)                                    !(x < 5)


        //  kood peaks olema alati Inglise keeles
        int väike = 10;
        int suur = 20;
        int võrdneA = 1;
        int võrdneB = 1;

        // todo: saab olla true või false
        boolean booleanState;
        System.out.println();

//-----------------------------------------------------------------------------------------
// todo:      &&  AND     (tõene ainult, kui mõlemad pooled on tõesed)

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
// todo:     ||  OR      (tõene, kui vähemalt üks pooltest on tõene)

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
