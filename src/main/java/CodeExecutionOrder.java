public class CodeExecutionOrder {

    public static void main(String[] args) {

    //  todo: 1) vaatame kuidas kood käivitub/jookseb alati suunaga ülevalt->alla
    //  todo:    prindime lihtsalt konsooli mingit teksti

    //  todo: 2) kasutame juurde ka teisi meetodeid printOtherText ja printTextEnglish

        System.out.println("Mingi tekst 1");
        System.out.println("Mingi tekst 2");

        printTextEnglish();

        System.out.println("Mingi tekst 3");
        System.out.println("Mingi tekst 4");
    }

    private static void printOtherText() {
        System.out.println("Mingi muu tekst 1");
        System.out.println("Mingi muu tekst 2");
        System.out.println("Mingi muu tekst 3");
    }

    private static void printTextEnglish() {
        printOtherText();
        System.out.println("Some English text 1");
        System.out.println("Some English text 2");
        System.out.println("Some English text 3");
    }

}
