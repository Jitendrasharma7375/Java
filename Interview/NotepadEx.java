import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class NotepadEx  implements ActionListener{

    public NotepadEx(){
        JFrame frame=new JFrame("Notepad");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,400,400);

        Container c=frame.getContentPane();
        c.setLayout(null);

        JMenuBar jMenuBar=new JMenuBar();
        
        JMenu file=new JMenu("File");
       
        JMenu about=new JMenu("About");

        JMenuItem newFile=new JMenuItem("New");
        JMenuItem openFile=new JMenuItem("Open");

       
        file.add(newFile);
        file.add(openFile);

       

        jMenuBar.add(file);

        JMenu edit=new JMenu("Edit");

        JMenuItem copy=new JMenuItem("Copy");
        JMenuItem paste=new JMenuItem("Paste");


        edit.add(copy);
        edit.add(paste);
        
        jMenuBar.add(edit);

        frame.setJMenuBar(jMenuBar);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    public static void main(String[] args) {
        new NotepadEx();
    }

}

