import java.util.Objects;

public class Book {
    private Author author;
    private int yearN;
    private String name;

    public Book(Author author, int yearN, String name) {
        this.author = author;
        this.yearN = yearN;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getYearN() {
        return yearN;
    }

    public Author getAuthor() {
        return author;
    }

    public void setYearN(int yearN) {
        this.yearN = yearN;
    }
    //НОВОЕ ЗАДАНИЕ
    public String toString() {
        return author.toString() + " - " + name + ", " + yearN + " г. ";
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearN == book.yearN && author.equals(book.author) && name.equals(book.name);
    }
    public int hashCode() {
        return Objects.hash(author, yearN, name);
    }
}



