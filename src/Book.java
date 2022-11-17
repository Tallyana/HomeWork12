public class Book {
    Author Author;
    int yearN;
    String publisherName;

   public Book(Object o, int i, Object o1) {
    }

      Class Book {
         private Author Author;
         private int yearN;
         private String publisherName;


     public Book (Author Author,int yearN,String publisherName){//ниже 3 строчки убрать,
         this.Author=Author;
         this.yearN=yearN;
         this.publisherName=publisherName;
    }
    public Author getAuthor() {
        return Author;
    }
    public int getyearN() {
        return yearN;
    }
    public int getpublisherName(){
        return publisherName;
     }

     public void setPublisherName(String publisherName) {
            this.publisherName = publisherName;
        }

        public int getyearN() {
            return yearN;
        }

        public void setyearN(int yearN) {
            if (yearN < 1999 || yearN > 2050) {
                System.out.println("Invalid publishing year parameter: " + yearN);
                return;
            }
            this.yearN = yearN;
        }
    }





