package LL;

public class reverse_Iterator_LL {

    Node head;

    class Node {

        String data;
        Node next;

        Node(String data) {

            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");

    }

    public void reverseIterate() {
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public static void main(String[] args) {

        reverse_Iterator_LL list = new reverse_Iterator_LL();
        list.addFirst("1");
        list.addFirst("3");
        list.addFirst("5");
        list.addFirst("6");
        list.addFirst("8");
        list.printList();
        list.reverseIterate();
        list.printList();
    }

}
