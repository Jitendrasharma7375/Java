import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener
{
    private JButton addSong,removeSong;
    private LinkedList<String> playList;
    private DefaultListModel<String> model;
    private JList list;
    {
        playList=new LinkedList<>();
        model=new DefaultListModel<>();
        list=new JList<>(model);
        addSong=new JButton("Add Song");
        removeSong=new JButton("Remove Song");
        addSong.addActionListener(this);
        removeSong.addActionListener(this);
        JPanel panel=new JPanel();
        panel.add(addSong);
        panel.add(removeSong);
        add(panel);
        setSize(400,400);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==addSong)
        {
           
        }
        else if(e.getSource()==removeSong)
        {
            
        }
    }
}
public class MusicList {
    public static void main(String[] args) {
        new MyFrame();
    }
}
