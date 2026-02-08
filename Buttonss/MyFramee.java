
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFramee extends JFrame implements ActionListener{
    JButton button;
    public MyFramee(){
        ImageIcon icon = new ImageIcon("Panels/cat.png");


        button = new JButton();
        button.setBounds(200,100, 250,150);
        button.addActionListener(this);
        button.setText("press me");
        button.setFocusable(false);
        button.setIcon(icon);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            System.out.println("meow");
        }
    }
}