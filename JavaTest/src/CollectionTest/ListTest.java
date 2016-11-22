package CollectionTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListTest {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<Book>();
        
        bookList.add(new Book("Java讲义"));
        bookList.add(new Book("Android讲义"));
        bookList.add(new Book("J2EE讲义"));
        //bookList.remove(1);
        bookList.add(2, new Book("韩仕喆自传"));
        for(Book book:bookList){
            System.out.println(book.toString());
        }
        
        System.out.println(bookList.indexOf(new Book("韩仕喆自传")));
        bookList.set(2,new Book("陈丹丹"));
        System.out.println(bookList);
        System.out.println(bookList.subList(2, 3));

        
    }
}
