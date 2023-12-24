import java.awt.Color;
import javax.swing.*;

public class SnakeMain {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(10, 10, 905, 700);
        frame.setResizable(false);
        ImageIcon icon = new ImageIcon(("snake.JPG"));
        frame.setIconImage(icon.getImage()); 
        
        SnakeGamePanel panel = new SnakeGamePanel();
        panel.setBackground(Color.DARK_GRAY);
        frame.add(panel);
        frame.setVisible(true);
    }
}
