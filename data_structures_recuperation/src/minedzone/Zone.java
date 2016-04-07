package minedzone;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class Zone extends JFrame {

    protected Mine head, current;

    public Zone() {
        setTitle("Zona Minada");
        setSize(500, 400);
        LaunchEvents();
        setVisible(true);
        head = current = null;

    }

    public void addMine(int x, int y) {
        Mine n = new Mine(x, y, this);
        if (head == null) {
            head = n;

        } else {
            Mine aux = head;
            while (aux.next != null) {
                aux = aux.next;
            }
            aux.next = n;
            n.back = aux;

        }
        current = n;

    }

    public void goForward() {
        if (current.next != null) {
            current = current.next;
        }

    }

    public void goBack() {
        if (current.back != null) {
            current = current.back;
        }

    }

    public void explode() {
        if (current != null) {
            current.state = true;
        }
    }

    public void Deletetheslectedmine() {
        if (current.next != null) {
            current.back.next = current.next;

        }
        if (current.next != null) {
            current.next.back = current.back;
        }
        if (current == head) {
            if (current.next != null) {
                head = head.next;
                head.back = null;
                current = current.next;

            } else {
                current = null;
                head = null;
            }
        }
    }

    public void ResetMines() {

        Mine d = head;
        while (d != null) {
            d.state = false;
            d = d.next;
        }
    }

    public void Exploteallmines() {
        Mine d = head;
        while (d != null) {
            d.state = true;
            d = d.next;
        }

    }

    public void paint(Graphics g) {
        g.clearRect(0, 0, getWidth(), getHeight());
        if (head == null) {
            return;
        }
        Mine aux = head;
        while (aux != null) {
            aux.paint(g, aux == current);
            aux = aux.next;
        }

    }

    public void LaunchEvents() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent me) {
                addMine(me.getX(), me.getY());
                repaint();
            }

            public void mousePressed(MouseEvent me) {

            }

            public void mouseReleased(MouseEvent me) {

            }

            public void mouseEntered(MouseEvent me) {

            }

            public void mouseExited(MouseEvent me) {

            }
        });
        addKeyListener(new KeyListener() {

            public void keyTyped(KeyEvent ke) {

            }

            public void keyPressed(KeyEvent ke) {
                switch (ke.getKeyCode()) {
                    case KeyEvent.VK_D:
                        goForward();
                        break;
                    case KeyEvent.VK_A:
                        goBack();
                        break;
                    case KeyEvent.VK_ENTER:
                        explode();
                        break;
                    case KeyEvent.VK_SPACE:
                        Exploteallmines();
                        break;
                    case KeyEvent.VK_DELETE:
                        Deletetheslectedmine();
                        break;
                    case KeyEvent.VK_ESCAPE:
                        ResetMines();
                        break;

                }
                repaint();
            }

            public void keyReleased(KeyEvent ke) {

            }
        });

    }

    public static void main(String args[]) {
        new Zone();
    }
}
