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

    //reverse traversal in circular linked list
    public void reverseTraversalOfCircularDoublyLinkedList(){
        if(head==null){
            System.out.println("CircularDoublyLinkedList does not exists!");
        }
        else{
            DoublyNode temp = tail;
            for(int i=0;i<size;i++){
                System.out.print(temp.value);
                if(i<size-1){
                    System.out.print("<-");
                }
                temp = temp.previous;
            }
            System.out.println("\n");
        }
    }
    //searching element from circulardoublylinkedlist
    boolean searchInCircularDoublyLinkedList(int nodeValue){
       DoublyNode temp = head;

       while(temp.next!=head){
        if(temp.value==nodeValue){
            return true;
       }
       temp = temp.next;
    }
       return false;
    }

    //deleting an element from circulardoublylinkedlist
    public void deleteElementFromCircularDoublyLinkedList(int location){
        if(head==null){
            System.out.println("Nothing to delete, circular doubly linked list is emnpty");
            return;
        }
        else if(location==0){
            if(size==1){
                head.next =null;
                head.previous =null;
                head=null;
                tail=null;
                size--;
            }
            else{
                 head = head.next;
                 head.previous=tail;
                 tail.next = head;
                 size--;
            }

        }
        else if(location>=size){
            if(size==1){
                head.next=null;
                head.previous=null;
                head=null;
                tail=null;
            }
            else{
                tail = tail.previous;
                tail.next = head;
                head.previous =tail;
                size--;
            }

        }
        else{
            DoublyNode temp =head;
            int index =0;
            while(index<location-1){
                temp= temp.next;
                index++;
            }
            temp.next = temp.next.next;
            temp.next.previous = temp;
            size--;
        }
    }

}
