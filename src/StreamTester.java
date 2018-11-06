import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTester {

    public static void main(String[] args) {
        Book b1 = new Book("A", "a", true, 5);
        Book b2 = new Book("B", "b", false, 5);
        Book b3 = new Book("C", "a", true, 0);
        Book b4 = new Book("D", "d", false, 10);
        Book b5 = new Book("E", "a", true, 20);


        Stream<Book> bookStreamFromElements = Stream.of(b1, b2, b3, b4, b5);

        Book[] bookArr = new Book[]{b1, b2, b3, b4, b5};
        Stream<Book> bookStreamFromArray = Arrays.stream(bookArr);

        List<Book> bookList = Arrays.asList(b1, b2, b3, b4, b5);

        Map<String, Book> filteredBooks = bookList.stream()
                .filter(b -> b.getGenre().equals("a"))
                .collect(Collectors.toMap(book -> book.getGenre(), o -> o));

    }


}
