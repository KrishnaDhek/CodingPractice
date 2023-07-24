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
    //traversing the linked list
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
    //searching a value in linked list

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
//delete node from linked list
    public void deletionOfNode(int location){
        if(head==null){
            System.out.println("Linked list does not exist");
        }
        //deleting first node
    
        else if(location==0){
            head = head.next;//more than one element
            size--;
            //if list has only one node
            if(size==0){ 
                tail =null;
            }
        }
        //delete from end
        else if(location>=size){
            Node temp = head;
            for(int i =0; i<size-1; i++){
                temp = temp.next;
                if(temp==head){//if more than one element
                    tail =null;
                    head =null;
                    size--;
                    return;
                }
                temp.next =null;//only one element
                tail = temp;
                size--;
            }
        }
        else{// delete from a specific location
            Node temp = head;
            for(int i =0; i<location-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
    }
    //delete entire Single Linked List

    public void deleteSinglyLinkedList(){
        head=null;
        tail= null;
        System.out.println("Deleted Single Linked list Successfully");
    }
}
