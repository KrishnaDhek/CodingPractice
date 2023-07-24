public class LinkedList {
    public LinkedNode head;
    public LinkedNode tail;
    public int size;
    
public LinkedNode createLinkedList(int nodeValue){
    head  = new LinkedNode();
    LinkedNode node = new LinkedNode();
    node.next =null;
    node.value=nodeValue;
    head= node;
    tail =node;
    size=1;
    return head;
}
//insertion 
public void insertInLinkedList(int nodeValue, int location){
    LinkedNode node = new LinkedNode();
    node.value = nodeValue;
    
    if(head==null){
        createLinkedList(nodeValue);
        return;
    }
    else if(location==0){
        node.next = head;
        head =node;
    }
    else if(location>=size){
        node.next =null;
        tail.next=node;
        tail= node;
    }
    else{
        LinkedNode temp =head;
        int index =0;
        while(index<location-1){
            temp= temp.next;
            index++;
        }
        LinkedNode nextNode = temp.next;
        temp.next =node;
        node.next = nextNode;

        
    }
    size++;
}

//traversal
public void traversLinkedList(){
    
    if(head==null){
        System.out.println("LinkedList does not contain any element");
    }
    
    else{ 
        LinkedNode temp =head;
       while(temp!=null){
        System.out.print(temp.value+"->");
        temp =temp.next;
        
       }
       
    }
    System.out.println(" ");
     
   
}
public void RemoveDuplicatesFromLinkedList( ){
    LinkedNode temp =head;
     while(temp.next!=null){
        if(temp.value == temp.next.value){
            temp.next = temp.next.next;
        }
        temp = temp.next;
     }
     
     
}

public static void main(String[] args) {
    LinkedList ll = new LinkedList();
   ll.insertInLinkedList(1, 0);
    ll.insertInLinkedList(1,1);
    ll.insertInLinkedList(2,2);
    ll.insertInLinkedList(2,3);
    ll.insertInLinkedList(3,4);
    ll.insertInLinkedList(4,5);
    ll.traversLinkedList(); 
    ll.RemoveDuplicatesFromLinkedList();
    ll.traversLinkedList();
}
    
}
