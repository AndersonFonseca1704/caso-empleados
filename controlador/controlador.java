package controlador;

import modelo.Carro;
import modelo.Vendedor;
import vista.PanelEntradaDatos;
import vista.PanelResultados;
import vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class controlador implements ActionListener {
    private VentanaPrincipal miVentanaPrincipal;
    private Carro miCarro;
    private ArrayList<Carro> carrosVendidos = new ArrayList<>();

    public controlador(VentanaPrincipal miVentanaPrincipal, Vendedor modelo) {
        this.miVentanaPrincipal = miVentanaPrincipal;
        this.miVentanaPrincipal.miPanelProceso.btnAgregar.addActionListener(this);
        this.miVentanaPrincipal.miPanelProceso.btnCalcular.addActionListener(this);
        this.miVentanaPrincipal.miPanelProceso.btnBorrar.addActionListener(this);
        this.miVentanaPrincipal.miPanelProceso.btnSalir.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();

        if (comando.equals("agregarCarro")) {
            String nombre = PanelEntradaDatos.getTfNombre();
            int precio = Integer.parseInt(PanelEntradaDatos.getTfPrecio());
            miCarro = new Carro(nombre, precio);
            PanelResultados.mostrarResultados("Se ha registrado una nueva venta!\n");
            carrosVendidos.add(miCarro);
        } else if (comando.equals("calcularSalario")) {
            Vendedor.calcularSalario(carrosVendidos);

        } else if (comando.equals("borrarTexto")) {
            carrosVendidos.clear();
            vista.PanelEntradaDatos.borrarTf();
            this.miVentanaPrincipal.miPanelSalida.borrarTa();
        } else if (comando.equals("cerrarVentana")) {
            JOptionPane.showMessageDialog(null, "El programa se cerrará...", "Venta de Carros",
                    JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }
    }
}
