
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFramee extends JFrame implements ActionListener{
    JButton button;
    public MyFramee(){
        button = new JButton();
        button.setBounds(200,100, 150,50);
        button.addActionListener(this);
        button.setText("press me");
        button.setFocusable(false);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            System.out.println("lol");
        }
    }
}