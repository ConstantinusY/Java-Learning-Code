import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class code11 {
    public static void main(String[] args) {
        Map<String,String> map = new LinkedHashMap<>();
        map.put("CN","中国");
        map.put("JP","日本");
        map.put("US","The United States");
        map.put("UK","England");

        Set<String> keySet = map.keySet();
        for (String key : keySet){
            System.out.println(key+"-->"+map.get(key));
        }

        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        Iterator<Map.Entry<String,String>> it = entrySet.iterator();
        while (it.hasNext()){
            Map.Entry<String,String> entry = it.next();
            System.out.println(entry.getKey()+"-->"+entry.getValue());
        }

    }
}
