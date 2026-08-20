static void insertBeginning(int data) {

    Node newNode = new Node(data);

    if (head == null) {
        head = newNode;
        newNode.next = head;
        return;
    }

    Node temp = head;

    while (temp.next != head) {
        temp = temp.next;
    }

    newNode.next = head;
    temp.next = newNode;
    head = newNode;
}