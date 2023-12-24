
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;



public class BrickBreaker extends JPanel implements ActionListener,KeyListener{
    private boolean play=false;
    private int score=0;
    private int totalBricks=28;
    private Timer timer;
    private int delay=8;
    private int ballposX=120;
    private int ballposY=350;
    private int ballXdir=-1;
    private int ballYdir=-2;
    private int playerX=350;
    private BrickMapGenerator map;
    public BrickBreaker()
    {
            this.addKeyListener(this);
            this.setFocusable(true);
            this.setFocusTraversalKeysEnabled(true);

            timer=new Timer(delay,this);
            timer.start();
            map=new BrickMapGenerator(4,7);;
           
    }
    public void paint(Graphics g)
    {
        //panel color
        g.setColor(Color.BLACK);
        g.fillRect(1, 1, 692, 592);

        //top border
        g.setColor(Color.YELLOW);
        g.fillRect(0, 0, 692, 3);

        //left border
        g.setColor(Color.YELLOW);
        g.fillRect(0, 3, 3, 592);

        //right border
        g.setColor(Color.YELLOW);
        g.fillRect(683, 3, 3, 592);


        //paddle
        g.setColor(Color.green);
        g.fillRect(playerX, 540, 100, 8);

        //bricks
        map.draw((Graphics2D) g);
        
        
        g.setColor(Color.red);
        g.fillOval(ballposX, ballposY, 20,20);

        //score
        g.setColor(Color.green);
        g.setFont(new Font("serif",Font.BOLD,25));
        g.drawString("Score :"+score, 550, 30);

        //gameover
        if(ballposY>=570)
        {
            play=false;
            ballXdir=0;
            ballYdir=0;
            g.setColor(Color.green);
            g.setFont(new Font("serif",Font.BOLD,30));
            g.drawString("Game Over, Score :"+score, 190, 300);

            g.setFont(new Font("serif",Font.BOLD,20));
            g.drawString("Press Enter to Restart", 230, 350);
        }

        if(totalBricks<=0)
        {
            play=false;
            ballXdir=0;
            ballYdir=0;
            g.setColor(Color.green);
            g.setFont(new Font("serif",Font.BOLD,30));
            g.drawString("Congratulations You Won, Score :"+score, 150, 300);

            g.setFont(new Font("serif",Font.BOLD,20));
            g.drawString("Press Enter to Restart", 230, 350);
        }

        repaint();
        //Toolkit.getDefaultToolkit().sync();
    }
    private void setRandomBallPosition() {
        Random random = new Random();

    int brickWidth = map.brickWidth;
    int brickHeight = map.brickHeight;

    int maxX = getWidth() - 20; // 20 is the width of the ball
    int maxY = getHeight() - 30; // 30 is the height of the ball

    // Calculate the maximum allowed positions to avoid starting between bricks
    int maxAllowedX = maxX - brickWidth * map.map[0].length;
    int maxAllowedY = maxY - brickHeight * map.map.length;

    // Set random position within the allowed bounds on both sides
    ballposX = random.nextInt(maxAllowedX);
    ballposY = random.nextInt(maxAllowedY);

    // Ensure the ball starts on both sides
    if (ballposX > maxX / 2) {
        ballposX = maxX / 2 - brickWidth * map.map[0].length;
    }
    }
    public void moveLeft()
    {
        play=true;
        playerX=playerX-50;
    }
    public void moveRight()
    {
        play=true;
        playerX=playerX+50;
    }


    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_LEFT || e.getKeyCode()==KeyEvent.VK_A)
        {
            if(playerX<=0)
                playerX=0;
            else
                moveLeft();
        }
        if(e.getKeyCode()==KeyEvent.VK_RIGHT || e.getKeyCode()==KeyEvent.VK_D)
        {
            if(playerX>=590)
                playerX=590;
            else 
                moveRight();
        }
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
        {
            if(!play)
            {
                play=true;
                setRandomBallPosition();
                //ballposX=120;
                //ballposY=350;
                ballXdir=-2;
                ballYdir=-3;
                playerX=350;
                score=0;
                totalBricks=28;
                map=new BrickMapGenerator(4,7);
                repaint();
            }
        }
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
        if(play)
        {
            if(ballposX<0)
            {
                ballXdir=-ballXdir;
            }
            if(ballposX>=670)
            {
                ballXdir=-ballXdir;
            }

            if(ballposY<0)
            {
                ballYdir=-ballYdir;
            }

            Rectangle ballRect=new Rectangle(ballposX, ballposY, 20, 30);
            Rectangle paddleRect=new Rectangle(playerX, 550, 100, 8);

            if(ballRect.intersects(paddleRect))
            {
                if (ballYdir > 0 && ballposY + 20 >= paddleRect.y) {
                    if (ballYdir < 15) {
                        ballYdir = -ballYdir - 1;
                    } else {
                        ballYdir = -ballYdir;
                    }
                }

            }

            A:for(int i=0;i<map.map.length;i++)
            {
                for(int j=0;j<map.map[0].length;j++)
                {
                    if(map.map[i][j]>0)
                    {
                        int width=map.brickWidth;
                        int height=map.brickHeight;
                        int brickXpos=j*width+80;
                        int brickYpos=i*height+50;
                        Rectangle brickRect=new Rectangle(brickXpos, brickYpos, width, height);
                        if(ballRect.intersects(brickRect))
                        {
                            map.setBrick(0, i, j);
                            totalBricks--;
                            score+=5;
                            if(ballposX+10<=brickXpos || ballposX+1>=brickXpos+width)
                            {
                                ballXdir=-ballXdir;
                            }
                            else
                            {
                                ballYdir=-ballYdir;
                            }
                            break A;
                        } 
                    }
                }
            }

            ballposX+=ballXdir;
            ballposY+=ballYdir;

        }
        repaint();
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }
    @Override
    public void keyReleased(KeyEvent e) {
    }
    
}
