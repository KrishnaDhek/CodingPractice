public class MainQueue {
    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray(5);
        System.out.println(queue.isFull());
        System.out.println(queue.isEmpty());
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.enQueue(4);
    }
    
}
