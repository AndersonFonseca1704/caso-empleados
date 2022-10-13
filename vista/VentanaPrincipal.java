package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {
    public PanelEntradaDatos miPanelEntrada;
    public PanelOperciones miPanelProceso;
    public PanelResultados miPanelSalida;

    public VentanaPrincipal() {
        miPanelEntrada = new PanelEntradaDatos();
        miPanelEntrada.setBounds(10, 10, 480, 180);

        miPanelProceso = new PanelOperciones();
        miPanelProceso.setBounds(10, 200, 480, 80);

        miPanelSalida = new PanelResultados();
        miPanelSalida.setBounds(10, 290, 480, 110);

        this.setTitle("Venta de Carros");
        this.setSize(508, 442);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);
        this.add(miPanelEntrada);
        this.add(miPanelProceso);
        this.add(miPanelSalida);
    }
}
