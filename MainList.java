public class MainList {
    public static void main(String[] args) {
        List list = new List();
        // list.createList(1);
        // System.out.println(list.head.value);
        list.insertInList(1, 0);
        list.insertInList(2, 1);
        list.insertInList(3, 2);
        list.insertInList(4, 5);
        list.insertInList(1, 6);
        list.insertInList(1, 7);
        // System.out.println(list.head.next.value);
        list.traverseList();
        RemoveDupsFromUnsortedList rlist = new RemoveDupsFromUnsortedList();
        rlist.deleteDups(list);
        list.traverseList();

    }
    
}
