public class Stack {
    int[] arrStack;
    int topOfStack;
    //creating an empty stack
    public Stack(int size){
        this.arrStack = new int[size];
        this.topOfStack = -1;
        System.out.println("Stack is created with size: "+size);
    }

    //check if the stack is empty
    public boolean isEmpty(){
        if(topOfStack ==-1){
            return true;
        }
        else
        return false;
    }

    public boolean isFull(){
        if(topOfStack==arrStack.length-1){
            return true;
        }
        else
        return false;

    }
    //pushing element into the the stacck
    public void pushInStack(int value){
        if(isFull()){
            System.out.println("Stack is full!");
        }
        else{
            topOfStack++;
            arrStack[topOfStack]=value;
            System.out.println("value is successfully inserted "+value);
        }
    }

    public int popFromStack(){
        if(isEmpty()){
            System.out.println("Stack is empty!");
        }
        else{
            int topValue = arrStack[topOfStack];
            topOfStack--;
            return topValue;
        }
        return -1;
    }
    public int peekOfStack(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            int value =arrStack[topOfStack];
            return value;
        }
        return -1;
    }

    //delete stack

    public void deleteStack(){
        arrStack = null;
        System.out.println("Successfully deleted stack!");
    }
}
