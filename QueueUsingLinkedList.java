public class QueueUsingLinkedList {
    SinglyLinkedList linkedList;

    public QueueUsingLinkedList(){
        linkedList = new SinglyLinkedList();
        System.out.println("Queue is successfully created!");
    }
    //isEmpty
    public boolean isEmpty(){
        if(linkedList.head==null){
            return true;

        }
        return false;
    }
    
}
