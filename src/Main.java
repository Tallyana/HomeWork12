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
        Book myBook2 = new Book(author2,1998," Стихи.");
        System.out.println(author1.getNameAuthor());
        System.out.println(author1.getLastAuthor());
        System.out.println(author2.getNameAuthor());
        System.out.println(author2.getLastAuthor());
        myBook2.setYearN(2022);
        System.out.println(myBook2.getYearN());
        //НОВОЕ ЗАДАНИЕ
        System.out.println("Новое задание.");

        System.out.println(author1);
        System.out.println(myBook2);

        Author author3 = new Author("Александр", "Серебряков");
        System.out.println(author1.equals(author3));
        System.out.println(author1.hashCode() == author3.hashCode() );
    }

}