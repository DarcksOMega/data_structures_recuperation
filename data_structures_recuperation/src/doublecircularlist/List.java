package doublecircularlist;

public class List {

    private Node head;

    public List() {

        head = null;

    }

    public void add(int d) {

        Node n = new Node(d);
        if (head == null) {

            head = n;

        } else {
            n.next = head;
            n.back = head.back;
            //cabezera en su campo atras y en su campo siguiente
            //head.back.next
            //se le copia lo que esta en la cabezera
            // = n
            head.back.next = n;
            head.back = n;

        }

    }

    public void print() {

        Node aux = head;
        while (aux != null) {

            System.out.println("  " + aux.data);
            aux = aux.next;

        }
        System.out.println();

    }

    public void moveFirtsToEnd() {

        head = head.next;
        
    }
    
    public void moveLastToBeginning() {

        head = head.back;
        
    }
    
    public void remove(int p){
        
        
        
    }
    
    public void invert(){
        
        
        
    }

}
