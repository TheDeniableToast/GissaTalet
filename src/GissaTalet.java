import java.util.Random;
import javax.swing.*;

public class GissaTalet {

    public static void main(String[] args) {

    Random rand = new Random();

    //Obtain number between 0-100
        int n = rand.nextInt(100);
        n += 1;

       JOptionPane.showMessageDialog(null, n);
        }
        }