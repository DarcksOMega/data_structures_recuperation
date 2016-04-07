package unity0;

/**
 *
 * @author Darcks OMega
 */

public class Test {

    public static void main(String[] args) {

        TestingStacks();
        TestingQueue();
        PrintList();

    }

    public static void TestingStacks() {

        System.out.println(" Stack Testing ");
        Stack s = new Stack();
        s.add(10);
        s.add(20);
        s.add(30);

        s.print(); // Imprimira estos números: 10, 20, 30

        s.remove(); /*Como es una pila, se remueve el ultimo que fue adicionado, en este caso, el
         nùmero 30 */

        s.print(); // Aquí imprime los 2 primeros números, que son el 10 y el 20

        for (int i = 2; i < 20; i += 2) { //Este es un incremento de 2 en 2
            s.add(i);
        }

        s.print(); //Se imprimiran los elementos adicionales
    }

    public static void TestingQueue() {

        System.out.println(" Queue Testing ");
        Queue q = new Queue();
        for (int i = 1; i <= 20; i++) {
            q.add(i);
        }
        System.out.print(" Initial value: ");
        q.print();

        int d= q.remove();
        System.out.println(" The element removed was: "+d);
        System.out.print(" Valores Actuales ");
        q.print();
    }
    
    public static void PrintList(){ //Imprimir Lista
        
        List  L = new List();
        
            L.add(1,0); //Añadir números y posiciones
            L.add(4,1);
            L.add(3,2);
            L.add(10,3);
            L.add(5,4);
            L.add(30,5);
            
                
            System.out.println("Initial element: "); //Imprimir elementos iniciales
        
            L.print(); //Imprimir los elementos que se han añadido
        
        
        
    }
    
}
