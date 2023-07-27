package Array;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
       for(int i=0; i<10;i++){
        list.add(i);
       }
       //various methods 

       System.out.println(list.isEmpty());

    //Returns the number of elements in this list.
        System.out.println(list.size());

    //Returns true if this list contains the specified element.
       System.out.println(list.contains(5));
        
    //Returns the element at the specified position in this list.
       System.out.println(list.get(3));

    //The index the first occurrence of a specific element is either returned 
    //or -1 in case the element is not in the list.
      System.out.println(list.indexOf(8));
    
    // returns true if the specified object is equal to this list
      System.out.println(list.equals(5));
    
    // Removes the element at the specified position in this list. 
    // Shifts any subsequent elements to the left (subtracts one from their indices).
      System.out.println(list.remove(4));
    
    // Replaces the element at the specified position in this list with the specified element.
      System.out.println(list.set(3,12));
       
        System.out.println(list);

        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
          System.out.println(" Elements are: "+itr.next());
        }

        
    }
    
}
