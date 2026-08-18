class DoublyLinkedList {

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node head = null;

    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.head = list.new Node(10);

        Node second = list.new Node(20);
        Node third = list.new Node(30);

        list.head.next = second;
        second.prev = list.head;

        second.next = third;
        third.prev = second;

        list.display();
    }
}