public class Main {
    public static void main(String[] args) {
    
    SinglyLinkedList sll = new SinglyLinkedList();
    // sll.createSinglyLinkedList(2);
    // System.out.println(sll.head.value);
    sll.insertInLinkedList(1, 0);
    sll.insertInLinkedList(3,1 );
    sll.insertInLinkedList(4,2);
    sll.insertInLinkedList(5,3);
    sll.insertInLinkedList(6, 4);
    sll.insertInLinkedList(8, 5);
    sll.insertInLinkedList(9, 6);
    sll.traversLinkedList();
    System.out.println(sll.searchNode(6));
    sll.deletionOfNode(3);
    sll.traversLinkedList();
    sll.deleteSinglyLinkedList();
    sll.traversLinkedList();
        
    }
    
}
