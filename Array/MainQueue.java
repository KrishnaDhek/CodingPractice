

package Array;
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

        CircularQueueUsingArray cqueue = new CircularQueueUsingArray(5);
        System.out.println(cqueue.isEmpty());
        System.out.println(cqueue.isFull());
        cqueue.enQueue(1);
        cqueue.enQueue(2);
        cqueue.enQueue(3);
        cqueue.enQueue(4);
        cqueue.peek();
        System.out.println("Deleted value is :"+cqueue.deleteQueue()); 
        cqueue.peek();  
        cqueue.delete();
       
    }
    
}
