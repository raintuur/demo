import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {

//todo:     Arrays = massiivid
//          kõige lihtsam on mõelda, et arrayd on kollektsioonid ühetaolistest asjadest
//          nt: margid, mündid, aia päkapikud, vms....

//todo:
//          Javas saavad olla siis kollektsioonid:
//              primitiivised väärtsused:
//                  täisarvud, komakohaga arvud, üksiktähed, jne
//              mistahes objektid:
//                  Enda loodud objektid, Java objektid (Stringid)

        int[] someNumbersCollection = new int[4];
        System.out.println(Arrays.toString(someNumbersCollection));

        someNumbersCollection[2] = 5;
        System.out.println(Arrays.toString(someNumbersCollection));

        someNumbersCollection[1] = 3;
        System.out.println(Arrays.toString(someNumbersCollection));

        someNumbersCollection[0] = 1;
        someNumbersCollection[3] = 7;
        System.out.println(Arrays.toString(someNumbersCollection));

// todo:    massiivis saavad elemendid olla vaid defineeritud tüüpi,
//          me ei saa massiivi elemente väärtustada mingi teist tüüpi väärtustega
//          someNumbersCollection[3] = "some text";
        System.out.println();

        System.out.println(someNumbersCollection[0]);

        int result = someNumbersCollection[0] + someNumbersCollection[3];
        System.out.println(result);
//todo:     Massiivide poole pöördudes peab jälgima piire (out of bounds).
        System.out.println();

//todo:     Näide Array loomisest andes talle kohe ka väärtused:
        System.out.println();
        String[] cars = new String[]{"Volvo", "BMW", "Ford", "Mazda"};
        String myFavouriteCar = cars[1];
        System.out.println(myFavouriteCar);

//todo:     Massiivid on alati kindla suurusega (kas defineerid suuruse, või annad kohe elemendid)
//          Massiivide indeksid algavad alati nullist.
//          Massiivide poole pöördudes peab jälgima piire (out of bounds) näide

    }

}
