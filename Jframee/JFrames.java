import javax.swing.JFrame;
public class JFrames {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); // creates a frame
        frame.setTitle("JFrame title goes here"); // sets the title for the JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        frame.setSize(640, 420); // sets the x dimension and y dimension of the frame
        frame.setVisible(true); // make frame visible
    }
}