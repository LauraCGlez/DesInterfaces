package calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setLayout(new BorderLayout());

        // Campo de texto para mostrar el resultado
        JTextField textField = new JTextField();
        textField.setFont(new Font("Arial", Font.PLAIN, 32));
        textField.setHorizontalAlignment(JTextField.RIGHT);
        frame.add(textField, BorderLayout.NORTH);

        // Panel para los botones de la calculadora
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4));

        // Array de botones
        String[] buttonLabels = {
                "9", "8", "7", "+",
                "6", "5", "4", "-",
                "3", "2", "1", "*",
                "0", ".", "=", "/",
                " ", " ", " ", "CE"
        };

        // Crear y agregar botones al panel
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.PLAIN, 20));
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String text = textField.getText();
                    String buttonText = button.getText();

                    // Manejar acciones de los botones
                    if (buttonText.equals("=")) {
                        try {
                            // Evaluar la expresión y mostrar el resultado
                            String resultado = evaluarExpresion(text);
                            textField.setText(resultado);
                        } catch (Exception ex) {
                            textField.setText("Error");
                        }
                    } else if (buttonText.equals("CE")) {
                        // Borrar el contenido del campo de texto
                        textField.setText("");
                    } else {
                        // Agregar el texto del botón al campo de texto
                        textField.setText(text + buttonText);
                    }
                }
            });

            panel.add(button);
        }

        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    // Evaluar una expresión matemática
    private static String evaluarExpresion(String expresion) {
        try {
            javax.script.ScriptEngineManager manager = new javax.script.ScriptEngineManager();
            javax.script.ScriptEngine engine = manager.getEngineByName("JavaScript");
            Object result = engine.eval(expresion);
            return result.toString();
        } catch (Exception e) {
            return "Error";
        }
    }
}
