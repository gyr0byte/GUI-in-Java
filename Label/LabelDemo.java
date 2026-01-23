
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class LabelDemo {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("Label/logo.jpg");
        Border border = BorderFactory.createLineBorder(Color.BLACK, 4);
        JLabel label = new JLabel();
        label.setText("I am Gaurav");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text left, center, right of image icon
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(123, 50, 255));
        label.setFont(new Font("Arial", Font.BOLD, 14));
        label.setIconTextGap(10);
        label.setBackground(Color.DARK_GRAY);
        label.setOpaque(true); // this will actually make background color visible
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position icon + text within label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontol positon icon + text within label
        label.setBounds(0,0,400,300);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(true);
        frame.setSize(900, 720);
        frame.add(label);
        frame.setVisible(true);
        frame.add(label);
    }
}