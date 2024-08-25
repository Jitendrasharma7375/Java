import javax.swing.*;
import java.awt.*;
public class JPanelEx {

    public JPanelEx(){
        JFrame frame = new JFrame("Custom JPanel");
        frame.setBounds(100,100,400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Container c=frame.getContentPane();
        c.setBackground(Color.RED);
        c.setLayout(null);

        JPanel panel=new JPanel();
        panel.setBounds(0,0,300,200);
        c.add(panel);

        JButton btn=new JButton("Click Me");
        btn.setBounds(50,50,100,30);
        panel.add(btn);

        JOptionPane.showInputDialog("Enter Password");

    }
    public static void main(String[] args) {
        JPanelEx panel=new JPanelEx();
    }
}
