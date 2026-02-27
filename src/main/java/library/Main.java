package library;

import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

  private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      try {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      } catch (Exception e) {
        LOGGER.log(Level.SEVERE, "Error starting application", e);
      }

      new LoginGUI().setVisible(true);
    });
  }
}