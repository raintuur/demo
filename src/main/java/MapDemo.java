import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
// todo: https://ained.ttu.ee/javadoc/data_structures/map.html?highlight=hashmap


// todo:
//          Map on elementide kogumik.
//          Map'i elemendid koosnevad kaheosalistest kirjetest:
//              võtmed      - key
//              väärtused   - value

// todo:
//          Võtmed peavad olema unikaalsed (võtmed ei saa korduda).
//          Võti on alati seotud ühe väärtusega.
//          Võtme abil saab kiiresti üles leida vastava väärtuse.


        Map<String, Double> accountsMap = new HashMap<>();

        accountsMap.put("EE001", 4.70);
        accountsMap.put("EE002", 20.10);
        accountsMap.put("EE003", 50.90);

        System.out.println(accountsMap.get("EE001"));
        System.out.println(accountsMap.get("EE002"));
        System.out.println(accountsMap.get("EE123"));

        System.out.println(accountsMap.remove("EE002"));

        System.out.println(accountsMap.size());

        String accountNumber = "EE001";
        Double amountToAdd = 10.00;

        Double balance = accountsMap.get(accountNumber);

        Double newBalance = balance + amountToAdd;

        accountsMap.put(accountNumber, newBalance);

        System.out.println(accountsMap);

// todo:
//      Võrreldes Array'ga, on Map'i dünaamiliste suurustega.
//      Lisaks HashMap’ile on võimalik kasutada veel LinkedHashMap ja TreeMap objekte.
    }

}
