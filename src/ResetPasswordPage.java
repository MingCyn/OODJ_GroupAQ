
import javax.swing.*;
import java.awt.*;

public class ResetPasswordPage extends JFrame {
    public ResetPasswordPage(String targetUsername) {
        setTitle("APU Automotive Service Centre - Reset Password");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(new BorderLayout());

        ResetPasswordPanel resetPanel = new ResetPasswordPanel(this, targetUsername);
        add(resetPanel, BorderLayout.CENTER);

        setVisible(true);
    }
}

class ResetPasswordPanel extends JPanel {
    private static final Color BG_COLOR = new Color(230, 242, 250);
    
    private JPasswordField passwordField;
    private JPasswordField confirmPasswordField;
    public ResetPasswordPanel(JFrame parentFrame, String targetUsername) {
        setLayout(null);
        setBackground(BG_COLOR);

        // Title
        JLabel titleLabel = new JLabel("RESET PASSWORD", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 28));
        titleLabel.setBounds(0, 30, 600, 35);
        add(titleLabel);

        JLabel passwordLabel = new JLabel("NEW PASSWORD:", SwingConstants.RIGHT);
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        passwordLabel.setBounds(0, 110, 260, 40);
        add(passwordLabel);
        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Arial", Font.PLAIN, 20));
        passwordField.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(Color.BLACK, 1),
            BorderFactory.createEmptyBorder(5, 5, 5, 5)
        ));
        passwordField.setBounds(270, 110, 280, 40);
        add(passwordField);

        JLabel confirmPasswordLabel = new JLabel("CONFIRM PASSWORD:", SwingConstants.RIGHT);
        confirmPasswordLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        confirmPasswordLabel.setBounds(0, 170, 260, 40);
        add(confirmPasswordLabel);
        confirmPasswordField = new JPasswordField();
        confirmPasswordField.setFont(new Font("Arial", Font.PLAIN, 20));
        confirmPasswordField.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(Color.BLACK, 1),
            BorderFactory.createEmptyBorder(5, 5, 5, 5)
        ));
        confirmPasswordField.setBounds(270, 170, 280, 40);
        add(confirmPasswordField);

        BlueRoundedButton confirmButton = new BlueRoundedButton("CONFIRM");
        confirmButton.setBounds(65, 260, 210, 50);
        confirmButton.addActionListener(e -> {
            String pass = new String(passwordField.getPassword());
            String confirmPass = new String(confirmPasswordField.getPassword());  
            if (pass.isEmpty() || confirmPass.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill in all fields.");
                return;
            }
            if (!pass.equals(confirmPass)) {
                JOptionPane.showMessageDialog(this, "Incorrect Password Input", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            try {
                java.io.File file = new java.io.File("data/account.txt");
                java.util.List<String> lines = new java.util.ArrayList<>();
                if (file.exists()) {
                    java.util.Scanner scanner = new java.util.Scanner(file);
                    while (scanner.hasNextLine()) {
                        String line = scanner.nextLine();
                        String[] parts = line.split(",");
                        if (parts.length >= 3 && parts[1].trim().equals(targetUsername)) {
                            parts[2] = " " + pass; // Update password
                            line = String.join(",", parts);
                        }
                        lines.add(line);
                    }
                    scanner.close();
                    java.io.FileWriter writer = new java.io.FileWriter(file, false); // false to overwrite file
                    for (String l : lines) {
                        writer.write(l + "\n");
                    }
                    writer.close();
                }

                JOptionPane.showMessageDialog(this, "Reset Password Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                parentFrame.dispose();
                new LoginPage();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error updating password", "Error", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        });
        add(confirmButton);

        GreyRoundedButton cancelButton = new GreyRoundedButton("CANCEL");
        cancelButton.setBounds(315, 260, 210, 50);
        cancelButton.addActionListener(e -> {
            parentFrame.dispose();
            new LoginPage();
        });
        add(cancelButton);
    }
}
