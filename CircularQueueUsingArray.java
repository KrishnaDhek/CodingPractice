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
        }
        System.out.println("value inserted is :" +value);
        
        }
}

    

