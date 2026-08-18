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

    static void insertAtPosition(int data, int position) {

        Node newNode = new Node(data);

        if (position == 1) {

            newNode.next = head;

            if (head != null) {
                head.prev = newNode;
            }

            head = newNode;
            return;
        }

        Node temp = head;

        for (int i = 1; i < position - 1; i++) {

            if (temp == null) {
                System.out.println("Invalid position");
                return;
            }

            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        newNode.next = temp.next;
        newNode.prev = temp;

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

        insertAtPosition(10, 1);
        insertAtPosition(20, 2);
        insertAtPosition(30, 3);

        insertAtPosition(15, 2);

        display();
    }
}