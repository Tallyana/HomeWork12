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
    public void setYearN(int yearN ) {
    this.yearN = yearN;
    }
}



