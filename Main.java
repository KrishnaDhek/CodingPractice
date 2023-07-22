public class Main {
    public static void main(String[] args) {
    
    SinglyLinkedList sll = new SinglyLinkedList();
    // sll.createSinglyLinkedList(2);
    // System.out.println(sll.head.value);
    sll.insertInLinkedList(1, 0);
    sll.insertInLinkedList(3,2 );
    sll.insertInLinkedList(4,3);
    sll.insertInLinkedList(5,4);
    sll.insertInLinkedList(6, 5);
    sll.insertInLinkedList(8, 2);
    sll.insertInLinkedList(9, 1);
    sll.traversLinkedList();
        
    }
    
}
