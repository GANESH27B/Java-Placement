class Main {

    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
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

        Node temp = head;

        // Go to last node
        while (temp.next != null) {
            temp = temp.next;
        }

        // Traverse backwards
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }
}