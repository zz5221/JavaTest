package CollectionTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionTest {
    public static void main(String[] args) {
        Collection c = new ArrayList<>();
        c.add("sunwukong");
        c.add(6);
        System.out.println(c.size());
        System.out.println(c.contains(6));
        c.add("crazy android ");
        System.out.println("c        "+c);
        
        Collection book = new HashSet();
        book.add("java");
        book.add("android");
        
        c.addAll(book);
        System.out.println("是否 C 包含Book"+c.containsAll(book));
        System.out.println(c);
    }
}
