package ejerciciosCLase;

import javax.swing.*;
import java.awt.*;

public class ventana {
    public static void main(String[] args) {
        // Crea una ejerciciosCLase.ventana Swing
        JFrame frame = new JFrame("Mi Aplicación Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300); // Establece el tamaño de la ejerciciosCLase.ventana

        // Crea un componente Swing, por ejemplo, un botón
        JButton button = new JButton("Haz clic");

        // Agrega el botón a la ejerciciosCLase.ventana
        frame.add(button);

        // Haz que la ejerciciosCLase.ventana sea visible
        frame.setVisible(true);


        JFrame ventana = new JFrame("BorderLayout Manager");

        Container contenedor = ventana.getContentPane();

        contenedor.add(new JButton("BorderLayout.CENTER"), BorderLayout.CENTER);
        contenedor.add(new JButton("BorderLayout.NORTH"), BorderLayout.NORTH);
        contenedor.add(new JButton("BorderLayout.SOUTH"), BorderLayout.SOUTH);
        contenedor.add(new JButton("BorderLayout.EAST"), BorderLayout.EAST);

        contenedor.add(new JButton("BorderLayout.WEST"), BorderLayout.WEST);
        ventana.setSize(500, 500);

        ventana.setVisible(true);

    }
}
