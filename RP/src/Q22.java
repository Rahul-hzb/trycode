// Double link list.
public class Q22 {

    public static class Node{
        int val;
        Node next;//Null(head)
        Node prev;//Null
        Node(int val){
            this.val= val;
        }
    }
    public static void display(Node  head){
        Node temp=head;
        while( temp!=null){
            System.out.print( temp.val  + " ");
            temp= temp.next;

        }
        System.out.println();

    }

    public static void displayrev( Node tail){
        Node temp= tail;
        while( temp!=null){
            System.out.print(temp.val +" ");
            temp=temp.prev;
        }
        System.out.println();
    }

    // pass randam value and display whole linklist:
    public static void display3(Node random){
        Node temp=random;
        // move the temp back to the head
        while ( temp.prev!=null){
            temp= temp.prev;
        }
        // print the  linklist;
        while ( temp!=null){
            System.out.print( temp.val + " ");
            temp=temp.next;

        }

    }
    // insertion new node at head:
    public static Node insertionHead(Node head, int x){
        Node t= new Node(x);
        t.next=head;
        head.prev=t;
        head=t;
        return head;

    }
    public static void insertAtTail(Node head, int x){
        Node temp=head;
        //  temp ko tail tak leke jataai hai:
        while ( temp.next!=null){
            temp=temp.next;
        }
        Node t = new Node(x);
        temp.next=t;
        t.prev=temp;
        temp=t;

    }
    public static void AtAnyIndex( Node head, int idx, int val){
        Node temp=head;
        Node t= new Node(val);// create new node t:
        // set the index
        for(int i=0 ; i<idx-1;i++){
            temp=temp.next;
        }
            temp.next.prev=t;
            t.prev=temp;
            t.next=temp.next;
            temp.next=t;

        }
        // Delete head node :
    public static Node deleteHead(Node head){
        if( head==null){
            return null;
        }
        head=head.next;
        head.prev=null;

        return head;
    }
    public static void deleteTail(Node head ){
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp=temp.prev;
        temp.next=null;
    }
    public static void deleteAtIndex(Node head, int idx){
        Node temp=head;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        temp.next.prev=temp;
    }




    public static void main(String[] args) {
        // 4, 10 , 2 , 99, 13:

        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);

        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;

       // display(c );
        //displayrev(a);
        //display3(d);
       // Node newHead = insertionHead(a,30);
       // display(a);
         //insertAtTail(a,45);
         //display(a );
        //AtAnyIndex(a,2,55);
        //display(a);
       // deleteHead(a);
        //display(a);
        //deleteTail(a);
        //display(a);
       // a=deleteHead(a);
        display(a);
        deleteAtIndex(a,3);
        display(a);



    }

}
