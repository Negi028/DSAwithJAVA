public class insertionAtLinkList {
    class Node{
        public int data;
        public Node next;
        //constructor
        public Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    Node head=null;//intially 
    //insert at begining
    public void  insertionAtBegining(int item){
        Node newNode= new Node(item);
        if(head==null){
            head=newNode;
            return;
        }
        else{
            //for linking
            newNode.next=head;//next appointment from head(store physical address of next element)
            head=newNode;//now newNode become head
        }
    }

    //insertion at the end of linked list
    public void insertionAtEnd(int item){
        Node newNode=new Node( item);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    //Insertion at specific location
    public void insertAtSpecLoc(int item,int position){
        Node newNode=new Node(item);
        if(position<0){
            System.out.println("invalid location");
        }
        if(position==0){
            newNode.next=head;//for linking
            head=newNode;
            return;//for storing other nodes
        }
        Node temp=head;
        int index=0;
        while(temp!=null){
            if(index==position-1){
                break;
            }
            temp=temp.next;
            index++;
        }
            newNode.next=temp.next;//for linking purpose
            temp.next=newNode;
        

    }
    
    public void printData(){
        Node temp=head;
        if(head==null){
            System.out.println("Linked list is empty");
        }
        while(temp!=null){
            if(temp.next==null){
                System.out.print(temp.data);
                break;
            }
            else{
            System.out.print(temp.data+"->");
            temp=temp.next;
            }
            
        }
    }
    public static void main(String[] args) {
        insertionAtLinkList ll= new insertionAtLinkList();
      
        ll.insertionAtBegining(18);
        ll.insertionAtBegining(12);
        ll.insertionAtBegining(13);
        ll.insertionAtEnd(28);
        ll.insertAtSpecLoc(10, 3);
        ll.printData();
    }

}
