import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;

public class ChatServer extends JFrame{
    static ServerSocket ss;
    static Socket s;
    static DataInputStream dis;
    static DataOutputStream dout;
    public ChatServer()
    {
        initComponents();
    }
    @SuppressWarnings("Unchecked")
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run()
            {
                new ChatServer().setVisible(true);
            }
        });
        String msgin="";
        try {
            ss=new ServerSocket(1201);
            s=ss.accept();
            dis=new DataInputStream(s.getInputStream());
            dout=new DataOutputStream(s.getOutputStream());
            while(!msgin.equals("exit"))
            {
                msgin=dis.readUTF();
                msgArea.setText(msgArea.getText()+"\n Client :"+msgin);
            }
        } catch (IOException e) {
            //e.printStackTrace();
        }
        
    }
}
