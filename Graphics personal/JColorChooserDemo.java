import javax.swing.*;
import javax.swing.JColorChooser;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JColorChooserDemo {
    public static void main(String[] args) {
            JFrame frame=new JFrame("JColor Chooser");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setBounds(100,100,500,500);
            frame.setLayout(new FlowLayout());
            JLabel label1=new JLabel("Color:");
            label1.setSize(100, 30);
            frame.add(label1);
            JLabel label2=new JLabel("Select Color");
            label2.setSize(100, 30);
            frame.add(label2);

            JButton button=new JButton("Choose color");
            button.setSize(100, 30);
            button.setFocusable(false);
            frame.add(button);
            button.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                  
                    Color color=JColorChooser.showDialog(button, "", Color.black);
                    label2.setForeground(color);
                    label2.setText("Selected color R:"+color.getRed()+" G:"+color.getGreen()+" B:"+color.getBlue());
                    
                }
                
            });
            


            frame.setVisible(true);
    }
    
}
