// TODO: https://ained.ttu.ee/javadoc/oop/oop-override-vs-overload.html

public class MethodSignaturesDemo {

    public static void main(String[] args) {

        String name = "Grete";
        int age = 10;

        String firstName = "Kati";
        String lastName = "Karu";

        BookAuthor bookAuthor = new BookAuthor();
        bookAuthor.setFirstName("Robert");
        bookAuthor.setMiddleName("Cecil");
        bookAuthor.setLastName("Martin");

        tervitus(name);

        greeting(name);
        greeting(bookAuthor);
        greeting(name, age);
        greeting(firstName, lastName);
        greeting(lastName, firstName);

    }

    private static void tervitus(String name) {
        System.out.println("Tere, minu nimi on " + name);
    }

    private static void greeting(String name) {
        System.out.println("\nHello, my name is " + name);
    }

    private static void greeting(String name, int age) {
        System.out.println("\nHello, my name is " + name);
        System.out.println("I'm " + age + " years old");
    }

    private static void greeting(String firstName, String lastName) {
        System.out.println("\nHello, my name is " + firstName + " " + lastName);
    }

    private static void greeting(BookAuthor bookAuthor) {
        System.out.println("\nHello, my name is " + bookAuthor.getAuthorName());
    }


// TODO: Meil ei saa olla defineeritud ühe ja samasuguse nime ning signatuuriga meetodit
}
