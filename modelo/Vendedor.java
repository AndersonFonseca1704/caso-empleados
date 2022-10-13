package modelo;

import vista.PanelResultados;
import java.util.ArrayList;

public class Vendedor {
        private static final int SALARIO_MINIMO = 1000000;
        private static final int COMISION_VENTA = 100000;
        private String nombre;
        private ArrayList<Carro> carrosVendidos;

        public Vendedor(String nombre, ArrayList<Carro> carrosVendidos) {
                this.nombre = nombre;
                this.carrosVendidos = carrosVendidos;
        }

        public Vendedor() {
                this.nombre = "";
                this.carrosVendidos = null;
        }

        public String getNombre() {
                return nombre;
        }

        public ArrayList<Carro> getCarros() {
                return this.carrosVendidos;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public void setCarros(ArrayList<Carro> carrosVendidos) {
                this.carrosVendidos = carrosVendidos;
        }

        public static void calcularSalario(ArrayList<Carro> carrosVendidos) {
                int numeroVentas = carrosVendidos.size();
                double porcentajeVenta = 0;
                double sumatoria = 0;

                for (int i = 0; i < numeroVentas; i++) {
                        porcentajeVenta = carrosVendidos.get(i).getPrecio() * 0.02;
                        sumatoria += porcentajeVenta;
                }
                double salario = SALARIO_MINIMO + (numeroVentas * COMISION_VENTA) + sumatoria;
                PanelResultados.mostrarResultados("El salario es de: " + salario);
        }

        public String toString() {
                return "\nDATOS DEL CARRO: \nNombre: " + nombre + "\nVentas: " + carrosVendidos;
        }
}