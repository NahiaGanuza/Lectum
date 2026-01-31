package library;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class LibraryGUI extends JFrame {

  // Layout principal
  private CardLayout cardLayout;
  private JPanel mainPanel;

  // Login components
  private JTextField usernameField;
  private JPasswordField passwordField;

  // Library components
  private JTextField searchField;
  private DefaultListModel<String> bookListModel;

  // Fake data
  private List<String> books;

  public LibraryGUI() {
    setTitle("Library System");
    setSize(500, 400);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    cardLayout = new CardLayout();
    mainPanel = new JPanel(cardLayout);

    initBooks();
    initLoginPanel();
    initLibraryPanel();

    add(mainPanel);
    cardLayout.show(mainPanel, "login");
  }

  // ---------- LOGIN ----------
  private void initLoginPanel() {
    JPanel loginPanel = new JPanel(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(10, 10, 10, 10);

    JLabel titleLabel = new JLabel("Login");
    titleLabel.setFont(new Font("Arial", Font.BOLD, 20));

    usernameField = new JTextField(15);
    passwordField = new JPasswordField(15);

    JButton loginButton = new JButton("Login");

    loginButton.addActionListener(e -> handleLogin());

    gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 2;
    loginPanel.add(titleLabel, gbc);

    gbc.gridwidth = 1;
    gbc.gridy++;
    loginPanel.add(new JLabel("Username:"), gbc);

    gbc.gridx = 1;
    loginPanel.add(usernameField, gbc);

    gbc.gridx = 0; gbc.gridy++;
    loginPanel.add(new JLabel("Password:"), gbc);

    gbc.gridx = 1;
    loginPanel.add(passwordField, gbc);

    gbc.gridx = 0; gbc.gridy++; gbc.gridwidth = 2;
    loginPanel.add(loginButton, gbc);

    mainPanel.add(loginPanel, "login");
  }

  private void handleLogin() {
    String username = usernameField.getText();
    String password = new String(passwordField.getPassword());

    // Login simple (puedes conectarlo a User luego)
    if (!username.isEmpty() && !password.isEmpty()) {
      cardLayout.show(mainPanel, "library");
    } else {
      JOptionPane.showMessageDialog(this,
              "Please enter username and password",
              "Login error",
              JOptionPane.ERROR_MESSAGE);
    }
  }

  // ---------- LIBRARY ----------
  private void initLibraryPanel() {
    JPanel libraryPanel = new JPanel(new BorderLayout(10, 10));

    JLabel header = new JLabel("Library", SwingConstants.CENTER);
    header.setFont(new Font("Arial", Font.BOLD, 18));

    searchField = new JTextField();
    JButton searchButton = new JButton("Search");

    JPanel topPanel = new JPanel(new BorderLayout(5, 5));
    topPanel.add(new JLabel("Search by title:"), BorderLayout.WEST);
    topPanel.add(searchField, BorderLayout.CENTER);
    topPanel.add(searchButton, BorderLayout.EAST);

    bookListModel = new DefaultListModel<>();
    JList<String> bookList = new JList<>(bookListModel);
    JScrollPane scrollPane = new JScrollPane(bookList);

    searchButton.addActionListener(e -> searchBooks());

    libraryPanel.add(header, BorderLayout.NORTH);
    libraryPanel.add(topPanel, BorderLayout.SOUTH);
    libraryPanel.add(scrollPane, BorderLayout.CENTER);

    mainPanel.add(libraryPanel, "library");
    loadAllBooks();
  }

  private void initBooks() {
    books = new ArrayList<>();
    books.add("Clean Code");
    books.add("Effective Java");
    books.add("Design Patterns");
    books.add("Java Concurrency in Practice");
  }

  private void loadAllBooks() {
    bookListModel.clear();
    books.forEach(bookListModel::addElement);
  }

  private void searchBooks() {
    String query = searchField.getText().toLowerCase();
    bookListModel.clear();

    for (String book : books) {
      if (book.toLowerCase().contains(query)) {
        bookListModel.addElement(book);
      }
    }
  }
}

