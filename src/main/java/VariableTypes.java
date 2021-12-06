public class VariableTypes {
    public static void main(String[] args) {
// todo: https://www.w3schools.com/java/java_data_types.asp
// todo: https://programming.guide/java/primitives-vs-objects-references.html

//todo:
//      Peamised primitiivsed muutujad
        int i = 17;                     // Integer (täisarv)
        double myDoubleNumber = 5.99;   // Ujukomaarv; murdarv
        char myLetter = 'D';            // Üksik täht
        boolean myBool = true;          // Tõeväärtus (true or false)


//todo:
//      Java objektid: Stringid, Array, jne
        String myText = "Hello";
        int[] myArray = new int[]{1, 2, 3, 4};

//todo:
//      Oma loodud objektid (klassid)
        Person p = new Person();
        p.age = 34;

//todo:
//      primitiivide ja objektide mälu kasutus
//      primitiivide väärtused salvestatakse otse mällu
//      objektide puhul salvestakse viited mälu asukohale
        System.out.println();


    }
}
