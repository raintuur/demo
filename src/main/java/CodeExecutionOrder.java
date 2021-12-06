public class CodeExecutionOrder {

    public static void main(String[] args) {

    //  todo: 1) teeme ühe näidise, et näidata, et kuidas kood jookseb ülevalt->alla
    //  todo:    prindime lihtsalt konsooli mingit teksti

    //  todo: 2) kasutame juurde ka teisi meetodeid printTextBlaBlaBla ja printTextEnglish

        System.out.println("Mingi tekst 1");
        System.out.println("Mingi tekst 2");
        System.out.println("Mingi tekst 3");
        System.out.println("Mingi tekst 4");
        System.out.println("Mingi tekst 5");

    }

    private static void printTextBlaBlaBla() {
        System.out.println("bla bla bla 1");
        System.out.println("bla bla bla 2");
        System.out.println("bla bla bla 3");
    }

    private static void printTextEnglish() {
        System.out.println("some text 1");
        System.out.println("some text 2");
        System.out.println("some text 3");
    }

}
