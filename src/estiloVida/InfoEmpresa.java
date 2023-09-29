package estiloVida;

import javax.swing.*;

import static estiloVida.VentanaPrincipal.mostrarVentanaSecundaria;

public class InfoEmpresa {

    static void mostrarVentanaInformacionEmpresa(JFrame parentFrame) {
        String contenido = "Información de la Empresa:\n" +
                "Nombre: Mi Empresa\n" +
                "Dirección: Calle Empresa, Ciudad\n" +
                "Teléfono: 123-456-7890\n" +
                "Sitio Web: www.miempresa.com";
        mostrarVentanaSecundaria(parentFrame, "Información de la Empresa", contenido);
    }

}
