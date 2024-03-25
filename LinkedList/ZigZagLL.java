public class ZigZagLL {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addLast(int data){
        Node newNode =  new Node(data);
        if (head==null) {
            head=tail=newNode;
            return;            
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void print(){
        Node temp=head;
        if(head==null){
            System.out.println("The Linked List is empty!");
            return;
        }
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public void zigZag(){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;
        Node nextL,nextR;
        while (left!=null&&right!=null) {
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;
            left=nextL;
            right=nextR;
        }
    }
    public static void main(String[] args) {
        ZigZagLL ll=new ZigZagLL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        // ll.addLast(6);
        ll.zigZag();
        ll.print();
    }
}
