abstract class LibraryItem{
        protected String author,title;
        public abstract void displayInfo();
}
class Book extends LibraryItem
{
    Book(String title,String author)
    {
        this.title=title;
        this.author=author;
    }
    @Override
    public void displayInfo() {
       System.out.println("Book title: "+title+"\nBook author: "+author);
    }

}
class Dvd extends LibraryItem
{
    Dvd(String title,String author)
    {
        this.title=title;
        this.author=author;
    }
    @Override
    public void displayInfo() {
        System.out.println("DVD title: "+title+"\nDVD author: "+author);
    }

}
class Magazine extends LibraryItem
{
    Magazine(String title,String author)
    {
        this.title=title;
        this.author=author;
    }
    @Override
    public void displayInfo() {
        System.out.println("Magazine title: "+title+"\nMagazine author: "+author);
    }

}
public class BookDvdMagazine {
    public static void main(String[] args) {
    Book b=new Book("Java","James gosling");
    Dvd d=new Dvd("Dvd title1", "Dvd Author1");
    Magazine m=new Magazine("Magazine title1", "Magazine author1");
    b.displayInfo();
    d.displayInfo();
    m.displayInfo();
    }
}
