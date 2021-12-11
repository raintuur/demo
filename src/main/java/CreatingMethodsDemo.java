// TODO: https://ained.ttu.ee/javadoc/method/method-void.html?highlight=void
// TODO: https://programming.guide/java/primitives-vs-objects-references.html

public class CreatingMethodsDemo {


    public static void main(String[] args) {

        String name = "Mari-Liis";
        printGreeting(name);

//         System.out.println(printGreeting(name));

        int number = 10;

        int longVersionReturnedValue = multiplyByTwoLongVersion(number);

        System.out.println(longVersionReturnedValue);

        System.out.println(multiplyByTwoShortVersion(number));

        BookAuthor bookAuthor = new BookAuthor();
        bookAuthor.setFirstName(name);

        System.out.println("\nauthor name BEFORE changeValues(): " + bookAuthor.getFirstName());
        System.out.println("'number' value BEFORE changeValues(): " + number);

// TODO: changeValues() example

        changeValues(bookAuthor, number);

        System.out.println("\nauthor name AFTER changeValues(): " + bookAuthor.getFirstName());
        System.out.println("'number' value AFTER changeValues(): " + number);

        printGreeting(name);
    }

    private static void changeValues(BookAuthor someBookAuthor, int someNumber) {
        someBookAuthor.setFirstName("Grete");
        someNumber = 50;
    }

    private static void printGreeting(String someName) {
        System.out.println("Hello, my name is " + someName);
    }

    private static int multiplyByTwoLongVersion(int i) {
        i = i * 2;
        return i;
    }

    private static int multiplyByTwoShortVersion(int i) {
        return i * 2;
    }

}
