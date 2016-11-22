package CollectionTest;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {
    
    /**严格按照顺序执行添加和修改
     * @param args
     */
    public static void main(String[] args) {
        LinkedHashSet books = new LinkedHashSet();
        
        books.add("JAVA");
        books.add("Android");
        System.out.println(books);
        books.remove("JAVA");
        books.add("JAVA");
        System.out.println(books);
    }
}
