package Day2_Day3;


public class Utility {
    public static int generateId() {
        return (int) (Math.random() * 10000);
    }
}

package library.books;
import static library.utils.Utility.generateId;

public class Book {
    private int bookId = generateId();
}
