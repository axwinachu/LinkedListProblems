public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sl=new SinglyLinkedList();
        sl.addFirst(1);
        sl.addFirst(2);
        sl.addFirst(3);
        sl.addFirst(4);
        sl.addFirst(5);
        sl.addLast(20);
        sl.display();
        sl.addREc(90, 1);
        System.out.println(sl.deleteFirst());
        System.out.println();
        sl.display();
    }
}
