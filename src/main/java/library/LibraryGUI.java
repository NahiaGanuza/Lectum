package library;

import javax.swing.*;
import java.awt.*;

public class LibraryGUI extends JFrame {
  private Library library;
  private static String fontArial = "Arial";

  public LibraryGUI() {
    setTitle("Library - Books");
    setSize(700, 500);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);

    // Panel que contendrá los libros en vertical
    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
    mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

    for (Book b : library.getBooks()) {

      String cover = getImagePathFromTitle(b.getTitle());

      mainPanel.add(createBookPanel(b, cover));
      mainPanel.add(Box.createVerticalStrut(12));
    }

    // Scroll vertical
    JScrollPane scrollPane = new JScrollPane(mainPanel);
    scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
    scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

    add(scrollPane);
    setVisible(true);
  }

  private JPanel createBookPanel(Book book, String imagePath) {
    JPanel panel = new JPanel(new BorderLayout(15, 0));
    panel.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(220, 220, 220)),
            BorderFactory.createEmptyBorder(10, 10, 10, 10)
    ));
    panel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 190));

    // Imagen
    JLabel imageLabel = new JLabel();
    java.net.URL url = getClass().getResource(imagePath);
    if (url == null) throw new IllegalArgumentException("No se encontró: " + imagePath);
    ImageIcon icon = new ImageIcon(url);
    Image scaled = icon.getImage().getScaledInstance(120, 160, Image.SCALE_SMOOTH);
    imageLabel.setIcon(new ImageIcon(scaled));

    // Info
    JPanel info = new JPanel();
    info.setLayout(new BoxLayout(info, BoxLayout.Y_AXIS));
    info.setOpaque(false);

    JLabel titleLabel = new JLabel(book.getTitle());
    titleLabel.setFont(new Font(fontArial, Font.BOLD, 18));
    JLabel authorLabel = new JLabel(book.getAuthor().getFullName());
    authorLabel.setFont(new Font(fontArial, Font.PLAIN, 15));

    JLabel isbnLabel = new JLabel("ISBN: " + book.getIsbn());
    JLabel statusLabel = new JLabel(book.getAvailable() ? "Disponible" : "Reservado");
    statusLabel.setFont(new Font(fontArial, Font.BOLD, 12));

    info.add(titleLabel);
    info.add(authorLabel);
    info.add(Box.createVerticalStrut(6));
    info.add(isbnLabel);
    info.add(Box.createVerticalStrut(10));
    info.add(statusLabel);

    // Botón reservar
    JButton reserveButton = new JButton(book.getAvailable() ? "Reservar" : "No disponible");
    reserveButton.setEnabled(book.getAvailable());

    reserveButton.addActionListener(e -> {
      // Reservar
      book.setAvailable(false);

      // Actualizar UI
      statusLabel.setText("Reservado");
      reserveButton.setText("No disponible");
      reserveButton.setEnabled(false);

      JOptionPane.showMessageDialog(this,
              "Has reservado: " + book.getTitle(),
              "Reserva confirmada",
              JOptionPane.INFORMATION_MESSAGE);
    });

    JPanel rightPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    rightPanel.setOpaque(false);
    rightPanel.add(reserveButton);

    panel.add(imageLabel, BorderLayout.WEST);
    panel.add(info, BorderLayout.CENTER);
    panel.add(rightPanel, BorderLayout.EAST);

    return panel;
  }

  private String getImagePathFromTitle(String title) {
    return "/images/" +
            title.toLowerCase()
                    .replace(" ", "_")
                    .replace("'", "") +
            ".jpg";
  }
}

