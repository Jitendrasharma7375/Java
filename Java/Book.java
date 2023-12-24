
public class Book {
    private String title,author;
    public static int bookCount=0;
    Book(String title,String author)
    {
        this.title=title;
        this.author=author;
        bookCount=bookCount+1;
    }
    public static int getBookCount()
    {
        return bookCount;
    }
    public void show()
    {
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
    }
    public static void main(String[] args) {
        Book b1=new Book("Java", "James gosling");
        Book b2=new Book("C", "Denis Ritchie");
        b1.show();
        b2.show();
        System.out.println("Total books:"+Book.getBookCount());
    }
}
