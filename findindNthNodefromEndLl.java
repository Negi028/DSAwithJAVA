// finding nth node form end point of linked list 
//slow and faster maintain distance from end to which we need as slow 
public class findindNthNodefromEndLl {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }

    }
    public static Node nthNodeEndLl(Node head , int n){
        //intiallly two pointer in head
        Node slow=head;
        Node fast= head;
        for(int i=1;i<=n;i++){
            fast=fast.next;//isko nth leh jaana starting seh
        }//then both will go 1 step further for finding the value
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        // 10 20 30 40 50
        //output must be 30
        Node output=nthNodeEndLl(a, 3);
        System.out.println(output.data);
    }
}
