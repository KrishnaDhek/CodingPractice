public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;
    
    public Node createSinglyLinkedList(int nodeValue){
        head = new Node();
        Node node  = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size =1;
        return head;
    }
    // insertion in linkedlist

    public void insertInLinkedList(int nodeValue, int location){
        Node node  =new Node();
        node.value =nodeValue;

       if(head==null){
        createSinglyLinkedList(nodeValue);
        return;
       }
       else if(location==0){
        node.next = head;
        head = node;

       }
        else if(location>=size){
            node.next =null;
            tail.next = node;
            tail = node;

        }
        else{
            Node temp = head;
            int index =0;

            while(index<location-1){
                temp = temp.next;
                index++;
            }
            Node nextNode = temp.next;
            temp.next = node;
            node.next = nextNode;
        }
        size++;
    }

    public void traversLinkedList(){
        if(head==null){
            System.out.println("LinkedList does not exists!");
        }
        else{
            Node temp = head;
            for(int i =0; i<size; i++){
                System.out.print(temp.value);

             if(i!= size-1){
                System.out.print("->");
            }
            temp = temp.next;
            }
        }
        System.out.println(" ");
       
    }

    boolean searchNode(int nodeValue){
        Node temp = head;
        while(temp.next!=null){
            if(temp.value == nodeValue){
                
                return true;
            }
             temp = temp.next;
        }
        return false;
    }
}
