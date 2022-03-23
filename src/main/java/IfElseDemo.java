public class IfElseDemo {
    public static void main(String[] args) {
//  todo:
//        if (condition) {
//            // block of code to be executed if the condition is true
//        } else {
//            // block of code to be executed if the condition is false
//        }

        //  kood peaks olema alati Inglise keeles
        int väike = 1;
        int suur = 10;

        if (väike < suur) {
            System.out.println("jah, 1 on väiksem kui 10");
        } else {
            System.out.println("siia koodi blokki me ei satu");
        }

        if (väike > suur) {
            System.out.println("siia koodi blokki me ei satu");
        } else {
            System.out.println("1 ei ole suurem kui 10");
        }


    }
}
