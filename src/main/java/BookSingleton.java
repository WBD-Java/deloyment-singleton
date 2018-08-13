public class BookSingleton {
    private static BookSingleton book;
    private static boolean isLoanedOut;
    private String author;
    private String title;

    public BookSingleton() {
        author = "Gamma, Helm, Johnson, and Vlissides";
        title = "Design Patterns";
        book = null;
        isLoanedOut = false;
    }
}
