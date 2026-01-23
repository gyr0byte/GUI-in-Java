
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelDemo {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("Label/logo.jpg");
        JLabel label = new JLabel();
        label.setText("I am Gaurav");
        label.setIcon(image);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setSize(900, 720);
        frame.add(label);
        frame.setVisible(true);
        frame.add(label);
    }

}