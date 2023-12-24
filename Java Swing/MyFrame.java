
import java.awt.Color;
import java.awt.Container;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame implements ActionListener {
   private Container c = this.getContentPane();
   private JButton btn;
   private JButton btn1;
   private JButton btn2;

   MyFrame() {
      this.c.setLayout((LayoutManager)null);
      this.btn = new JButton("Yellow", (Icon)null);
      this.btn.setBounds(120, 95, 90, 30);
      this.c.add(this.btn);
      this.btn.setFocusable(false);
      this.btn.addActionListener(this);
      this.btn1 = new JButton("Red", (Icon)null);
      this.btn1.setBounds(200, 95, 90, 30);
      this.c.add(this.btn1);
      this.btn1.setFocusable(false);
      this.btn1.addActionListener(this);
      this.btn2 = new JButton("Green", (Icon)null);
      this.btn2.setBounds(280, 95, 90, 30);
      this.c.add(this.btn2);
      this.btn2.setFocusable(false);
      this.btn2.addActionListener(this);
   }

   public void actionPerformed(ActionEvent var1) {
      if (var1.getSource() == this.btn) {
         this.c.setBackground(Color.YELLOW);
      } else if (var1.getSource() == this.btn1) {
         this.c.setBackground(Color.RED);
      } else {
         this.c.setBackground(Color.GREEN);
      }

   }
}
