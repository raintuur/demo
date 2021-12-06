public class LocalVariableDemo {

    public static void main(String[] args) {
    //  todo: üldised näited muutujate kohta, kõike tüüpe hetkel ei käsitle
    //   1) muutuja näide 'String' (tekst) tüüpi muutujaga
    //   2) muutuja näide 'int' (täisarv) tüüpi muutujaga

        String studentName = "Mati";
        int studentAge = 20;


        System.out.println("Õpilase nimi on: " + studentName);
        System.out.println("Õpilase vanus on: " + studentAge);


        System.out.println();

        studentName = "Kati";
        studentAge = 19;


        System.out.println("Õpilase nimi on: " + studentName);
        System.out.println("Õpilase vanus on: " + studentAge);

    }
}
