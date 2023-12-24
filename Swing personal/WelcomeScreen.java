import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;
import javax.swing.Timer;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.SwingConstants;

public class WelcomeScreen extends JFrame{
    WelcomeScreen()
    {
        //setVisible(true);
        displayWelcomeScreen();
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JLabel label=new JLabel("Welcome to Java Tutorial");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label);

    }
    public void displayWelcomeScreen() {
        final JWindow w=new JWindow(this);
        w.setSize(800,600);
        w.setLocationRelativeTo(null);
        w.setVisible(true);

        JPanel panel=new JPanel();
        w.add(panel);
        //String imagePath="C:\\Users\\Jitendra\\Java\\Swing personal\\image.png";
        JLabel label=new JLabel(new ImageIcon("R.png"));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(label);
        panel.setBackground(Color.white);
        panel.setBorder(BorderFactory.createLineBorder(Color.black));

        JProgressBar progress=new JProgressBar(0,100);
        progress.setForeground(Color.orange);
        w.add(BorderLayout.PAGE_END,progress);
        w.revalidate();
        timer=new Timer(100,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int x=progress.getValue();
                if(x==100)
                {
                    w.dispose();
                    WelcomeScreen.this.setVisible(true);
                    timer.stop();
                }
                else 
                {
                    progress.setValue(x+5);
                }
            }
        });
        timer.start();
    }
    Timer timer;
    public static void main(String[] args) {
        WelcomeScreen frame=new WelcomeScreen();
        
    }
}
