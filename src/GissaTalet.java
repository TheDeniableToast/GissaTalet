import java.util.Random;
import javax.swing.*;

public class GissaTalet {

    public static void main(String[] args) {

        //Obtain number between 1-100
        int n = (int)(Math.random() * 11);
        int m = 1;
        //Variables
        String s = JOptionPane.showInputDialog(null, "Skriv ett nummer");
        int k = Integer.parseInt(s);

        while (k != n) {

            s = JOptionPane.showInputDialog(null, "Skriv ett nummer");
            k = Integer.parseInt(s);

            if (k != n) {
                m = m + 1;
            }

            if (k == n) {
                m = m - 1;
                JOptionPane.showMessageDialog(null, "You guessed right! Amount of tries:" + m);
            }
        }
    }
        }