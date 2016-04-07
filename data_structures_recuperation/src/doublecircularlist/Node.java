
package doublecircularlist;


public class Node {
    
    protected int data;
    protected Node next;
    protected Node back;
    
    public Node(int d){
        
        data = d;
        next = this;
        back = this;
        
    }
    
}
