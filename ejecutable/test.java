package ejecutable;

import controlador.controlador;
import modelo.Vendedor;
import vista.VentanaPrincipal;

public class test {
    public static void main(String[] args) {
        Vendedor miVendedor = new Vendedor();
        VentanaPrincipal miVentana = new VentanaPrincipal();
        new controlador(miVentana, miVendedor);
    }
}