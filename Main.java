public class Main {
    public static void main(String[] args) {
    
    SinglyLinkedList sll = new SinglyLinkedList();
    sll.createSinglyLinkedList(2);
    System.out.println(sll.head.value);
    sll.insertInLinkedList(1, 0);
    sll.insertInLinkedList(3,1 );
    sll.insertInLinkedList(4,2);
    sll.insertInLinkedList(5,3);
    sll.insertInLinkedList(6, 4);
    sll.insertInLinkedList(8, 5);
    sll.insertInLinkedList(9, 6);
    sll.traversLinkedList();
    System.out.println(sll.searchNode(6));
    // sll.deletionOfNode(3);
    // sll.traversLinkedList();
    // sll.deleteSinglyLinkedList();
    sll.traversLinkedList();

    // CircularLinkedList csll = new CircularLinkedList();
    // csll.createCircularSinglyLinkedList(1);
    // System.out.println(csll.head.value);
    // csll.inserInCircularList(2, 0);
    // csll.inserInCircularList(4, 2);
    // csll.inserInCircularList(5, 3);
    // csll.inserInCircularList(6, 4);
    // csll.traveralCircularSinglyList();
    // System.out.println(csll.searchNode(1));
    // csll.deleteCircularList(0);
    // csll.traveralCircularSinglyList();
    // csll.deleteLinkedList();
    // csll.traveralCircularSinglyList();

    // DoublyLinkedList dll = new DoublyLinkedList();
    // dll.insertInDoublyLinkedList(1, 0);
    // // System.out.println(dll.head.value);
    // dll.insertInDoublyLinkedList(2, 1);
    // dll.insertInDoublyLinkedList(3, 2);
    // dll.insertInDoublyLinkedList(4, 3);
    // // System.out.println(dll.head.value);
    // // System.out.println(dll.head.next.value);
    // // System.out.println(dll.head.next.next.value);
    // // System.out.println(dll.head.next.next.next.value);
    // dll.traversalInDoublyLinkedList();
    // System.out.println(dll.searchInDoublyLinkedList(2));
   
    //  dll.deleteDoublyList();
    // dll.traversalInDoublyLinkedList();
    // // dll.reverseDoublylinkedList();
    
    // CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
    // cdll.createCircularDoublyLinkedList(1);
    // // System.out.println(cdll.head.value);
    // cdll.insertInCircularDoublyLinkedList(2, 0);
    // cdll.insertInCircularDoublyLinkedList(3, 1);
    // cdll.insertInCircularDoublyLinkedList(4, 2);
    // // System.out.println(cdll.head.value);
    // // System.out.println(cdll.head.next.value);
    // // System.out.println(cdll.head.next.next.value);
    // // System.out.println(cdll.head.next.next.next.value);
    // cdll.traveralCircularDoublyLinkedList();
    // // cdll.reverseTraversalOfCircularDoublyLinkedList();
    
    // System.out.println(cdll.searchInCircularDoublyLinkedList(30));
    // // cdll.deleteElementFromCircularDoublyLinkedList(3);
    // cdll.traveralCircularDoublyLinkedList();
    //  cdll.deleteElementFromCircularDoublyLinkedList(1);
    // // cdll.traveralCircularDoublyLinkedList();
    // cdll.deleteCircularDoublyList();
    // cdll.traveralCircularDoublyLinkedList();



    
    

        
    }
    
}
