/**
 * a Class by Inrit Vaka
 */
public class Book{

    private String name;
    private Author author;
    private double price;
    private int qyt;


    public Book(String name, double price, Author author) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, double price, Author author, int qyt) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qyt = qyt;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQyt() {
        return qyt;
    }

    public void setQyt(int qyt) {
        this.qyt = qyt;
    }

    public String toString() {
        return String.format("Book: [Name=%s, %s, qyt=%d]", name, author.toString(), qyt);
    }

}
