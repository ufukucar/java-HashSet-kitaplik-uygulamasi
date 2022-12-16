import java.util.Objects;

public class Book implements Comparable<Book> {

    private double id;
    private String name, author, publisher;
    private int quantity;

    public Book(double id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    public Book(Book source) {
        this.id = source.id;
        this.name = source.name;
        this.author = source.author;
        this.publisher = source.publisher;
        this.quantity = source.quantity;
    }

    public double getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Book o) {

        if (id > o.id) {
            return 1;
        } else if (id < o.id) {
            return -1;
        } else {
            return 0;
        }

    }

    @Override
    public String toString() {
        String val = this.id + "-" + this.name + "-" + this.author + "-" + this.publisher + "-" + this.quantity;
        return val;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Book)) {
            return false;
        }
        Book book = (Book) o;
        return id == book.id &&
                this.name.equals(book.name) &&
                this.author.equals(book.author) &&
                this.publisher.equals(book.publisher) &&
                this.quantity == book.quantity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getId(), this.getName(), this.getAuthor(), this.getPublisher(), this.getPublisher());
    }
}
