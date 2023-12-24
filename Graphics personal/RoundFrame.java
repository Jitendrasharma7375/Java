import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
public class RoundFrame extends JFrame{
    private JButton button;
    private Container c;
    RoundFrame()
    {
        setTitle("Round");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 200);
        setUndecorated(true);
        setLocationRelativeTo(null);
        setLayout(null);
        c=getContentPane();
        setShape(new Ellipse2D.Double(0,0,getWidth(),getHeight()));
        c.setBackground(Color.GREEN);
        button=new JButton("Exit");
        button.setBounds(55, 85, 100, 30);
        //button.setBorder(null);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });
        button.setBorderPainted(false);
        button.setFocusable(false);
        button.setBackground(Color.WHITE);
        add(button);
    }
    public static void main(String[] args) {
        RoundFrame frame=new RoundFrame();
        frame.setVisible(true);
    }
}
