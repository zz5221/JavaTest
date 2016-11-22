package ThreadTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Aggregate {
    public void test(){
        Collection collection  = new ArrayList();
        collection.add("孙悟空");
        collection.add(6);
        System.out.println("collection元素的集合个数为"+collection.size());
        collection.remove(6);
        System.out.println("collection元素的集合个数为"+collection.size());
        System.out.println("collection的集合里面是否包含孙悟空的元素"+collection.contains("孙悟空"));
        collection.add("hanshizhe");
        collection.add(990);
        collection.add("疯狂JAVA讲义");
    //    collection.add("疯狂ANDROID讲义");
        System.out.println("collection所有集合数为"+collection);
        Collection books = new HashSet();
        books.add("疯狂JAVA讲义");
        books.add("疯狂ANDROID讲义");
        System.out.println("books所有集合数为"+books);
        System.out.println("collection集合是否包含所有books集合"+collection.containsAll(books));
        System.out.println("collection所有集合数为"+collection);
    //    collection.removeAll(books);
        System.out.println("collection 去掉BOOKS的集合为"+collection);
   //     collection.clear();
        System.out.println("删除collection所有集合数为"+collection);
     //   books.retainAll(collection);
        System.out.println("books所有集合数为"+books);
        
    }
}
