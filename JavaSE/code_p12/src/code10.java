import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class code10 {
    public static void main(String[] args) {
        Map<String,String>map = new LinkedHashMap<>();
        map.put("CN","中国");
        map.put("JP","日本");
        map.put("US","The United States");
        map.put("US","America");//会覆盖掉上面的 The United States
        map.put("UK","England");
        map.put("EN","England");//不会覆盖掉上面的England

        Map<String,String>map2 = new HashMap<>();
        map2.putAll(map);

        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.containsKey("CN"));
        System.out.println(map.containsKey("中国"));
        System.out.println(map.get("US"));
        System.out.println(map.isEmpty());
        System.out.println(map.size()+"\n------------------------------");

        System.out.println(map2);
        map2.remove("US");
        System.out.println(map2);
        map2.clear();
        System.out.println(map2.isEmpty());
    }
}
