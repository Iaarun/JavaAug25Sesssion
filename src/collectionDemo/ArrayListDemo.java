package collectionDemo;

import java.util.*;

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
        obj.streamApiOperations();
    }

    public void arrayListMethods() {
        //use generics to provide the type safety
        //Collection support only object type, so we cannot use primitive types
        // for primitive types we can use wrapper classes
        //default capacity of array list is 10
        //loading factor is 0.75
        ArrayList<String> list = new ArrayList<>();
        //   ArrayList<int> list1 = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>(5);//initial capacity is 5
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
        System.out.println(list.remove("Sharma") + " removed");

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
        List<String> sublists = list.subList(0, 5);
        System.out.println(sublists);
    }

    public void convertListToArray() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Sachin");
        list.add("Rahul");
        list.add("Sourav");
        list.add("Dravid");
        list.add("Dravid");
        list.add("Arun");
        //1. Using toArray() method
        Object[] arr = list.toArray();
        System.out.println(arr.toString());
        List<Object> listn = Arrays.stream(arr).toList();
        System.out.println(listn);
    }

    public void navigateOnArrayList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Sachin");
        list.add("Rahul");
        list.add("Sourav");
        list.add("Dravid");
        list.add("Dravid");
        list.add("Arun");
        System.out.println(list);
        //1. Using for loop
        System.out.println("===Using for loop===");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println("===Using for while loop===");
        int i = 0;
        while (i < list.size()) {
            System.out.print(list.get(i) + " ");
            i++;
        }
        System.out.println();
        System.out.println("===Using for each loop===");
         for(String  st: list){
             System.out.print(st+" ");
         }
        System.out.println();
        System.out.println("===Using forEach() method with lambda expression===");
        list.forEach(x -> {
            System.out.print(x + " ");
        });
        System.out.println();
        System.out.println("===Using forEach() method with method reference===");
        list.forEach(System.out::print);
        System.out.println();
        System.out.println("===Using Stream API===");
        list.stream().forEach(x-> System.out.print(x+" ") );
        System.out.println();
        System.out.println("===Using Iterator===");
         Iterator<String> li= list.iterator();
         while(li.hasNext()){
             System.out.print(li.next()+" ");
         }
            System.out.println();
        System.out.println("===Using ListIterator===");
        //list iterator can be used to traverse on list only
        // list iterator can traverse in both directions
        System.out.println("Traversing in forward direction");
        ListIterator<String> liIt1= list.listIterator();
        while(liIt1.hasNext()){
            System.out.print(liIt1.next()+" ");
        }
            System.out.println();
            System.out.println("Traversing in backward direction");
         ListIterator<String> liIt= list.listIterator(list.size());
            while(liIt.hasPrevious()){
                System.out.print(liIt.previous()+" ");
            }
            System.out.println();
        System.out.println("===Using Enumeration===");
        Enumeration<String> en= Collections.enumeration(list);
        while(en.hasMoreElements()){
            System.out.print(en.nextElement()+" ");
        }
    }

    public void streamApiOperations(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Sachin");
        list.add("Rahul");
        list.add("Sourav");
        list.add("Dravid");
        list.add("Dravid");
        list.add("Arun");
        System.out.println(list);
        //filter Print Names which starts with S
        for (String x:list){
            if(x.startsWith("S")){
                System.out.print(x+" ");
            }
        }
        System.out.println();
        System.out.println("===Using Stream API===");
        list.stream().filter(x->x.startsWith("S")).forEach(x-> System.out.print(x+" ") );
        System.out.println();
        //sort the names
        System.out.println("===Sorted Names===");
        list.stream().sorted().forEach(x-> System.out.print(x+" ") );

        ArrayList<Integer> number = new ArrayList<>();
        number.add(5);
        number.add(10);
        number.add(15);
        number.add(20);
        number.add(25);
        number.add(30);
      // print the sum of even number
     int total=   number.stream().filter(x->x%2==0)
                .mapToInt(Integer::intValue).sum();
        System.out.println("Sum of even numbers : "+total);

    }
}

