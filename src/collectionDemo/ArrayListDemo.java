package collectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Fratures of ArrayList
1. Dynamic in nature
2. Can contain duplicate elements
3. Maintains insertion order
4. Not synchronized
5. Allows random access to fetch elements because it stores the values on the basis of indexes
6. Manipulation is slow because a lot of shifting needs to be occurred if any element is removed from the array list
7. Can contain null values
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayListDemo obj = new ArrayListDemo();
        obj.convertListToArray();
    }

    public void arrayListMethods() {
        //use generics to provide the type safety
        //Collection support only object type, so we cannot use primitive types
        // for primitive types we can use wrapper classes
        //default capacity of array list is 10
        //loading factor is 0.75
        ArrayList<String> list = new ArrayList<>();
     //   ArrayList<int> list1 = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>(5  );//initial capacity is 5
        System.out.println(list);
        //add elements  : add(element), add(index, element)
        list.add("Sachin");
        list.add("Rahul");
        list.add("Sourav");
        list.add("Dravid");
        list.add("Dravid");
        list.add("Arun");
        System.out.println(list);
        System.out.println(list.get(0));
        list.add("Anil");
        System.out.println(list);
        list.add(1, "Kohli");
        System.out.println(list);
        // overwrite the element : set(index, element)
        list.set(0, "Sehwag");
        System.out.println(list);
        //remove elements : remove(index) return value, remove(object) return boolean
        System.out.println(list.remove(1) + " removed");
        System.out.println(list.remove("Sharma") + " removed" );

        // contains(Object) : return boolean
        System.out.println(list.contains("Kohli"));
        // indexOf(object) : return index
        System.out.println(list);
        System.out.println(list.indexOf("Dhoni"));
        // size() : return size of the array list
        System.out.println("Size of the list is : " + list.size());
        // isEmpty() : return boolean
        System.out.println("Is list empty? : " + list.isEmpty());
        // clear() : remove all the elements from the list
       //        list.clear();
    //    System.out.println("Is list empty? : " + list.isEmpty());
     //   System.out.println(list);

        //subList(fromIndex, toIndex) : return sublist from the list and exclued the toIndex
      List<String> sublists=  list.subList(0,5);
        System.out.println(sublists);
    }

    public void convertListToArray(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Sachin");
        list.add("Rahul");
        list.add("Sourav");
        list.add("Dravid");
        list.add("Dravid");
        list.add("Arun");
        //1. Using toArray() method
        Object  [] arr=     list.toArray();
        System.out.println(arr.toString());
      List<Object>listn=   Arrays.stream(arr).toList();
        System.out.println(listn);

        }
    }

