class Main {

    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node head;

    static void insertAfter(int value, int data) {

        Node temp = head;

        while (temp != null && temp.data != value) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Node not found");
            return;
        }

        Node newNode = new Node(data);

        newNode.prev = temp;
        newNode.next = temp.next;

        if (temp.next != null) {
            temp.next.prev = newNode;
        }

        temp.next = newNode;
    }

    static void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        head = new Node(10);

        Node second = new Node(20);
        head.next = second;
        second.prev = head;

        Node third = new Node(30);
        second.next = third;
        third.prev = second;

        insertAfter(20, 25);

        display();
    }
}