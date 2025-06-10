import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class presen2 extends JFrame {

    private JLabel etiquetaMensaje;
    private JCheckBoxMenuItem itemMostrar;

    public presen2() {
        setTitle("Ejemplo con JMenuBar y JCheckBoxMenuItem");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar ventana

        // Crear la barra de menú
        JMenuBar barraMenu = new JMenuBar();

        // Crear un menú
        JMenu menuVer = new JMenu("Ver");

        // Crear un ítem de tipo JCheckBoxMenuItem
        itemMostrar = new JCheckBoxMenuItem("Mostrar mensaje");
        itemMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiquetaMensaje.setVisible(itemMostrar.isSelected());
            }
        });

        // Agregar ítem al menú y menú a la barra
        menuVer.add(itemMostrar);
        barraMenu.add(menuVer);

        // Establecer la barra de menú en el JFrame
        setJMenuBar(barraMenu);

        // Crear y agregar etiqueta de mensaje
        etiquetaMensaje = new JLabel("¡Hola! Este es el mensaje.", SwingConstants.CENTER);
        etiquetaMensaje.setVisible(false); // Oculto por defecto
        add(etiquetaMensaje, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new presen1().setVisible(true);
        });
    }
}

    

