public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public int searchItr(int key) {
        Node temp = head;
        int idx = 0;
        while (temp != null) {
            if (temp.data == key) {
                return idx;
            }
            temp = temp.next;
            ++idx;
        }
        return -1; //invalid value
    }

    public int searchRec(Node head, int key) {
        if (head == null) {
            return -1;
        } else if (head.data == key) {
            return 0;
        }
        int idx = searchRec(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public void print() {
        Node temp = head;
        if (head == null) {
            System.out.println("The Linked List is empty!");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    // now checking for palindrome
    public Node findMid(Node head) {

        //The slow and fast concept or the turtle and the hare concept 
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrome() {

        // step-1: to find mid node with the base condition!
        if (head == null || head.next == null) {
            return true;
        }
        Node midNode = findMid(head);

        // step-2: reverse the half LL from the mid!
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        // step-3: check for similarity between the left LL and the right LL
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        // System.out.println(ll.searchRec(head, 1));
        System.out.println(ll.checkPalindrome());
    }
}