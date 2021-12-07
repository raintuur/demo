public class VariableTypes {
    public static void main(String[] args) {
// todo: https://www.geeksforgeeks.org/data-types-in-java/
// todo: https://www.w3schools.com/java/java_data_types.asp
// todo: https://programming.guide/java/primitives-vs-objects-references.html

//todo:
//      Peamised primitiivsed muutujad (prim. m. tüübid algavad alati väikese tähega)
//      Ei saa olla null (olematu) väärtusega

        int i = 17;                     // Integer (täisarv)
        double d = 5.99;                // Ujukomaarv; murdarv
        char c = 'D';                   // Üksik trükimärk (a-z, A-Z, 0-9, special characters @,$,€, jne)
        boolean b = true;               // Tõeväärtus (true or false)



//todo:
//      Java objektid: Stringid, Array, jne
        String myText = "Hello";
        int[] myArray = new int[]{1, 3, 5, 7};

//todo:
//      Oma loodud klasside objektid
        Student s = new Student();
        s.setName("Mari");
        s.setAge(36);
        s.setClassGroup('A');
        s.setGraduated(true);

        System.out.println(s);

//todo:
//      primitiivide ja objektide mälu kasutus
//      primitiivide väärtused salvestatakse otse mällu
//      objektide puhul salvestakse viited mälu asukohale
        System.out.println();

    }
}
