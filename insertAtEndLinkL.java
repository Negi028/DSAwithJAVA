//various function in linked list 
//1) add at end on tail
//2)display the linked list
//3)insert at begining
public class insertAtEndLinkL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    
    public static class linkedlist{//data structure with multiple method inside it 
        Node head=null;
        Node tail=null;
        void insertATEnd(int val){
            Node n1= new Node(val);
            //empty linked list
            if(head==null){
                head=n1;
            }//non empty linked list
            else{
                tail.next=n1;
            }
            tail=n1;
        }

        void insertAtBegining(int val){
            Node temp= new Node(val);
            if(head==null){
                //empty list
                head=temp;
                tail=temp;
            }
            //non empty list
            else{
                temp.next=head;
                head=temp;
            }

        }

        void insertAt(int index,int data){
            if(index<0 || index>size()){
                System.out.println("wrong index input");
                return;
            }
            else if(index==0){
                insertAtBegining(data);
                return;
            }
            else if(index==size()){
                insertATEnd(data);
                return;
            }
            else {
                Node t= new Node(data);
                Node temp=head;
                for(int i=1;i<=index-1;i++){
                    temp=temp.next;
                }
                t.next=temp.next;
                temp.next=t;
            }
        }

        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
        }

        int size(){
            Node temp= head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        linkedlist ll= new linkedlist();
        ll.insertATEnd(13);
        ll.insertATEnd(28);
        ll.insertAtBegining(28);
        ll.insertAt(0, 12);
        ll.insertAt(4, 13);
        System.out.println(ll.head.data);
        System.out.println(ll.tail.data);
        ll.display();
    }
}
