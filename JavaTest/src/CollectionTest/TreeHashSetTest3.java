package CollectionTest;

import java.util.TreeSet;

class R1 implements Comparable{
    int count;

    public R1(int count) {
        super();
        this.count = count;
    }
    @Override
    public String toString() {
        
        return "R[count:"+count+"]";
    }
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if(this.equals(obj)){
            return true;
        }
        if(obj!=null && obj.getClass() == R1.class){
            R1 r = (R1)obj;
            return this.count == r.count;
        }
        return false;
    }
    @Override
    public int compareTo(Object obj) {
        R1 r = (R1)obj;

        if(count >r.count){
            return 1;
        }else if(count < r.count){
            return -1;
        }else {
            return 0;
        }
       
        
/*        return count > r.count ? 1:count<r.count? -1:0;*/
    }
    
}
public class TreeHashSetTest3 {
    public static void main(String[] args) {
        TreeSet tSet = new TreeSet();
        tSet.add(new R1(5));
        tSet.add(new R1(-3));
        tSet.add(new R1(9));
        tSet.add(new R1(-2));
        System.out.println(tSet);
        R1 first = (R1)tSet.first();
        first.count=20;
        R1 last = (R1)tSet.last();
        last.count = -2;
        System.out.println(tSet);
        System.out.println(tSet.remove(new R1(-2)));
        System.out.println(tSet);
        System.out.println(tSet.remove(new R1(5)));
        System.out.println(tSet);
        
/*        //三目运算符
        String str = 5 > 3 ? "5大于3":"5小于3";
        System.out.println(str);
        
        int a = 1>0 ? 1:0<1? -1:0;
        
        System.out.println(a);*/
    }
}
