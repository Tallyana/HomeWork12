public class Main {
    public static void main(String[] args) {
        Author author = new Author("Александр", "Пушкин");
        System.out.println(author.getNameAuthor());
        System.out.println(author.getLastAuthor());

        Book myBook = new Book(author,1999,"Сказки");
        System.out.println(myBook.getYearN());
        myBook.setYearN(2001);
        System.out.println(myBook.getYearN());

        Author author1 = new Author("Константин", "Симонов");
        Book myBook1 = new Book(author1,1977,"Рассказы");
        Author author2 = new Author("Александр", "Коц");
        Book myBook2 = new Book(author2,2022,"Стихи");
        System.out.println(author1.getNameAuthor());
        System.out.println(author1.getLastAuthor());
        System.out.println(author2.getNameAuthor());
        System.out.println(author2.getLastAuthor());
        myBook2.setYearN(1922);
    }

}