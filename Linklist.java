
 public class Linklist {
 
    public static class Node {
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
        
        
    }
    public static void display(Node head){
        while (head!=null) {
            System.out.print(head.data+" ");
            head=head.next;

        }
        System.out.println();
    }
    
    public static void displayr(Node head){
        if (head==null) {
            System.out.println();
            return;
        }
        System.out.print(head.data+" ");
        displayr(head.next);
    }

    public static void main(String[] args) {
        Node a=new Node(2);
        Node b=new Node(3);
        Node c=new Node(6);
        Node d=new Node(8);
    
        a.next=b;
        b.next=c;
        c.next=d;

        display(a);
        displayr(a);
       
    }
 }