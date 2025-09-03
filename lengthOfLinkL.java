//display the linked list and return the length of linked list
public class lengthOfLinkL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ->");
            temp=temp.next;
        }
    }

    public static int lengthOfL(Node head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
    public static void main(String[] args) {
        Node a= new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        display(a);
        System.out.println();
        System.out.println(lengthOfL(a));
    }
}
