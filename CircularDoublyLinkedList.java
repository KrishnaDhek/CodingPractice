public class CircularDoublyLinkedList {
    public DoublyNode head;
    public DoublyNode tail;
    public int size;

    public DoublyNode createCircularDoublyLinkedList(int nodeValue){
        head = new DoublyNode();
        DoublyNode node  = new DoublyNode();
        node.next = node;
        node.value =nodeValue;
        node.previous=node  ;
        head = node;
        tail =node;
        size =1;
        return head;
    }

    //inserting elemnts in circular doubly linked list

    public void insertInCircularDoublyLinkedList(int nodeValue, int location){
        DoublyNode node  =new DoublyNode();
        node.value = nodeValue;

        if(head==null){
            createCircularDoublyLinkedList(nodeValue);
            return;
        }
        else if(location==0){
            node.next = head;
            node.previous=tail;
            head.previous = node;
            tail.next = node;
            head = node;
             
        }
        else if(location>=size){
            node.next = head;
            node.previous =tail;
            head.previous = node;
            tail.next = node;
        }
        else{
            DoublyNode temp = head;
            int index =0;

            while(index<location-1){
                temp = temp.next;
                index++;
            }
            node.next =temp.next;
            node.previous = temp;
            temp.next= node;
            node.next.previous = node;
        }
        size++;
        
    }
    //traversal in circular linked list
    public void traveralCircularDoublyLinkedList(){
        if(head==null){
            System.out.println("Circular doubly linked lsit is empty!");
        }
        else{
            DoublyNode temp = head;
            for(int i =0; i<size;i++){
                System.out.print(temp.value);
                if(i<size-1){
                    System.out.print("->");
                }
                temp = temp.next;
            }
            System.out.println("\n");
        }
    }
}
