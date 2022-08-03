import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map  = new HashMap<>();
        map.put("India", 213);
        map.put("China",221);
        map.put("Brazil",198);

        System.out.println(map);

        map.put("Brazil", 201);
        System.out.println(map);

        if(map.containsKey("India")){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        System.out.println(map.get("India"));
        System.out.println(map.get("Oman"));

        for(Map.Entry<String,Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        map.remove("China");
        System.out.println(map);
    }
}
