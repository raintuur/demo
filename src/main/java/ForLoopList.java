import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForLoopList {
    public static void main(String[] args) {
        List<BookAuthor> bookAuthors = new ArrayList<>();

        bookAuthors.add(new BookAuthor("Robert","Martin"));
        bookAuthors.add(new BookAuthor("Eno","Raud"));
        bookAuthors.add(new BookAuthor("Oskar","Luts"));

        // TODO: for loop
        for (BookAuthor bookAuthor : bookAuthors) {
            System.out.println(bookAuthor.getAuthorName());
            bookAuthor.setLastName("Mingi nimi");
        }

        // TODO: saaks teha ka for indeks loopi
        for (int i = 0; i < bookAuthors.size(); i++) {
            System.out.println(bookAuthors.get(i).getAuthorName());
        }

        // TODO: aga miks me Array näites ei kasutanud
        //  for loopi (ilma indeksita)

        int[] myArray = new int[]{1, 2, 3, 4};
        System.out.println("\nmyArray ENNE loopi");
        System.out.println(Arrays.toString(myArray));

        for (int i : myArray) {
            i = 9;
            System.out.println();
        }

        System.out.println("\nmyArray PEALE loopi");
        System.out.println(Arrays.toString(myArray));

    }
}
