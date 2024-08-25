import javax.swing.*;
import java.awt.*;
public class AnimationEx extends JFrame {
    
    AnimationEx(){
        this.setTitle("Graphics Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,500,500);

        MyAnimationEx panel=new MyAnimationEx();
        panel.setBackground(Color.BLACK);
        this.add(panel);

    }
    public static void main(String[] args) {
        new AnimationEx().setVisible(true);
    }
}
