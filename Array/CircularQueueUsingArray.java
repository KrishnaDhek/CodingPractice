package Array;
public class CircularQueueUsingArray {
    public int[] arr;
    public int front;
    public int rare;
    public int size;

    public CircularQueueUsingArray(int size){
        this.arr = new int[size];
        this.size = size;
        this.front = -1;
        this.rare =-1;
        System.out.println("Circular Queue is successfully created with "+size
        );
    } 

    //isFull

    public boolean isFull(){
        if(rare+1==front) {
            return true;
        }
        else if(front==0 && rare+1==size){
            return true;
        }
        return false;
    }

    //isEmpty
    public boolean isEmpty(){
        if(front==-1){
            return true;
        }
        return false;
    }
    //enQueue
    public void enQueue(int value){
        if(isFull()){
            return;
        }
        else if(isEmpty()){
            front=0;
            rare++;
            arr[rare] =value;
            System.out.println("value inserted is :" +value);
        }
        else{
            if(rare+1==size){
                rare=0;
            }
            else{
                rare++;
            }
            arr[rare]=value;
            System.out.println("value inserted is :" +value);
        }
        
        
        }
        //deQueue

        public int deleteQueue(){
            if(isEmpty()){
                System.out.println("Circular queue is empty!");
                return -1;
            }
            else{
                int result = arr[front];
                arr[front] =Integer.MIN_VALUE;
                
                if(front==rare){//if only one element predent  
                    front=-1;
                    rare=-1;
                }
                else if(front+1==size){
                    front=0;
                }
                else{
                    front++;
                }
                return result;
            }

        }
        //peek method
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            else{
                int val = arr[front];
                System.out.println("value at front is "+val);
                return val;
            }
        }
        //delete method
        public void delete(){
            arr = null;
            System.out.println("Circular Queue is successsfully deleted!");
        }
}

    

