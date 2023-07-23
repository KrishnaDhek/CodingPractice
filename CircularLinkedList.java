public class CircularLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createCircularSinglyLinkedList(int nodeValue){
        Node node  = new Node();
        node.value = nodeValue;
        node.next = head;
        head = node;
        tail = node;
        size =1;
        return head;
    }

    //insertion in circular singly linked list

    public void inserInCircularList(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;

        if(head==null){
            createCircularSinglyLinkedList(nodeValue);
            return;
        }
       else if(location==0){
        node.next =head;
        head=node;
        tail.next=head;

       }

       else if(location>=size){
        tail.next = node;
        tail = node;
        tail.next = head;
       }
       else{
        Node temp = head;
        int index =0;

        while(index<location-1){
            temp = temp.next;
            index++;
        }
         node.next = temp.next;
         temp.next = node;

        
       }

       size++;
    }
    //traveral in circular linked list

    public void traveralCircularSinglyList(){
        if(head==null){
            System.out.println("Circular list does not exist");
            return;
        }
        else{
             Node temp = head;
            for(int i=0;i<size; i++){
                System.out.print(temp.value);
        
             if(i!= size-1){
             System.out.print("->");
           }
            temp = temp.next;

            }

        }
        System.out.println("\n");
       
            
        }

        //search in circular linked list

        boolean searchNode(int nodeValue){
            Node temp = head;

            while(temp.next!=head){
                if(temp.value==nodeValue){
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }
    //deletion in circular list
    public void deleteCircularList(int location){
        if(head==null){
            System.out.println("Circular does not exist");
            return;
        }
        else if(location==0){
            head = head.next;
            tail.next = head;
            size--;

            if(size==0){
                tail = null;
                head.next =null;
                head = null;
            }

        }
        else if(location>=size){
            Node temp = head;
            int index =0;

            for(int i =0; i<size-1;i++){
                temp = temp.next;
            }
            if(temp == head){
                head.next = null;
                tail = head = null;
               size--;
                return;

            }
            temp.next = head;
            tail = temp;
            size--;
        }
        else{
            Node temp = head;
            for(int i=0; i<location-1; i++){
                temp =temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
    }
    public void deleteLinkedList(){
        head = null;
        tail = null;
        System.out.println("Successfully deleted circular linked list");
    }

    
}
