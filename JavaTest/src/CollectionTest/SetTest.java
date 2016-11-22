package CollectionTest;

import java.util.HashSet;

class a{
    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
class b{
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return 1;
    }
}
class c{
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return true;
    }
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return 2;
    }
}
/**
 * @author hanshizhe
 * HashSet判断两个对象相等的条件是equals()方法相等和HashCode()的方法返回值相同
 */
public class SetTest {
    public static void main(String[] args) {
        HashSet books = new HashSet();
        books.add(new a());
        books.add(new a());
        books.add(new b());
        books.add(new b());
        books.add(new c());
        books.add(new c());
        System.out.println(books);
    }
    
}
