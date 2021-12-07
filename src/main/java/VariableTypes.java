public class VariableTypes {
    public static void main(String[] args) {
// todo: https://www.geeksforgeeks.org/data-types-in-java/
// todo: https://www.w3schools.com/java/java_data_types.asp
// todo: https://programming.guide/java/primitives-vs-objects-references.html

//todo:
//      Peamised primitiivsed muutujad (prim. m. tüübid alati väikese tähega)
        int i = 17;                     // Integer (täisarv)
        double d = 5.99;                // Ujukomaarv; murdarv
        char c = 'D';                   // Üksik täht
        boolean b = true;               // Tõeväärtus (true or false)

//todo:
//      Java objektid: Stringid, Array, jne
        String text = "Hello";
        int[] array = new int[]{1, 3, 5, 7};

//todo:
//      Oma loodud objektid (klassid)
        Person p = new Person();
        p.setName("Mari");
        p.setAge(36);

//todo:
//      primitiivide ja objektide mälu kasutus
//      primitiivide väärtused salvestatakse otse mällu
//      objektide puhul salvestakse viited mälu asukohale
        System.out.println();

    }
}
