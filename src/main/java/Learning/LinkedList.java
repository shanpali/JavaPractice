package Learning;

public class LinkedList {

     Node head;

      class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public void push(int data){


        Node n = new Node(data);
        n.next=head;
        head=n;

    }
    public void pushfromLast(int data){


        Node n = new Node(data);

        if(head==null){
            head=n;
        }else {

            Node last = head;


            while (last.next != null) {
                last = last.next;
            }

            last.next = n;
            n.next = null;
        }

    }

    public void printAll(LinkedList ll){
          Node n = ll.head;
          while(n!=null){
                  System.out.print(n.data+" ");
                  n=n.next;
              }
        System.out.println();
    }
    public void printNthFromLast(LinkedList ll, int nth){
        int totalnodes = 0;
        Node last = ll.head;
        while(last!=null){
            last=last.next;
            totalnodes++;
        }
        Node n = head;
        for(int i = 0; i<= totalnodes-(nth);i++){
if(i==totalnodes-(nth)) {
    System.out.println(n.data + " ");
}
            n = n.next;
        }
    }
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        for(int i =1;i<20;i++){
            llist.pushfromLast(i);
        }
        llist.printAll(llist);
        llist.printNthFromLast(llist,4);
    }
}
