package CollectionTest;

import java.util.HashSet;
import java.util.Iterator;

class R{
    int count;

    public R(int count) {
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
        if(obj!=null && obj.getClass() == R.class){
            R r = (R)obj;
            return this.count == r.count;
        }
        return false;
    }
    
}
public class HashSet2 {
    public static void main(String[] args) {
        HashSet hs  = new HashSet();
        hs.add(new R(5));
        hs.add(new R(-3));
        hs.add(new R(9));
        hs.add(new R(-2));
        System.out.println(hs);
        
        Iterator it = hs.iterator();
        R first = (R)it.next();
        first.count = -3;
        System.out.println(hs);
        
        hs.remove(new R(-3));
        System.out.println(hs);
        
        System.out.println("hs 是否包含count值为-3 的对象"+hs.contains(new R(-3)));
        
        System.out.println("hs 是否包含count值为-2 的对象"+hs.contains(new R(-2)));
        
        
    }
}
