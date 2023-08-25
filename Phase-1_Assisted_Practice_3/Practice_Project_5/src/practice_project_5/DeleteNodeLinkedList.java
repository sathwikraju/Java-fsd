package practice_project_5;
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteNodeLinkedList {
    static Node head;

    public static void main(String[] args) {
        DeleteNodeLinkedList list = new DeleteNodeLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        System.out.println("Before deletion:");
        list.display();

        int key = 3;
        list.deleteNode(key);

        System.out.println("After deletion of key " + key + ":");
        list.display();
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
        }
    }

    public void deleteNode(int key) {
        Node prev = null;
        Node curr = head;

        if (curr != null && curr.data == key) {
            head = curr.next;
            return;
        }

        while (curr != null && curr.data != key) {
            prev = curr;
            curr = curr.next;
        }

        if (curr == null) {
            return;
        }

        prev.next = curr.next;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
