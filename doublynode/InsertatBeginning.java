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

    static void insertAtBeginning(int data) {

        Node newNode = new Node(data);

        newNode.next = head;

        if (head != null) {
            head.prev = newNode;
        }

        head = newNode;
    }

    static void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        insertAtBeginning(30);
        insertAtBeginning(20);
        insertAtBeginning(10);

        display();
    }
}