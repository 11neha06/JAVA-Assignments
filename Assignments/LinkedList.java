public class LinkedList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data= d;
            next= null;
        }
    }
    public static void main(String[] args){
        LinkedList n= new LinkedList();
        n.head= new Node(1);
        Node second= new Node(2);
        Node third= new Node(3);
        n.head.next= second;
        second.next= third;
        System.out.print("LinkedList: ");
        while (n.head!= null) {
            System.out.print(n.head.data+" ");
            n.head= n.head.next;
        }
    }
}
