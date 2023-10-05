package optativa;

import javax.swing.*;
import java.awt.event.MouseEvent;

public class MouseListener {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MouseListener Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Haz clic en este recuadro");
        panel.add(label);

        label.addMouseListener(new CustomMouseListener());

        frame.add(panel);
        frame.setVisible(true);
    }
}

class CustomMouseListener implements java.awt.event.MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse clicado en el componente.");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse presionado en el componente.");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse liberado en el componente.");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse entró en el componente.");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse salió del componente.");
    }
}
