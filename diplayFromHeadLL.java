//displaying all element of linked list from head
public class diplayFromHeadLL {
    public static class Node{//user defined data type : linked list
        int data;
        Node next;
        public Node(int data){//constructor for creating object on calling 
            this.data=data;//for not overshadowing from instance variable
        }
    }
    public static void main(String[] args) {
        Node a= new Node(5);
        Node b=new Node(6);
        Node c =new Node(7);
        Node d =new Node(8);
        Node e =new Node(10);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        
        Node temp=a;
        while (temp!=null) { 
            System.out.print(temp.data+" ->");
            temp=temp.next;
        }
    }
}
