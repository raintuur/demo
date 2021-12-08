import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
// TODO:
//      https://ained.ttu.ee/javadoc/data_structures/list.html

// TODO:
//      List (ehk loend) on elementide kogumik.
//      Taustal toimetatakse Array'dega (massiivid).
//      List'i objektil on olemas üsna mõnusad meetodid,
//      millega on palju mugavam ja parem toimetada.


        List<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars);

        System.out.println(cars.get(2));

        cars.remove(2);
        System.out.println(cars);

        String selectedCar = cars.get(1);
        cars.remove(selectedCar);
        System.out.println(cars);

        cars.set(1, "Audi");
        System.out.println(cars);

    }
}
