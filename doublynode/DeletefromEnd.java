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

    static void deleteEnd() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.prev.next = null;
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

        deleteEnd();

        display();
    }
}