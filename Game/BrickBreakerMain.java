
import javax.swing.*;
public class BrickBreakerMain extends JFrame{
    public BrickBreakerMain()
    { 
        this.setTitle("Brick Breaker");
        this.setSize(700, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon(getClass().getResource("Ball.JPG"));
        this.setIconImage(icon.getImage());
        this.setResizable(false);

        BrickBreaker game=new BrickBreaker();
        this.add(game);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BrickBreakerMain frame = new BrickBreakerMain();
            frame.setVisible(true);
        });
        
    }
}