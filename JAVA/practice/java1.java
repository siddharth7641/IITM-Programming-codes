import java.util.*;

public class java1 {
    public static void main(String[] args) {
        MyLinkedList<Integer> il = new MyLinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("1-> Insert, 2-> Remove, 3-> Print, 4-> Exit");

        while (true) {
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    int data = sc.nextInt();
                    il.insertAtFront(data);
                    break;
                case 2:
                    il.removeFromFront();
                    break;
                case 3:
                    il.print();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid");
            }
        }
    }
}

class MyLinkedList<T> {
    private Node head;

    private class Node {
        private T data;
        private Node next;

        public Node(T d) {
            data = d;
            next = null;
        }
    }

    public MyLinkedList() {
        head = null;
    }

    public void insertAtFront(T data) {
        Node nd = new Node(data);
        nd.next = head;
        head = nd;
    }

    public void removeFromFront() {
        if (head == null) {
            System.out.println("Empty");
        } else {
            head = head.next;
        }
    }

    public void print() {
        if (head == null) {
            System.out.println("Empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}
