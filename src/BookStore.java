public class BookStore {
    String bookTitle;
    IBookGenreStrategy genreStrategy;
    public BookStore(String bookTitle, IBookGenreStrategy genreStrategy) {
        this.bookTitle = bookTitle;
        this.genreStrategy = genreStrategy;
    }

    public void bookInfoMenu() {
        System.out.println("Book Title: " + bookTitle);
        System.out.print("Genre Information: ");
        genreStrategy.genreInfo();
    }
}
