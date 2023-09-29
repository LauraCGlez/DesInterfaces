package estiloVida;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario {
    static void mostrarVentanaFormulario(JFrame parentFrame) {

        JPanel panelFormulario = new JPanel(new GridLayout(3, 2));
        JTextField campoNombre = new JTextField();
        JPasswordField campoContrasena = new JPasswordField();
        JButton btnGuardar = new JButton("Guardar");

        panelFormulario.add(new JLabel("Nombre:"));
        panelFormulario.add(campoNombre);
        panelFormulario.add(new JLabel("Contraseña:"));
        panelFormulario.add(campoContrasena);
        panelFormulario.add(new JLabel("")); // Espacio en blanco para el diseño
        panelFormulario.add(btnGuardar);

        JDialog dialog = new JDialog(parentFrame, "Formulario de Usuario", true);
        dialog.setSize(250, 150);
        dialog.setLayout(new BorderLayout());

        btnGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = campoNombre.getText();
                char[] contraseña = campoContrasena.getPassword();
                String mensaje = "Nombre: " + nombre + "\nContraseña: " + new String(contraseña);
                JOptionPane.showMessageDialog(dialog, mensaje);
            }
        });

        JButton btnCerrar = new JButton("Cerrar");
        btnCerrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialog.dispose(); // Cerrar la ejerciciosCLase.ventana secundaria
            }
        });

        dialog.add(panelFormulario, BorderLayout.CENTER);
        dialog.add(btnCerrar, BorderLayout.SOUTH);

        dialog.setVisible(true);
    }

}
