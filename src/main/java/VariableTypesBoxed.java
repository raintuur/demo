import java.util.*;

public class VariableTypesBoxed {
    public static void main(String[] args) {
//todo:
//              Igal primitiivsel tüübil Javas on olemas oma analoog klassina:
//                  int         -> Integer
//                  double      -> Double
//                  char        -> Character
//                  boolean     -> Boolean


        Integer i = 17;         // Integer (täisarv)
        Double d = 5.99;        // Ujukomaarv; murdarv
        Character c = 'D';      // Üksik trükimärk (a-z, A-Z, 0-9, special characters @,$,€, jne)
        Boolean b = true;       // Tõeväärtus (true or false)

// todo:
//          Kui kasutate klasse primitiivse tüübi asemel, siis peate silmas pidama:
//          Objekt võib olla 'null'.
//          Objekte ei soovitata võrrelda == operaatoriga.

// todo:
//          Javas on olukordi, kus ei saa kasutada primitiivseid muutuja tüüpe
//          näiteks Map-ide ja List-ide kasutamisel.

//            Map<Integer, Double> map = new HashMap<>();
//            List<int> singleton = new ArrayList<>();


    }

}
