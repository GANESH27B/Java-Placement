class Main {

    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node reverse(Node head) {

        Node current = head;
        Node newHead = null;

        while (current != null) {

            Node temp = current.prev;

            current.prev = current.next;
            current.next = temp;

            newHead = current;

            current = current.prev;
        }

        return newHead;
    }

    static void display(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(10);

        Node second = new Node(20);
        head.next = second;
        second.prev = head;

        Node third = new Node(30);
        second.next = third;
        third.prev = second;

        head = reverse(head);

        display(head);
    }
}