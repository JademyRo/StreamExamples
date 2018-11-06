import java.util.function.Predicate;

public class MyPredicate implements Predicate<Book> {

    @Override
    public boolean test(Book book) {
        return false;
    }
}
