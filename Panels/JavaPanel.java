
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JavaPanel {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("Panels/cat.png");

        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.TOP);

        JPanel greyPanel = new JPanel();
        greyPanel.setBackground(Color.DARK_GRAY);
        greyPanel.setBounds(0, 0, 250, 250);
        
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(250, 0, 250, 250);
        
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);
        greenPanel.setLayout(new BorderLayout());
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(750, 550);
        frame.setVisible(true);
        frame.setLayout(null);
        greenPanel.add(label);
        frame.add(greyPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }
}