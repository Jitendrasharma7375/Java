import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.event.*;


public class JCombo extends JFrame implements ActionListener{
    private JLabel label;
    private JComboBox combo;
    private JButton button;

    //private String choose[]={"Select","Java","python","C#","C/C++"};
    public JCombo(String choose[])
    {
        //setVisible(true)
        this.setTitle("JComboBox Example.");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,500,300);
        this.setLayout(new FlowLayout(FlowLayout.LEFT,20,10));
        
        label=new JLabel("Choose your favorite programming language:");
        this.add(label);
        
        combo=new JComboBox<>(choose);
     
        // combo.addItem("Select");
        // combo.addItem("Java");
        // combo.addItem("Python");
        // combo.addItem("C#");
        // combo.addItem("C/C++");
        this.add(combo);

        button=new JButton("Submit");
        this.add(button);
        button.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        JOptionPane.showMessageDialog(this, "You Choose "+combo.getSelectedItem());
    }

}
