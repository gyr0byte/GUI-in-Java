import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

    public MyFrame() {
        this.setTitle("JFrame title goes here"); // sets the title for the JFrame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        this.setResizable(false); // can't resize the window
        this.setSize(640, 420); // sets the x dimension and y dimension of the frame
        this.setVisible(true); // make frame visible

        ImageIcon image = new ImageIcon("Jframee/logo.jpg"); // create an image icon
        this.setIconImage(image.getImage()); // change the icon of the frame
        this.getContentPane().setBackground(new Color(123, 50, 250)); // change the color of the background
    }

}