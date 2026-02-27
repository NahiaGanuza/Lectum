package library;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class LoginGUI extends JFrame {

  private final JTextField usernameField;
  private final JPasswordField passwordField;
  public LoginGUI() {
    setTitle("Library Login");
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setSize(500, 300);
    setLocationRelativeTo(null);

    Color bg = new Color(25, 11, 38);

    setLayout(new BorderLayout());

    JPanel headerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 20));
    headerPanel.setBackground(bg);

    JLabel logoLabel = createLogoLabel(70, 70);
    JLabel titleLabel = new JLabel("Library Management System");
    titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
    titleLabel.setForeground(Color.WHITE);

    headerPanel.add(logoLabel);
    headerPanel.add(titleLabel);

    add(headerPanel, BorderLayout.NORTH);

    JPanel centerPanel = new JPanel(new GridBagLayout());
    centerPanel.setBackground(bg);
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(10, 10, 10, 10);
    gbc.anchor = GridBagConstraints.WEST;

    JLabel userLabel = new JLabel("Username:");
    userLabel.setForeground(Color.WHITE);
    JLabel passLabel = new JLabel("Password:");
    passLabel.setForeground(Color.WHITE);

    usernameField = new JTextField(20);
    passwordField = new JPasswordField(20);

    JButton loginButton = new JButton("Login");
    loginButton.addActionListener(e -> {
      new LibraryGUI();
      dispose();
    });

    gbc.gridx = 0; gbc.gridy = 0;
    centerPanel.add(userLabel, gbc);
    gbc.gridx = 1;
    centerPanel.add(usernameField, gbc);

    gbc.gridx = 0; gbc.gridy = 1;
    centerPanel.add(passLabel, gbc);
    gbc.gridx = 1;
    centerPanel.add(passwordField, gbc);

    gbc.gridx = 1; gbc.gridy = 2;
    gbc.anchor = GridBagConstraints.CENTER;
    centerPanel.add(loginButton, gbc);

    add(centerPanel, BorderLayout.CENTER);

    setVisible(true);
  }

  private JLabel createLogoLabel(int w, int h) {
    URL url = getClass().getResource("/images/logo2.png");
    if (url == null) {
      throw new IllegalArgumentException("No se encontró el logo: /images/logo.png");
    }
    ImageIcon icon = new ImageIcon(url);
    Image scaled = icon.getImage().getScaledInstance(w, h, Image.SCALE_SMOOTH);
    return new JLabel(new ImageIcon(scaled));
  }
}