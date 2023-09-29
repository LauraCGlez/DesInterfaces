package formulario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal {
    public static void main(String[] args) {
        // Crear una instancia de la ejerciciosCLase.ventana principal
        JFrame ventanaPrincipal = new JFrame("Ventana Principal");
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaPrincipal.setSize(400, 200);

        // Crear un botón en la ejerciciosCLase.ventana principal
        JButton botonAbrirFormulario = new JButton("Abrir Formulario Clientes");
        botonAbrirFormulario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Cierra la ejerciciosCLase.ventana principal
                ventanaPrincipal.dispose();

                // Crear una instancia de la subventana "FormularioClientes"
                JFrame subventana = new JFrame("Formulario Clientes");
                subventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                subventana.setSize(700, 600);

                //-------------------------------------------------------------------
                //PANEL SUPERIOR

                // Crear un botón para guardar los datos del cliente, ESTO ES OPCIONAL
                JPanel panelSuperior = new JPanel();
                panelSuperior.setBackground(new Color(173, 216, 230));

                ImageIcon iconoPerfil = new ImageIcon("formulario/icono.png");
                JLabel labelPerfil = new JLabel(iconoPerfil);

                JLabel labelClientes = new JLabel("Clientes");
                labelClientes.setBackground(new Color(0, 100, 200));

                JTextField campoBusqueda = new JTextField(20);

                JButton botonBuscar = new JButton("Buscar");
                botonBuscar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String textoBusqueda = campoBusqueda.getText();
                        //  TODO LOGICA PARA LA BUSQUEDA
                    }
                });

                panelSuperior.setLayout(new FlowLayout(FlowLayout.LEFT));
                panelSuperior.add(labelPerfil);
                panelSuperior.add(labelClientes);
                panelSuperior.add(campoBusqueda);
                panelSuperior.add(botonBuscar); // Opcional

                subventana.add(panelSuperior, BorderLayout.NORTH);

                //-------------------------------------------------------------
                //PANEL INFERIOR

                // 8 botones
                JPanel panelInferior = new JPanel();
                panelInferior.setLayout(new GridLayout(1, 8));

                for (int i = 0; i < 8; i++) {
                    JButton botonCuadrado = new JButton("Botón " + (i + 1));
                    panelInferior.add(botonCuadrado);
                }

                subventana.add(panelSuperior, BorderLayout.NORTH);
                subventana.add(panelInferior, BorderLayout.SOUTH);


                //-----------------------------------------------------------
                //FORMULARIO CLIENTE

                JTextField campoIDCliente = new JTextField(30);
                JTextField campoNombre = new JTextField(30);
                JTextField campoApellidos = new JTextField(30);
                JTextField campoDireccion = new JTextField(30);
                JTextField campoEmail = new JTextField(30);
                JTextField campoTelefono = new JTextField(30);

                JButton botonGuardar = new JButton("Guardar");

                //-------------------------------------------------------------
                //CENTRAR EL CONTENIDO

                JPanel panelFormulario = new JPanel(new GridBagLayout());
                GridBagConstraints c = new GridBagConstraints();
                c.insets = new Insets(5, 5, 5, 5);

                c.gridx = 0;
                c.gridy = 0;
                panelFormulario.add(new JLabel("CLIENTE_ID"), c);
                c.gridx = 1;
                panelFormulario.add(campoIDCliente, c);

                c.gridx = 0;
                c.gridy = 1;
                panelFormulario.add(new JLabel("NOMBRE"), c);
                c.gridx = 1;
                panelFormulario.add(campoNombre, c);

                c.gridx = 0;
                c.gridy = 2;
                panelFormulario.add(new JLabel("APELLIDOS"), c);
                c.gridx = 1;
                panelFormulario.add(campoApellidos, c);

                c.gridx = 0;
                c.gridy = 3;
                panelFormulario.add(new JLabel("DIRECCION"), c);
                c.gridx = 1;
                panelFormulario.add(campoDireccion, c);

                c.gridx = 0;
                c.gridy = 4;
                panelFormulario.add(new JLabel("EMAIL"), c);
                c.gridx = 1;
                panelFormulario.add(campoEmail, c);

                c.gridx = 0;
                c.gridy = 5;
                panelFormulario.add(new JLabel("TELEFONO"), c);
                c.gridx = 1;
                panelFormulario.add(campoTelefono, c);

                c.gridx = 0;
                c.gridy = 6;
                c.gridwidth = 2;
                c.fill = GridBagConstraints.HORIZONTAL;
                panelFormulario.add(botonGuardar);

                // Agregar el panel al contenido de la subventana
                subventana.add(panelFormulario);

                // Hacer visible la subventana
                subventana.setVisible(true);
            }
        });

        // Agregar el botón a la ejerciciosCLase.ventana principal
        ventanaPrincipal.add(botonAbrirFormulario);

        // Hacer visible la ejerciciosCLase.ventana principal
        ventanaPrincipal.setVisible(true);
    }
}
