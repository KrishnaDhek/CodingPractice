public class MainQueue {
    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray(5);
        queue.isFull();
        queue.isEmpty();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        // queue.enQueue(4);
        System.out.println("Value at the front is :"+queue.peek());
        System.out.println("Deleted value is :"+queue.deQueue());
         System.out.println("Deleted value is :"+queue.deQueue());
         queue.deleteQueue();


       
    }
    
}
