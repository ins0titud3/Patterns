public class Main {
    public static void main(String[] args) {

        BookStore philosophyBook = new BookStore("Socrates apology", new PhilosophyGenre());
        philosophyBook.bookInfoMenu();

        BookStore novelBook = new BookStore("Pride and Prejudice", new NovelGenre());
        novelBook.bookInfoMenu();

        BookStore detectiveBook = new BookStore("Sherlock Holmes", new DetectiveGenre());
        detectiveBook.bookInfoMenu();

        BookStore scienceBook = new BookStore("Dune", new ScienceFiction());
        scienceBook.bookInfoMenu();

    }
}