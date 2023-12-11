package bg.smg;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Price price = new Price(35.5, PriceCurrency.BGN);
        Author author = new Author("Ime1");
        Book book = new Book("Title1", author, price);

        System.out.println(book.getAuthor().getName());
        System.out.println(book.getTitle());

        Book book2 = (Book) book.clone();
        book2.getAuthor().setName("new Name");
        book2.setTitle("title2");

        System.out.println(book.getAuthor().getName());
        System.out.println(book.getTitle());
    }
}
