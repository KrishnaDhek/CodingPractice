public class Mainstack {
    public static void main(String[] args) {
       Stack s = new Stack(4); 
       System.out.println("Is the stack empty? "+s.isEmpty());
       System.out.println("Is the stack full? "+s.isFull());
       s.pushInStack(2);
       s.pushInStack(3);
       s.pushInStack(4);
       s.pushInStack(5);
       s.pushInStack(6);
       s.pushInStack(7);
       System.out.println("Poped element is :" +s.popFromStack());
       System.out.println("Peek element is :"+s.peekOfStack());
       s.deleteStack();
    }
    
    

    
}
