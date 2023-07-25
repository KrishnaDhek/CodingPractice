public class List {
    public ListNode head;
    public ListNode tail;
    public int size;

    public ListNode createList(int nodeValue){
        head = new ListNode();
        ListNode node = new ListNode();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail =node;
        size=1;
        return head;
    }
    //insert method

    public void insertInList(int nodeValue, int location){
       ListNode node = new ListNode();
        node.value = nodeValue;

        if(head==null){
            createList(nodeValue);
            return;
        }
        else if(location==0){
            node.next = head;
            head = node;

        }
        else if(location>=size){
            node.next = null;
            tail.next = node;
            tail = node;
        }
        else{
            ListNode temp =head;
            int index=0;

            while(index<location-1){
                temp = temp.next;
                index++;
            }

            ListNode nextNode =temp.next;
            temp.next = node;
            node.next =nextNode;
        }
        size++;
    }

    //traversal

    public void traverseList(){
        if(head==null){
            System.out.println("List is empty!");
            return;
        }
        else{
            ListNode temp = head;
            int i =0;
            while(temp!=null){
                System.out.print(temp.value);
                if(i!=size-1){
                    System.out.print("->");
                }
                i++;
                temp = temp.next;
                
            }  
        }
        System.out.println(" ");
    }
    
}
