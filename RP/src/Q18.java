// LinkList

public class Q18 {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirstNode(3);
        list.insertFirstNode(4);
        list.insertFirstNode( 6);

        list.display();
    }

}
class LL{
     Node head;
    private  Node tail;
    int size;
    LL( ){
        this.size=0;
    }
    public void insertFirstNode(int value){   //  Insert first linklist.

            Node temp= new Node(value);
            temp.value=value;
            temp.next=null;
            size++;
        if( size==0){
            head=tail=temp;
        } else{

            tail.next=temp;
            tail=temp;
        }
        Node node =new Node(value);
        node.next = head;
        head=node;
        if( tail==null){
            tail=head;
        }
        size++;
    }
    public void display(){
        Node temp=head;
        while( temp!=null){
            System.out.print( temp.value + " ->");
            temp=temp.next;
        }
        System.out.println( " End ");

    }
}
class Node{
     int value;
    Node next;
    public Node (int value ) {
        this.value= value;
    }
   // public Node ( int value, Node next){
     //   this.value=value;
       // this.next=next;
    //}
}
