package ThreadTest;


import java.util.ArrayList;
import java.util.List;


public class Generics {
    public static void main(String[] args) {
        test2();
    }
    
    public void test1(){
        List str = new ArrayList();
        str.add("hanshizhe");
        str.add(5);
      //  str.
    }
    
    public static void test2(){
        Integer [] integers = new Integer[4];
        Number [] na = integers;
        na[0] = 0.5;
    }
}
