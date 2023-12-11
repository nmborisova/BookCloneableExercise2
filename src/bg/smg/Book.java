package bg.smg;

public class Book implements Cloneable{
    private String title;
    private Author author;
    private Price price;

    public Book(String title, Author author, Price price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book() {
        this.title = "";
        this.author = new Author();
        this.price = new Price();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Book b = (Book) super.clone();
        b.setAuthor((Author) this.author.clone());
        b.setPrice((Price) this.price.clone());
        return b;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", price=" + price +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

}
