import javax.swing.*;
import java.awt.*;

public class ggshop {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();

        JLabel label = new JLabel("Welcome to Shop");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setForeground(new Color(0xc13e3e));
        label.setFont(new Font("MV Boli",Font.BOLD,40));
        myFrame.add(label, BorderLayout.NORTH);

//SIGN IN AND LOGIN NA BUTTON
        JButton button = new JButton("SIGN IN");
        //button.setOpaque(false);
        button.setFocusPainted(false);
        button.setFont(new Font("MV Boli", Font.BOLD, 14));
        button.setBackground(new Color(0x4f56bc));
        button.setForeground(Color.WHITE);
        button.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        JButton loginButton = new JButton("LOG IN");
        loginButton.setFocusPainted(false);
        loginButton.setFont(new Font("MV Boli", Font.BOLD, 14));
        loginButton.setBackground(new Color(0x4f56bc));
        loginButton.setForeground(Color.WHITE);
        loginButton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        JPanel bottomPanel = new JPanel();
        bottomPanel.setOpaque(false);
        bottomPanel.add(button);
        bottomPanel.add(loginButton);
//FUNCTION SA SIGN IN
        button.addActionListener(a -> {
            JPanel signupPanel = new JPanel(new GridBagLayout());
            signupPanel.setOpaque(true);
            signupPanel.setPreferredSize(new Dimension(450, 400));

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(10, 10, 10, 10);
            gbc.fill = GridBagConstraints.HORIZONTAL;

            JLabel title = new JLabel("Sign Up");
            title.setFont(new Font("MV Boli", Font.BOLD, 30));
            title.setForeground(new Color(0x143069));

            JTextField username = new JTextField(15);
            JPasswordField password = new JPasswordField(15);
            JPasswordField confirmPassword = new JPasswordField(15);
            JButton submit = new JButton("Create Account");
            JButton close = new JButton("GO BACK");

            close.addActionListener(x -> {
                myFrame.getContentPane().removeAll();

                myFrame.add(label, BorderLayout.NORTH);
                myFrame.add(bottomPanel, BorderLayout.SOUTH);

                myFrame.revalidate();
                myFrame.repaint();
            });

            submit.setBackground(new Color(0x4f56bc));
            submit.setForeground(Color.WHITE);

            gbc.gridx = 0;
            gbc.gridy = 0;
            signupPanel.add(title, gbc);

            gbc.gridy++;
            signupPanel.add(new JLabel("Username:"), gbc);
            gbc.gridy++;
            signupPanel.add(username, gbc);

            gbc.gridy++;
            signupPanel.add(new JLabel("Password:"), gbc);
            gbc.gridy++;
            signupPanel.add(password, gbc);

            gbc.gridy++;
            signupPanel.add(new JLabel("Confirm Password:"), gbc);
            gbc.gridy++;
            signupPanel.add(confirmPassword, gbc);

            gbc.gridy++;
            signupPanel.add(submit, gbc);

            gbc.gridy++;
            signupPanel.add(close, gbc);

            JPanel wrapper = new JPanel(new GridBagLayout());
            wrapper.setOpaque(false);
            wrapper.add(signupPanel);

            myFrame.getContentPane().removeAll();
            myFrame.add(wrapper, BorderLayout.CENTER);

            myFrame.revalidate();
            myFrame.repaint();
        });
//FUNCTION SA LOG IN       
        loginButton.addActionListener(b -> {
            JPanel signupPanel = new JPanel(new GridBagLayout());
            signupPanel.setOpaque(true);
            signupPanel.setPreferredSize(new Dimension(450, 400));

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(10, 10, 10, 10);
            gbc.fill = GridBagConstraints.HORIZONTAL;

            JLabel title = new JLabel("LOG IN");
            title.setFont(new Font("MV Boli", Font.BOLD, 30));
            title.setForeground(new Color(0x143069));

            JTextField username = new JTextField(15);
            JPasswordField password = new JPasswordField(15);
            JButton submit = new JButton("LOG IN");
            JButton close = new JButton("GO BACK");

            close.addActionListener(x -> {
                myFrame.getContentPane().removeAll();

                myFrame.add(label, BorderLayout.NORTH);
                myFrame.add(bottomPanel, BorderLayout.SOUTH);

                myFrame.revalidate();
                myFrame.repaint();
            });

            submit.setBackground(new Color(0x4f56bc));
            submit.setForeground(Color.WHITE);

            gbc.gridx = 0;
            gbc.gridy = 0;
            signupPanel.add(title, gbc);

            gbc.gridy++;
            signupPanel.add(new JLabel("Username:"), gbc);
            gbc.gridy++;
            signupPanel.add(username, gbc);

            gbc.gridy++;
            signupPanel.add(new JLabel("Password:"), gbc);
            gbc.gridy++;
            signupPanel.add(password, gbc);

            gbc.gridy++;
            signupPanel.add(submit, gbc);

            gbc.gridy++;
            signupPanel.add(close, gbc);

            JPanel wrapper = new JPanel(new GridBagLayout());
            wrapper.setOpaque(false);
            wrapper.add(signupPanel);

            myFrame.getContentPane().removeAll();
            myFrame.add(wrapper, BorderLayout.CENTER);

            myFrame.revalidate();
            myFrame.repaint();
        });

        myFrame.add(bottomPanel, BorderLayout.SOUTH);

        
    }
}