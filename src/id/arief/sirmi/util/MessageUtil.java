package id.arief.sirmi.util;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author arief-asus
 */
public class MessageUtil {
    public static void showInfoMessage(String message, Component component) {
        JOptionPane.showMessageDialog(component, message, "Informasi", JOptionPane.INFORMATION_MESSAGE);
    }
    public static void showWarningMessage(String message, Component component) {
        JOptionPane.showMessageDialog(component, message, "Peringatan", JOptionPane.WARNING_MESSAGE);
    }
    public static void showErrorMessage(String message, Component component) {
        JOptionPane.showMessageDialog(component, message, "Error", JOptionPane.ERROR_MESSAGE);
    }
     public static int showConfirmMessage(String message, Component component) {
        int confirm = JOptionPane.showConfirmDialog(component, message, "Konfirmasi", JOptionPane.YES_NO_OPTION);   
        return confirm;
    }
}
