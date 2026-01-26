
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class JavaPanel {
    public static void main(String[] args) {

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.DARK_GRAY);
        redPanel.setBounds(0,0,250,250);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(750, 480);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.add(redPanel);
    }
}