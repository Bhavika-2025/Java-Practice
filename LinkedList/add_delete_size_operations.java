package LL;

class add_print {

    Node head;
    private int size;

    add_print() {
        this.size = 0;
    }

    class Node {

        String data;
        Node next;

        //constructor
        Node(String data) {
            this.data = data;
            this.next = null;

            size++;
        }
    }
    //add first in LL

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }

    //delete first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("empty list");
            return;
        }

        size--;

        head = head.next;
    }

    //delete last
    public void deleteLast() {
        if (head == null) {
            System.out.println("empty list");
            return;
        }
        size--;

        Node secondLast = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");

    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        add_print list = new add_print();
        list.addFirst("am");
        list.addFirst("I");
        list.addLast("Bhavika");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());

    }

}
