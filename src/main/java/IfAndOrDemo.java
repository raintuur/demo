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

        if (võrdneA == võrdneB && väike < suur) {
            System.out.println("PEAB välja printima rida 25");
        }

        if (võrdneA == võrdneB && väike < suur && suur > väike) {
            System.out.println("PEAB välja printima rida 29");
        }

        if (võrdneA == võrdneB && väike > suur && suur > väike) {
            System.out.println("EI TOHI välja printida rida 33");
        }

        booleanState = true && false && true;

        if (booleanState) {
            System.out.println("EI TOHI välja printida rida 39");
        }

        booleanState = true;

        //  todo: üks varasemalt nähud viga (booleanState == true)
        if (booleanState) {
            System.out.println("PEAB välja printima rida 46");
        }

        booleanState = false && false;

//-----------------------------------------------------------------------------------------
// todo:     ||  OR      (tõene, kui vähemalt üks pooltest on tõene)

        booleanState = true || true;

        booleanState = true || false;

        booleanState = false || true;

        booleanState = false || false;

        booleanState = false || false || false || false || false || false || false || true || false;

//-----------------------------------------------------------------------------------------
// todo:      && ja || kombineeritult

        booleanState = (true || false) && false;

        booleanState = (true && false) || true;

        booleanState = (true && false) || true || (true && false);

        booleanState = (true && false) || true && (false || false);

    }
}
