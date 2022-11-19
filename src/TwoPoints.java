import java.util.Scanner;
public class TwoPoints {
    public class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    public Node head = null;
    public Node tail = null;
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }
        else {
             tail.next = newNode;
             tail = newNode;
             tail.next = head;
        }
    }
    public void display() {
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            System.out.println("Nodes of the circular linked list: ");
             do{
                System.out.print(current.data+" ");
                current = current.next;
            }while(current != head);
            System.out.println();
        }
    }
    public int computePointOfInterception(int a, int b) {
    	Node temp = head;
    	Node temp1 = head;
    	 if(head == null)
    	 {
    		 System.out.println("List is empty");
    	 }
    	 else
    	 {
    		 while(temp.data !=a)
    		 {
    			 temp =temp.next;
    		 }
    		 while(temp1.data !=b)
    		 {
    			 temp1 =temp1.next;
    		 }
    		 while(temp.data != temp1.data)
        	 {
        		 temp =temp.next.next;
        		 temp1 =temp1.next;
        	 }
    	 }
    	 return temp.data;
    	
     }
    public static void main(String[] args) {
    	TwoPoints tp = new TwoPoints();
    	tp.add(1);
    	tp.add(2);
    	tp.add(3);
    	tp.add(4);
    	tp.add(5);
    	tp.add(6);
    	tp.add(7);
    	tp.add(8);
    	tp.add(9);
    	tp.add(10);
    	tp.add(11);
    	tp.add(12);
    	tp.display();
        int v,a,b;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        v = tp.computePointOfInterception(a,b);
        System.out.println("The meet point is at "+v);
    }
}


