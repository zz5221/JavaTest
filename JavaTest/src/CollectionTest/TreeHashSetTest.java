package CollectionTest;

import java.util.TreeSet;

public class TreeHashSetTest {
    
    public static void main(String[] args) {
        TreeSet nums = new TreeSet();
        nums.add(-1);
        nums.add(-2);
        nums.add(5);
        nums.add(2);
        nums.add(8);
        nums.add(8);
        //输出集合元素看是否是排序状态
        System.out.println(nums);
        //输出第一个数据
        System.out.println(nums.first());
        //输出第二个数据
        System.out.println(nums.last());
        //返回小于5的函数
        System.out.println(nums.headSet(5));
        //返回大于5的数据,如果包含5则输出5
        System.out.println(nums.tailSet(5));
        //返回大小大于2，小于8的数据
        System.err.println(nums.subSet(2,8));
        
    }
}
