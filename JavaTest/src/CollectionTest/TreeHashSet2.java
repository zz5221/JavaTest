package CollectionTest;

import java.util.TreeSet;

class z implements Comparable{
    public int age;
    public z(int age) {
        super();
        this.age = age;
    }
    
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return true;
    }
    
    @Override
    public int compareTo(Object arg0) {
        // TODO Auto-generated method stub
        return 1;
    }
    
}
public class TreeHashSet2 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        z z = new z(9);
        ts.add(z);
        System.out.println(ts.add(z));
        //打印ts集合，将看到两个元素
        System.out.println(ts);
        ((z)(ts.first())).age = 9;
        System.out.println(((z)(ts.last())).age);

    }
}
