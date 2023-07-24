public class StackUsingLinkedList {
    SinglyLinkedList linkedList;

    public StackUsingLinkedList(){
       linkedList = new SinglyLinkedList();
    }
    //push 
    public void Push(int value){
        linkedList.insertInLinkedList(value, 0);
        System.out.println("Inserted "+ value+" in Stack");

    }
    //isEmpty

    public boolean isEmpty(){
        if(linkedList.head==null){
            System.out.println("Stack is empty! ");
            return true;
        }
        else
        return false;
    }
    //pop
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack has no element to pop");
            return -1;

        }
        else{
        System.out.println("Poped element is :"+linkedList.head.value);
        linkedList.deletionOfNode(0);
        
        return 0;
        }
        
    }
    //peek
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack has no element");
            return -1;
        }
        else{
            System.out.println("Peek element is: "+linkedList.head.value);
            return 0;
        }
    }
    //delete stack

    public void delete(){
        linkedList.head = null;
        System.out.println("Successfully deleted the stack");
    }
}
