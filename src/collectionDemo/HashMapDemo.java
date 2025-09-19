package collectionDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
  HashMap class implements the Map interface
  HashMap contains only unique keys
    HashMap is not synchronized
    HashMap allows null values and null key
    HashMap does not maintain the insertion order
    HashMap is the best choice when we want to search, delete and insert operations
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMapDemo obj = new HashMapDemo();
        obj.traverseHashMap();
    }

    public void hashMapBasics(){
        HashMap <String, Integer> map = new HashMap<>();
        //use put function to store data
     //   map.put("India", 1);
        map.put("USA", 2);
        map.put("UK", 3);
    //    map.put("India", 4);
        map.put("Russia", 5);
        System.out.println(map);
        //putIfAbsent : put the value only if the key is not present
        map.putIfAbsent("India",6);
        System.out.println(map);
        //size()
        System.out.println("Size of the map is : "+map.size());
        //get()
        System.out.println(map.get("India"));
        //containsKey()
        System.out.println(map.containsKey("UK"));
        //containsValue()
        System.out.println(map.containsValue(10));
        //remove(key) : return value
        System.out.println(map.remove("Russia")+" removed");
        System.out.println(map);
        //remove(key, value) : return boolean
        System.out.println(map.remove("USA", 2)+" removed");
        System.out.println(map);

        HashMap <String, Integer> map1 = new HashMap<>();
        map1.put("China", 8);
        map1.put("Nepal", 9);
        map1.put("Bhutan", 10);
        map.putAll(map1);
        System.out.println(map);
        System.out.println(map.get("China1"));
        System.out.println(map.getOrDefault("China1", 100));
    }

    public void traverseHashMap(){
        HashMap <String, Integer> map = new HashMap<>();
        map.put("India", 1);
        map.put("USA", 2);
        map.put("UK", 3);
        map.put("India", 4);
        map.put("Russia", 5);
        //using for each loop
        System.out.println("====using for each loop====");
        for(Map.Entry<String, Integer> entry:   map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        System.out.println("===using foreach method with lambda====");
        map.forEach((x, y)->{
            System.out.println(x+" : "+y);
        });

        System.out.println("===using Stream API====");
        map.entrySet().stream().forEach(x->{
            System.out.println(x.getKey()+" : "+x.getValue());
        });

        System.out.println("===using Iterator====");
          Iterator<Map.Entry<String, Integer>> entry=   map.entrySet().iterator();
          while(entry.hasNext()){
               Map.Entry<String, Integer> e = entry.next();
              System.out.println(e.getKey()+" : "+e.getValue());
          }

    }

}
