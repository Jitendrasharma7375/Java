import javax.swing.*;
import java.awt.*;
public class JTableEx {
    public static void main(String[] args) {
        String data[][]={
            {"101","Radhe"},
            {"102","Krishna"},
            {"103","Ram"},
        };
        String column[]={"ID","Name"};
        JFrame frame=new JFrame("Table");

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,300,300);

        JTable table=new JTable(data,column);


        frame.add(table);

      
    }
}
