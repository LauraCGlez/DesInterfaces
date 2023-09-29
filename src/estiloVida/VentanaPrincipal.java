package estiloVida;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static estiloVida.DatosPersonales.mostrarVentanaDatosPersonales;
import static estiloVida.Formulario.mostrarVentanaFormulario;
import static estiloVida.InfoEmpresa.mostrarVentanaInformacionEmpresa;
import static estiloVida.MenuSemanal.mostrarVentanaMenuSemanal;

public class VentanaPrincipal {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        JFrame frame = new JFrame("Estilo de Vida App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 800);
        int windowWidth = frame.getWidth();
        int windowHeight = frame.getHeight();
        int x = (screenSize.width - windowWidth) / 2;
        int y = (screenSize.height - windowHeight) / 2;
        frame.setLocation(x, y);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));


        // Botones en la ejerciciosCLase.ventana principal
        JButton btnFormulario = new JButton("Formulario de Usuario");
        JButton btnDatosPersonales = new JButton("Datos Personales");
        JButton btnMenuSemanal = new JButton("Menú Semanal");
        JButton btnInformacionEmpresa = new JButton("Información de la Empresa");

        // Agregar acciones a los botones
        btnFormulario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarVentanaFormulario(frame);
            }
        });

        btnDatosPersonales.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarVentanaDatosPersonales(frame);
            }
        });

        btnMenuSemanal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarVentanaMenuSemanal(frame);
            }
        });

        btnInformacionEmpresa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarVentanaInformacionEmpresa(frame);
            }
        });

        // Agregar botones a la ejerciciosCLase.ventana principal
        frame.add(btnFormulario);
        frame.add(btnDatosPersonales);
        frame.add(btnMenuSemanal);
        frame.add(btnInformacionEmpresa);

        frame.setVisible(true);
    }

    static void mostrarVentanaSecundaria(JFrame parentFrame, String titulo, String contenido) {
        JDialog dialog = new JDialog(parentFrame, titulo, true);
        dialog.setSize(250, 150);
        dialog.setLayout(new BorderLayout());

        JButton btnCerrar = new JButton("Cerrar");
        btnCerrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
            }
        });

        JTextArea textArea = new JTextArea(contenido);
        textArea.setWrapStyleWord(true);
        textArea.setLineWrap(true);
        textArea.setOpaque(false);
        textArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(textArea);

        dialog.add(scrollPane, BorderLayout.CENTER);
        dialog.add(btnCerrar, BorderLayout.SOUTH);

        dialog.setVisible(true);
    }

}
