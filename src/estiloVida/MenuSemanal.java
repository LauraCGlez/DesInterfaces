package estiloVida;

import javax.swing.*;

import static estiloVida.VentanaPrincipal.mostrarVentanaSecundaria;
public class MenuSemanal {
    static void mostrarVentanaMenuSemanal(JFrame parentFrame) {
        String contenido = "Menú Semanal:\n" +
                "Lunes: Pollo a la parrilla\n" +
                "Martes: Sopa de lentejas\n" +
                "Miércoles: Ensalada César\n" +
                "Jueves: Tacos de carne asada\n" +
                "Viernes: Pizza\n" +
                "Sábado: Sushi\n" +
                "Domingo: Pasta con pesto";
        mostrarVentanaSecundaria(parentFrame, "Menú Semanal", contenido);
    }

}
