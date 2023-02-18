package metodo;

import javax.swing.*;
import java.awt.*;

public class Metodo {
    public static void incrustarImagen(JLabel componete, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(componete.getWidth(), componete.getHeight(), Image.SCALE_DEFAULT));
        componete.setIcon(icon);
    }
    public static void incrustarImagen(JButton componete, String root) {
        ImageIcon imagen = new ImageIcon(root);
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(componete.getWidth(), componete.getHeight(), Image.SCALE_DEFAULT));
        componete.setIcon(icono);
    }
}
