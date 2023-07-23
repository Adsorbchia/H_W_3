import org.w3c.dom.Node;

public class List {
   private Node head;
   private Node tail;
   private int size;


   public void addNode(int value){
       Node newNode = new Node(value);
       if(tail == null){
           tail=newNode;
           head = newNode;
           size=1;
           return;}
       else  {
           tail.next = newNode;
           newNode.previous = tail;
           tail = newNode;
           size++;}}
    public void revert(){
       Node currentNode = head;
       while (currentNode!=null){
           Node next = currentNode.next;
           Node previous = currentNode.previous;
           currentNode.next = previous;
           currentNode.previous = next;
           if(previous == null){
               tail=currentNode;
           }
           if(next==null) {
               head = currentNode;
           }
           currentNode =next;


       }
    }

    public void printNode(){ 
       Node currentNote = head;
        System.out.print("["+" ");
        while (currentNote != null){
            System.out.print(currentNote.value+" ");
            currentNote =currentNote.next;
        }
        System.out.print("] size = " + getSize());
    }

    private int getSize() {
       return size;
    }


    private class Node{
        Node next;
        int value;
        Node previous;

        public Node(int value) {
            this.value = value;
        }

        public Node(Node next, int value, Node previous) {
            this.next = next;
            this.value = value;
            this.previous = previous;
        }
    }

    }

