package unity0;

/**
 *
 * @author Darcks OMega
 */
public class Stack {

    private int[] data;
    private int top;

    public void add(int d) {
        data[top] = d;
        top++;
    }

    public int remove() {
        top--;
        return data[top];
    }

    public void print() {
        for (int i = 0; i < top; i++) {
            System.out.print(" " + data[i]);
        }
        System.out.println();
    }

    public Stack() {
        data = new int[100];
        top = 0;
    }
}
