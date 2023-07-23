public class DoublyLinkedList {
    public DoublyNode head;
    public DoublyNode tail;
    public int size;

    public DoublyNode createDoublyLinkedList(int nodeValue){
       head = new DoublyNode();
       DoublyNode node = new DoublyNode();
       node.next = null;
       node.value = nodeValue;
       node.previous = null;
       head = node;
       tail = node;
       size =1;
       return head;
    }
    //insertion in doubly linked list

    public void insertInDoublyLinkedList(int nodeValue, int location){
        DoublyNode node = new DoublyNode();
        node.value = nodeValue;
        if(head==null){
            createDoublyLinkedList(nodeValue);
            return;
        }
        else if(location==0){
            node.next = head;
            node.previous = null;
            head.previous =node;
            head = node;
        }
        else if(location>=size){
            node.next = null;
            tail.next = node;
            node.previous = tail;
            tail =node; 
        }
        else{
            DoublyNode temp = head;
            int index =0;

            while(index<location-1){
                temp = temp.next;
                index++;
            }
            node.previous =temp;
            node.next = temp.next;
            temp.next = node;
            node.next.previous = node;   
        }
        size++;
    }

    //traversal in doubly linked list

    public void traversalInDoublyLinkedList(){
        if(head==null){
            System.out.println("Doubly LinkedList is empty");
        }
        else{
            DoublyNode temp = head;
            for(int i =0; i<size; i++){
                System.out.print(temp.value);
                if(i<size-1){
                    System.out.print("->");
                }
                temp = temp.next;

            }
            System.out.println("\n");

        }
    }
    //searching for an element in doubly linked list
    boolean searchInDoublyLinkedList(int nodeValue){
        DoublyNode temp = head;
        while(temp!=null){
            if(temp.value==nodeValue){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    //deleting elemnts from doubly linkedlist
    public void deleteFromDoublyLinkedList(int location){
        if(head==null){
            System.out.println("Doubly LinkedList does not contain any value");
        }
        else if(location==0){
            if(size==1){
                head =null;
                tail=null;
                size--;
                return;
            }
            else{ 
            head = head.next;
            head.previous = null;
            size--;
            }
        }
        else if(location>=size){
            DoublyNode temp =tail.previous;
            if(size==1){
                head =null;
                tail=null;
                size--;
                return;
            }
            else{
                temp.next= null;
                tail =temp;
                size--;

            }
     }
         else{
            DoublyNode  temp = head;
            int index =0;
            while(index<location-1){
                temp = temp.next;
                index++;
            }
            temp.next = temp.next.next;
            temp.next.previous = temp;
            size--;
         }

     }
      //deleting entire DoublyLinkedList
      public void deleteDoublyList(){
        head =null;
        tail =null;
        size--;
        System.out.println("Successfully deleted doubly linkedlist");
      }
 }
    

