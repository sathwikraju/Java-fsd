package practice_project_7;

class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedListTraversal {
    Node head;

    public static void main(String[] args) {
        DoublyLinkedListTraversal list = new DoublyLinkedListTraversal();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        System.out.println("Forward traversal:");
        list.traverseForward();

        System.out.println("Backward traversal:");
        list.traverseBackward();
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    public void traverseForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void traverseBackward() {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }
}
