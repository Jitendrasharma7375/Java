import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMenuDemo{
    public static void main(String[] args) {
        JFrame frame=new JFrame("JMenu Demo");
        frame.setBounds(100, 100, 500, 500);
        frame.setLayout(null);
        JTextArea area=new JTextArea();
        area.setBounds(100, 100, 500, 492);
        area.setLineWrap(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenu fileMenu=new JMenu("File");
        fileMenu.add(new JMenuItem("Open"));
        fileMenu.add(new JMenuItem("Save", 0));
        fileMenu.add(new JMenuItem("Save as", 0));
         
        JMenu fileMenu1=new JMenu("Edit");
        fileMenu1.add(new JMenuItem("Undo", 0));
        fileMenu1.add(new JMenuItem("Redo", 0));

        JMenu fileMenu2=new JMenu("View");
        fileMenu2.add(new JMenuItem("Status bar"));
        fileMenu2.add(new JMenuItem("Word wrap", 0));
        fileMenu2.add(new JMenuItem("Zoom", 0));


        JMenuBar bar=new JMenuBar();
        bar.add(fileMenu);
        bar.add(fileMenu1);
        bar.add(fileMenu2);

        frame.setJMenuBar(bar);
        frame.add(area);
        
        frame.setVisible(true);
    }
}
