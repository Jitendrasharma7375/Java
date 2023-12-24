import javax.swing.*;
import java.awt.*;
public class JButtonDemo {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 1000, 500);
        frame.setVisible(true);
        Container c=frame.getContentPane();
        c.setLayout(null);
        ImageIcon icon=new ImageIcon("R.PNG");
        JButton button;
        button=new JButton("Click Me");
       // button=new JButton(icon);
        //button.setSize(icon.getIconWidth(),icon.getIconHeight());
        button.setSize(150, 30);
        button.setLocation(100,100);
        c.add(button);
        Font font=new Font("Arial", Font.BOLD,20);
        button.setText("Mybutton");
        button.setForeground(Color.white);
        button.setBackground(Color.black);
        Cursor cur=new Cursor(Cursor.HAND_CURSOR);
        //Cursor cur=new Cursor(Cursor.CROSSHAIR_CURSOR);
        //Cursor cur=new Cursor(Cursor.WAIT_CURSOR);
        button.setCursor(cur);
        button.setFont(font);
        //button.setEnabled(false);
        button.setEnabled(true);
        //button.setVisible(false);
        button.setVisible(true);
        
    }
    
}
