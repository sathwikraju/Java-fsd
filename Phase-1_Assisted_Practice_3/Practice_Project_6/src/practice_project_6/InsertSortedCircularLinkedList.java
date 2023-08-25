package practice_project_6;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertSortedCircularLinkedList {
    static Node head;

    public static void main(String[] args) {
        InsertSortedCircularLinkedList list = new InsertSortedCircularLinkedList();
        list.insert(2);
        list.insert(4);
        list.insert(6);
        list.insert(8);

        System.out.println("Before insertion:");
        list.display();

        int newValue = 5;
        list.insertSorted(newValue);

        System.out.println("After insertion of " + newValue + ":");
        list.display();
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertSorted(int newValue) {
        Node newNode = new Node(newValue);

        if (head == null) {
            head = newNode;
            head.next = head;
        } else if (newValue <= head.data) {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != head && curr.next.data < newValue) {
                curr = curr.next;
            }
            newNode.next = curr.next;
            curr.next = newNode;
        }
    }

    public void display() {
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}
