
package Unity1.simplestructures;

/**
 *
 * @author Darcks OMega
 */
public class Test {
    
    public static void main(String[] args){ //Clase prueva 16/02/2016
        
        List L = new List();
        L.add(5);
        L.add(10);
        L.add(15);
        
        System.out.println(" Initial Elements:  ");
        L.print();
        
        int c = L.count();
        System.out.println("Total nodes:  " + c );
        
        System.out.print(" The Firts element is: ");
        
        
        System.out.println(" The Last Element is: ");
        L.PrintLastElement();
        
        
    }
    
}
