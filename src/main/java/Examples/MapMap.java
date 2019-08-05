package Examples;

import org.testng.annotations.Test;

import java.util.HashMap;

public class MapMap {
    @Test
            public void testMap() {
        HashMap<String,String> hh = new HashMap<>();
        HashMap<String,HashMap<String,String>> aa = new HashMap<>();


        hh.put("name","Shantanu");
        hh.put("wife","Shefali");
        hh.put("marti_Hai","haan");
        hh.put("company","Ola");
        hh.put("City","Bangalore");
        hh.put("Car","i20");
//        System.out.println(hashMap.size());

//        System.out.println(hashMap.get("wife"));
        System.out.println(hh.entrySet());
        System.out.println(hh.keySet());
        System.out.println(hh.values());
        System.out.println(hh.clone());
        System.out.println(hh.putIfAbsent("name1","shan"));
        System.out.println(hh.remove("name"));
        System.out.println(hh.keySet());
        aa.put("ekaurmap",hh);
        System.out.println("aa : "+aa.values());

        HashMap newMap = new HashMap();
        newMap.putAll(hh);
        System.out.println(newMap);

        hh.clear();
        System.out.println(hh.size());


    }
}
