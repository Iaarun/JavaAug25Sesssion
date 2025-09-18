package collectionDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/*
   HashSet class implements the set interface
   HashSet does not allow duplicate elements
    HashSet is not synchronized
    HashSet allows null values
    HashSet does not maintain the insertion order
    Hashset does not support the index based access
    HashSet is the best choice when we want to search, delete and insert operations
    Internally HashSet uses HashMap to store the elements
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSetDemo obj = new HashSetDemo();
        obj.linkedHashSetDemo();
        obj.treeSetDemo();
    }
    public void hashsetBasics(){
        HashSet<String> set = new HashSet<>();
        set.add("India");
        set.add("USA");
        set.add("UK");
        set.add("India");
        set.add(null);
        System.out.println(set);
        set.add("Russia");
        System.out.println(set);
        //size()
        System.out.println("Size of the set is : "+set.size());
        //clear()
      //  set.clear();
   //     System.out.println("Size of the set after clear operation : "+set.size());
        System.out.println(set.isEmpty());

        //remove(object) : return boolean
        System.out.println(set.remove("CHINA")+" removed");
        //contains(object) : return boolean
        System.out.println(set.contains("USA"));
    }

     public void traverseHashSet(){
        HashSet<String> set = new HashSet<>();
        set.add("India");
        set.add("USA");
        set.add("UK");
         set.add("Russia");
        set.add("India");
        set.add(null);


        //using for each loop
         System.out.println("====using for each loop====");
         for(String s: set){
             System.out.print(s+" ");
         }
         System.out.println();
         System.out.println("===using foreach method with lambda====");
         set.forEach(x ->{
             System.out.print(x+" ");
         });
            System.out.println();
            System.out.println("===using method reference====");
            set.forEach(System.out::print);
         System.out.println();
        System.out.println("===using Stream API====");
        set.stream().forEach(x->{
            System.out.print(x+" ");
        });
         System.out.println();
            System.out.println("===using iterator====");
        Iterator<String> it= set.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        //using enumeration
     }
     // linkedhashset maintain insertion order
        //treeset maintain ascending order
    public  void linkedHashSetDemo(){
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("India");
        set.add("USA");
        set.add("UK");
        set.add("Russia");
        set.add("India");

        System.out.println(set);
    }
    public void treeSetDemo(){
        //TreeSet does not allow null values
        //TreeSet maintain ascending order
        //TreeSet is not synchronized
        //TreeSet does not allow duplicate values
        //TreeSet is the best choice when we want to search, delete and insert operations
        TreeSet <String> set = new TreeSet<>();
        set.add("India");
        set.add("USA");
        set.add("UK");
        set.add("Russia");
        System.out.println(set);


    }

}
