public class QueueUsingArray {
    public int[] arr;
    public int front;
    public int rare;

    //create queue

    public QueueUsingArray(int size){
        this.arr = new int[size];
        this.front =-1;
        this.rare =-1;
        System.out.println("Queue is create with size "+size+"and the value of front = "+front+" and rare  = "+rare);
    }
    //isFull
    public boolean isFull(){
        if(rare==arr.length-1){
            System.out.println("Queue is full!");
            return true;
        }
        else
        return false;
    }
    //isEmpty
    public boolean isEmpty(){
        if((front==-1) || (front==arr.length)){
            System.out.println("Queue is empty!");
            return true;
        }
        else
        return false;
    }
    //enQueue method
    public void enQueue(int value){
        if(isFull()){
            System.out.println("Queue is full, can not insert any element");
        }
        else if(isEmpty()){
            front=0;
            rare++;
            arr[rare]=value;
            System.out.println("Value is "+value);
        }
        else{
            rare++;
            arr[rare]= value;
            System.out.println("Value inserted is "+value);
        }

    }    
}
