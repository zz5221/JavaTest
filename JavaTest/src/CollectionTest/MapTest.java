package CollectionTest;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map map =new HashMap();
        map.put("java","crazy java");
        map.put("android","crazy android");
        System.out.println(map.put("java","io"));
        System.out.println(map);
       // map.remove("java");
        System.out.println("map是否包含JAVA的key"+map.containsKey("java"));
        for (Object key:map.keySet()) {
            System.out.println(map.get(key));
        }
        
        
    }
}
