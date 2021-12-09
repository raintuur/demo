import java.util.ArrayList;
import java.util.List;

public class UserCreatedClassDemo {

    public static void main(String[] args) {
// TODO:
//          Loon uue klassi 'BookAuthor' järgnevate väljadega:
//              firstName
//              middleName
//              lastName

// TODO:
//          Loon uue klassi 'Book' järgnevate väljadega:
//              title
//              yearPublished
//              author

// TODO:
//          Teen mõned näited, et kuidas ma neid kasutan ja kuidas kood käitub


        Book book1 = new Book();
        book1.setTitle("Clean Code");
        book1.setYearPublished(2009);

        BookAuthor bookAuthor1 = new BookAuthor();
        bookAuthor1.setFirstName("Robert");
        bookAuthor1.setLastName("Martin");

        book1.setAuthor(bookAuthor1);

        bookAuthor1.setMiddleName("Cecil");

        Book book2 = new Book();
        book2.setTitle("Sipsik");
        book2.setYearPublished(1962);
        book2.setAuthor(new BookAuthor());

        book2.getAuthor().setFirstName("Eno");
        book2.getAuthor().setLastName("Raud");

        List<Book> myFavouriteBooks = new ArrayList<>();
        myFavouriteBooks.add(book1);
        myFavouriteBooks.add(book2);

        myFavouriteBooks.get(0).getAuthor().setMiddleName("C.");


    }
}
