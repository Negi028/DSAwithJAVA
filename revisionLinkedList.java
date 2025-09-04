//question, insertatEnd, insertatbEGINing , insertAtIndex , display , size show , getElement at index , delete at  index 

public class revisionLinkedList{
    //initially make node user defined data type
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;//for not overshadowing problem , not taken instance value
        }
    }
    public static  class implementLinkedList{
       Node head=null;//initailly all taken null for empty list
       Node tail= null;
       int size=0;

       void insertAtBegin(int val){
        Node newnode= new Node(val);
        if(head==null){//empty list
            head=newnode;
            tail=newnode;
        }else{//non empty list
            newnode.next=head;
            head=newnode;    
        }
        size++;//for storing the size of linked list o(1) time complexity
       }

       void insertAtEnd(int val){
        Node newnode=new Node(val);
        if(head==null){//empy list
            head=newnode;
        }else{//non empty list
            tail.next=newnode;
        }
        tail=newnode;
        size++;
       }

       void insertAtIndex(int index, int val){
        Node newnode= new Node(val);
        Node temp=head;
        if(index<0 || index> size){
            System.out.println("wrong input");
        }
        else if(index==0){
            insertAtBegin(val);
        }
        else if(index==size){
            insertAtEnd(val);
        }else{
            for(int i=1;i<=index-1;i++){
                temp=temp.next;
            }
            newnode.next=temp.next;
            temp.next=newnode;
            size++;
        }
       }


       int getElement(int index){
        Node temp=head;
        for(int i=0;i<=index-1;i++){
            temp=temp.next;
        }
        return temp.data;
       }


       void deleteAtIndex(int index){
        Node temp=head;
        if(index<0 || index>size){
            System.out.println("wrong answer");
        }else if(index==0){
            head=head.next;//store also updated head data
            size--;
        }
        for(int i=0;i<=index-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        tail=temp;//update the tail after dealetion of last element if
        size--;
       }

       void displau(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp=temp.next;
        }
       }
    }
    public static void main(String[] args) {
        implementLinkedList ak= new implementLinkedList();
        ak.insertAtBegin(10);
        ak.insertAtBegin(20);
        ak.insertAtEnd(30);
        ak.insertAtIndex(0, 13);
        ak.insertAtIndex(1, 28);
       
        ak.displau();
        System.out.println();
        System.out.println(ak.getElement(0));
        System.out.println(ak.head.data);
        ak.deleteAtIndex(3);
        ak.displau();
        System.out.println();
        System.out.println(ak.tail.data);
        System.out.println(ak.size);
    }
}