import java.util.Objects;

public class Author {
    private String nameAuthor ;
    private String lastAuthor ;

    public Author(String nameAuthor, String lastAuthor) {
        this.nameAuthor = nameAuthor;
        this.lastAuthor = lastAuthor;

    }
     public String getNameAuthor(){
        return nameAuthor;
     }

    public String getLastAuthor() {
        return lastAuthor;
    }
//МЕТОДЫ ОБЪЕКТОВ.НОВОЕ ЗАДАНИЕ.(Реализовать методы toString,
// equals и hashCode в классах Author и Book, которые были созданы на прошлом уроке.)
    public  String toString(){
return "Автор " + nameAuthor +" "+ lastAuthor;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return nameAuthor.equals(author.nameAuthor) && lastAuthor.equals(author.lastAuthor);
    }
    public int hashCode() {
        return Objects.hash(nameAuthor, lastAuthor);
    }
}
