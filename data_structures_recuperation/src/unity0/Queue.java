package unity0;

/**
 *
 * @author Darcks OMega
 */
public class Queue {

    private int[] data;
    private int top;

    public Queue() {

        data = new int[100];
        top = 0;

    }

    public void add(int d) {

        data[top] = d;
        top++;

    }

    public int remove() {

        int d = data[0]; //La primera posicion esta en data y en el lugar 0.
        for (int i = 0; i < top - 1; i++) {
            data[i] = data[i + 1]; /*En data sub i, se va a compiar lo que esta en
             data sub i+1.
             */

        }
        top--;
        return d;

    }

    public void print() {

        for (int i = 0; i < top; i++) {
            System.out.print(" " + data[i]);
        }
        System.out.println();
    }

}
