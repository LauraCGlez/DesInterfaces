package estiloVida;

import javax.swing.*;

import static estiloVida.VentanaPrincipal.mostrarVentanaSecundaria;

public class DatosPersonales {

    static void mostrarVentanaDatosPersonales(JFrame parentFrame) {
        String contenido = "Estos son tus datos personales:\n" +
                "Nombre: John Doe\n" +
                "Edad: 30\n" +
                "Dirección: Calle Principal\n" +
                "Correo Electrónico: john@example.com";
        mostrarVentanaSecundaria(parentFrame, "Datos Personales", contenido);
    }

}
