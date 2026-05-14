import javax.swing.*;
import java.awt.event.*;

public class User extends JFrame implements ActionListener {

    JLabel emailLabel;
    JLabel passwordLabel;

    JTextField emailField;
    JPasswordField passwordField;

    JButton loginButton;

    public User() {

        setTitle("Fashion Hub");
        setSize(350, 250);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        emailLabel = new JLabel("Email:");
        emailLabel.setBounds(40, 40, 100, 30);

        emailField = new JTextField();
        emailField.setBounds(120, 40, 150, 30);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(40, 90, 100, 30);

        passwordField = new JPasswordField();
        passwordField.setBounds(120, 90, 150, 30);

        loginButton = new JButton("Login");
        loginButton.setBounds(120, 150, 100, 30);
        loginButton.addActionListener(this);

        add(emailLabel);
        add(emailField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String email = emailField.getText();
        String password = new String(passwordField.getPassword());

        if(email.equals("admin@gmail.com") && password.equals("1234")) {

            JOptionPane.showMessageDialog(this,
                    "Login Successful");

            new ShoppingPage();
            dispose();
        }
        else {

            JOptionPane.showMessageDialog(this,
                    "Invalid Email or Password");
        }
    }

    public static void main(String[] args) {

        new User();
    }
}