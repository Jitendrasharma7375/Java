import javax.swing.*;
import java.awt.*;

public class GraphicsEx extends JFrame {
    GraphicsEx(){
        this.setTitle("Graphics Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,500,500);

        MyPanelEx panel=new MyPanelEx();
        panel.setBackground(Color.BLACK);
        this.add(panel);

       
        
    }
    public static void main(String[] args) {
        new GraphicsEx().setVisible(true);
    }
}
