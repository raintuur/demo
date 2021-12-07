public class IncrementDecrementVariable {
// TODO:    https://www.w3schools.com/java/java_operators.asp
//  Increment   ++      -> muutuja ÜHE VÕRRA suurendamine
//  Decrement   --      -> muutuja ÜHE VÕRRA vähendamine

    public static void main(String[] args) {

        int x = 0;
        x = x + 1;
        x++;
        x++;
        x++;
        x++;

        int y = 3;
        y--;
        y--;
        y--;
        y--;
        y--;


        int i = 0;
        System.out.println("Post-Increment");
        // i väärtust suurendatakse ühe võrra PÄRAST i väärtuse tagastamist.
        System.out.println(i++);
        System.out.println(i);


        int j = 0;
        System.out.println("Pre-Increment");

        // j väärtust suurendatakse enne ühe võrra
        // ja alles seejärel tagastakse j väärtus
        System.out.println(++j);
        System.out.println(j);
    }
    
}
