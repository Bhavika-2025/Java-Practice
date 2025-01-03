package LL;

public class reverse_recursive_LL {

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

    public Node reverseRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        reverse_recursive_LL list = new reverse_recursive_LL();
        list.addFirst("1");
        list.addFirst("3");
        list.addFirst("5");
        list.addFirst("6");
        list.addFirst("8");
        list.printList();
        // list.reverseIterate();
        list.head = list.reverseRecursive(list.head);
        list.printList();
    }

}
