package demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chitboon on 11/26/15.
 */
public class BookDAO {

    public List<Book> getAllBooks() {
        ArrayList<Book> list = new ArrayList<Book>();
        Book b1 = new Book(1, "Web Component", "Java Duke", 5.5f, 10, "What a great book!");
        Book b2 = new Book(2, "Web Development Technique", "Web Guru", 10.1f, 11, "Interesting read, must buy!");
        Book b3 = new Book(3, "Web Design", "Jonny Ives", 1.1f, 1, "Awesome insights!");
        Book b4 = new Book(4, "Web Server Administration", "Linus", 19.3f, 1, "Wow! I amd speechless!");
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        return list;
    }

    public List<Book> searchBooks(String term) {
        ArrayList<Book> list = new ArrayList<Book>();
        Book b1 = new Book(1, "Web Component", "Java Duke", 5.5f, 10, "What a great book!");
        Book b2 = new Book(2, "Web Development Technique", "Web Guru", 10.1f, 11, "Interesting read, must buy!");
        Book b3 = new Book(3, "Web Design", "Jonny Ives", 1.1f, 1, "Awesome insights!");
        Book b4 = new Book(4, "Web Server Administration", "Linus", 19.3f, 1, "Wow! I amd speechless!");
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        return list;
    }

}