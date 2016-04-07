package Unity1.simplestructures;

/**
 *
 * @author Darcks OMega
 */
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

            Node aux = head;
            while (aux.Next != null) {

                aux = aux.Next;

            }

            aux.Next = n;

        }

    }

    public void print() { //Codigo para imprimir datos "16/02/2016

        Node aux = head;
        while (aux != null) {

            System.out.println("  " + aux.data);
            aux = aux.Next;

        }
        System.out.println();

    }

    public int remove(int i) {

        if (head == null) {
        }
        if (i == 0) {
            head = head.Next;
        }
        Node aux = head, p = null;
        int Counter = 0;
        for (; Counter < i && aux != null; Counter++) {
            p = aux;
            aux = aux.Next;
        }
        if (aux != null) {
            p.Next = aux.Next;
        }
        return aux.data;

    }

    public int count() {

        Node aux = head;
        int count = 0;
        while (aux != null) {

            count++;
            aux = aux.Next;

        }
        return count;

    }

    public int PrintFirstElement(int d) { //Metodo 8

        Node aux = head;
        if (aux == null) {
            System.out.println(" -1 ");
        }
        System.out.println(aux.data);
        return -1;
    }

    public void PrintLastElement() { //Metodo 9

        Node aux = head;

        if (aux != null) {
            while (aux.Next != null) {
                aux = aux.Next;
            }
            System.out.print(aux.data);
        } else {
            System.out.println(" -1 ");
        }

    }

    public void RemoveFirstElement() {

        if (head == null) {
            return;
        }
        head = head.Next;
    }

    public void RemoveLastElement() {

        if (head == null) {
            return; 
        }
        Node aux = head, p = null;
        p = aux;
        while (aux.Next != null) {
            aux = aux.Next;
        }
        p.Next = aux.Next;
        
            
    if( head.Next != null){
    head = null;
    }
}
    
    public void removeIntercaled(){
       
	Node aux= head,p=head;
        int c=count();
        for(int i=0;i<c;i++){
            if(i%2==1){

                p.Next=aux.Next;

            }

            p=aux;
            aux=aux.Next;

        }
    }
    
    public void DuplicateIntercaled(){

        Node aux= head,p=head;
        int c=count();
        for(int i=0;i<c;i++){

            Node n=new Node(aux.data);
            n.Next=aux.Next;
            aux.Next=n;
            aux=n.Next;

        }
    }
    
    public void Invert(){

        Node aux= head,head2=null;
        while(head!=null){
            aux=head;
            head=head.Next;
            aux.Next=head2.Next;
            head2.Next=aux;
        }

        head=head2;
    }
    
    public void RemoveRecurrents(){

        Node p =head, aux=head, back=head;
        while(aux.Next!=null){

            p=head;
            while(p!=aux){

                if(p.data==aux.data){

                    back.Next=aux.Next;
                    back=aux;
                }

                p= p.Next;
            }

            back=aux;
            aux=aux.Next;
        }
    }
    
    
    
    public void insertZeros(){
        
        Node aux=head;
        int  d = count();
        for(int i=1; i<d; i++){
            Node n=new Node(0);
            n.Next = aux.Next;
            aux.Next = n;
            aux = n.Next;
        }
        
        
        
    }
    
    
    public void removeMiddle(int e){
        
        Node aux= head , back =head;
        int c= count();
        int half= c/2;
        
         for(int i=0;i<half;i++){

             back=aux;
             aux=aux.Next;
             
         }
         back.Next=aux.Next;

        
    }    
   
    
    public int countOdds(){

        Node aux= head; 
        int cont= 0;
        while(aux.Next!=null){

            if(aux.data%2!=0){
                cont++;
            }

            aux=aux.Next;
        }

        return cont;
    }
    
}
