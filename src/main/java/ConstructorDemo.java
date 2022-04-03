// TODO:
//  https://ained.ttu.ee/javadoc/oop/oop-constructor.html

public class ConstructorDemo {
    public static void main(String[] args) {
        BookAuthor bookAuthor1 = new BookAuthor();
        bookAuthor1.setFirstName("Robert");
        bookAuthor1.setMiddleName("Cecil");
        bookAuthor1.setLastName("Martin");

        BookAuthor bookAuthor2 = new BookAuthor("Robert", "Cecil", "Martin");

        BookAuthor bookAuthor3 = new BookAuthor("Robert", "Martin");
        System.out.println("Finito!");
    }
}
