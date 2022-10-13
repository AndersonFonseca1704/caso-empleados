package vista;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class PanelEntradaDatos extends JPanel {
    private JLabel lbTitulo;
    private JLabel lbNombre;
    private JLabel lbPrecio;
    private JLabel lbLogo;
    private ImageIcon iLogo;
    private static JTextField tfNombre;
    private static JTextField tfPrecio;

    public PanelEntradaDatos() {
        lbTitulo = new JLabel("VENTA DE CARROS", SwingConstants.CENTER);
        lbTitulo.setFont(new Font("Algerian", Font.BOLD, 20));
        lbTitulo.setForeground(Color.RED);
        lbTitulo.setBounds(10, 10, 480, 30);

        lbNombre = new JLabel("Nombre ");
        lbNombre.setFont(new Font("Algerian", Font.PLAIN, 18));
        lbNombre.setForeground(Color.RED);
        lbNombre.setBounds(200, 55, 480, 30);

        tfNombre = new JTextField();
        tfNombre.setFont(new Font("Arial", Font.PLAIN, 18));
        tfNombre.setForeground(Color.RED);
        tfNombre.setBounds(280, 55, 190, 30);

        lbPrecio = new JLabel("Precio ");
        lbPrecio.setFont(new Font("Algerian", Font.PLAIN, 18));
        lbPrecio.setForeground(Color.RED);
        lbPrecio.setBounds(200, 95, 480, 30);

        tfPrecio = new JTextField();
        tfPrecio.setFont(new Font("Arial", Font.PLAIN, 18));
        tfPrecio.setForeground(Color.RED);
        tfPrecio.setBounds(280, 95, 190, 30);

        iLogo = new ImageIcon("carro.png");

        lbLogo = new JLabel(iLogo);
        lbLogo.setOpaque(true);
        lbLogo.setBorder(BorderFactory.createRaisedBevelBorder());
        lbLogo.setBounds(0, 60, 192, 96);

        this.setLayout(null);
        this.setBackground(Color.decode("#0000FF"));
        this.setVisible(true);
        this.add(lbTitulo);
        this.add(lbNombre);
        this.add(tfNombre);
        this.add(lbPrecio);
        this.add(tfPrecio);
        this.add(lbLogo);
    }

    public static String getTfNombre() {
        return tfNombre.getText();
    }

    public static String getTfPrecio() {
        return tfPrecio.getText();
    }

    public static void borrarTf() {
        JOptionPane.showMessageDialog(null, "Los datos serán borrados...", "Venta de Carros",
                JOptionPane.WARNING_MESSAGE);
        tfNombre.setText("");
        tfPrecio.setText("");
        PanelResultados.taResultados.setText("");
    }
}
