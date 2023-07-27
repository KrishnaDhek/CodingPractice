package LinkedList;
import java.util.HashSet;

public class RemoveDupsFromUnsortedList {
    void deleteDups(List l){
    HashSet<Integer> hset = new HashSet<Integer>();
    ListNode temp = l.head;
    ListNode temp1 = null;

    while(temp!=null){
        int val = temp.value;
        if(hset.contains(val)){
            temp1.next = temp.next;
            l.size--;
        }
        else{
            hset.add(val);
            temp1 = temp;
        }
        temp = temp.next;
    }

    }

    
}
