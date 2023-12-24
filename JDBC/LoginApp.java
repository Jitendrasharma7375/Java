import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginApp {

    public static void main(String[] args) {
        // Create a Swing JFrame
        JFrame frame = new JFrame("Login Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Create a JPanel for the login form
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                // Create a gradient background
                GradientPaint gradient = new GradientPaint(0, 0, new Color(0, 115, 230), 0, getHeight(), new Color(0, 169, 157));
                Graphics2D g2d = (Graphics2D) g;
                g2d.setPaint(gradient);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };

        frame.add(panel);

        // Create login form components (e.g., labels, text fields, and buttons)
        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField(20);
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(20);
        JButton loginButton = new JButton("Login");

        // Add components to the panel
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);

        // Create an action for the login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add your login logic here
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                // Example: Validate the username and password
                if ("Jeetu".equals(username) && "1".equals(password)) {
                    JOptionPane.showMessageDialog(frame, "Login successful");
                } else {
                    JOptionPane.showMessageDialog(frame, "Login failed");
                }
            }
        });

        // Display the frame
        frame.setVisible(true);
    }
}
