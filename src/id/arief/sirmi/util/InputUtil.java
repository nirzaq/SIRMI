package id.arief.sirmi.util;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author arief-asus
 */
public class InputUtil {

    public static void setNumericOnly(final javax.swing.JTextField textField, final JLabel labelError) {
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != KeyEvent.VK_BACK_SPACE) {
                    evt.consume();
                    labelError.setText("Hanya Angka!");
                    labelError.setIcon(IconUtil.setIconError());
                    labelError.setVisible(true);
                } else {
                    labelError.setVisible(false);
                }
            }
        });

    }

    public static void setNumericAndCharOnly(final javax.swing.JTextField textField) {
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                if (!Character.isLetterOrDigit(evt.getKeyChar())) {
                    evt.consume();
                }
            }
        });
    }

    public static boolean validasiTahun(JTextField field, int tahunInput) {

        Calendar calendar = Calendar.getInstance();
        int tahunSekarang = calendar.get(Calendar.YEAR);
        int tahunMinimum = 2010;
        boolean valid;
        if (tahunInput <= tahunSekarang && tahunInput >= tahunMinimum) {
            return valid = true;
        } else {
            return valid = false;
        }
    }

    public static void toUpperCase(JTextField field) {
        String upper = field.getText();
        field.setText(upper.toUpperCase());
    }

    public static boolean isNopolValid(JTextField field) {
        boolean valid;
        String inputNopol = field.getText();
        String exp = "([A-Z]){1,2}\\ +\\d{1,4}\\ +([A-Z]){1,3}";
        Pattern p = Pattern.compile(exp);
        Matcher m = p.matcher(inputNopol);
        if (m.matches()) {
            return valid = true;
        } else {
            return valid = false;
        }
    }

    public static boolean isTelpValid(JTextField field) {
        boolean valid;
        String inputTelp = field.getText();
        String exp = "(^0[1-9]).{9,}";
        Pattern p = Pattern.compile(exp);
        Matcher m = p.matcher(inputTelp);
        if (m.matches()) {
            return valid = true;
        } else {
            return valid = false;
        }
    }

    public static void setValidNama(final javax.swing.JTextField textField, final JLabel labelError) {
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                if (!Character.isLetter(evt.getKeyChar()) && evt.getKeyChar() != KeyEvent.VK_BACK_SPACE && evt.getKeyChar() != '\'' && evt.getKeyChar() != KeyEvent.VK_SPACE) {
                    evt.consume();
                    labelError.setText("Harap Masukkan Input Nama yang Benar!");
                    labelError.setVisible(true);
                    labelError.setIcon(IconUtil.setIconError());
                } else {
                    labelError.setVisible(false);
                }
            }
        });

    }

    public static void setFormatTelepon(final javax.swing.JTextField textField, final JLabel labelError) {
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != KeyEvent.VK_BACK_SPACE && evt.getKeyChar() != KeyEvent.VK_TAB) {
                    evt.consume();
                    labelError.setText("Hanya Angka!");
                    labelError.setIcon(IconUtil.setIconError());
                    labelError.setVisible(true);
                } else if (!isTelpValid(textField)) {
                    evt.consume();
                    labelError.setText("Harap Masukkan Format Telepon Yang Benar!");
                    labelError.setIcon(IconUtil.setIconError());
                    labelError.setVisible(true);
                } else {
                    labelError.setVisible(false);
                }
            }
        });

    }

    public static void setNumericOnlyNoError(final javax.swing.JTextField textField) {
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                if (!Character.isDigit(evt.getKeyChar())) {
                    evt.consume();
                }
            }
        });

    }

}
