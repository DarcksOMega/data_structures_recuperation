package unity0;

/**
 *
 * @author Darcks OMega
 */
public class List {

    private int data[];
    private int top;

    public List() {

        data = new int[100];
        top = 0;

    }

    public void add(int d, int p) {

        data[p] = d;
        top++;

    }

    public int remove(int p) {

        int d = data[p];
        
        for (int i = p; i < top; i++) {

            data[i] = data[i + 1];

        }
        
        top--;
        return data[d];

    }

    public void print() {

        for (int i = 0; i < top-1; i++) {

            System.out.print(" " + data[i]);

        }
        
        System.out.println();

    }

}
