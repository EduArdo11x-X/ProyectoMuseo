/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import static Interfaces.Admi_registroT.direccionBD;
import Interfaces.Info_boleto;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

public class Boleto {
       private static HashMap<String, Integer> entradasPorCuenta = new HashMap<>();

    private String codigo;
    private double precio;
    private Date fecha_compra;
    private String existencia;
    private String num_cuenta;
    

    private static final double PRECIO_FIJO = 2.0;
    private static final int MAX_ENTRADAS_POR_DIA = 50;
    private static int entradasVendidasHoy = 0;

    // Registro de entradas compradas por cada número de cuenta
//    private static Map<String, Integer> entradasPorCuenta = new HashMap<>();

    public Boleto() {
    }

    public Boleto(String codigo, double precio, Date fecha_compra, String existencia, String num_cuenta) {
        this.codigo = codigo;
        this.precio = precio;
        this.fecha_compra = fecha_compra;
        this.existencia = existencia;
        this.num_cuenta = num_cuenta;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(Date fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public String getExistencia() {
        return existencia;
    }

    public void setExistencia(String existencia) {
        this.existencia = existencia;
    }

    public String getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(String num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    @Override
    public String toString() {
        return "Boleto{" + "codigo=" + codigo + ", precio=" + precio + ", fecha_compra=" + fecha_compra + ", existencia=" + existencia + ", num_cuenta=" + num_cuenta + '}';
    }

    public static Boleto crearBoleto(int numEntradas, String numCuenta) {
        int entradasDisponibles = MAX_ENTRADAS_POR_DIA - entradasVendidasHoy;

        if (entradasDisponibles > 0) {
            if (numEntradas <= entradasDisponibles) {
                String codigo = UUID.randomUUID().toString();
                double precioTotal = PRECIO_FIJO * numEntradas;
                Date fechaCompra = new Date();
                String existencia = "vendido";

                Boleto boleto = new Boleto(codigo, precioTotal, fechaCompra, existencia, numCuenta);

                // Actualizar el registro de entradas por cuenta
                int entradasCompradasPorCuenta = entradasPorCuenta.getOrDefault(numCuenta, 0);
                entradasPorCuenta.put(numCuenta, entradasCompradasPorCuenta + numEntradas);

                // Guardar el registro en la base de datos utilizando DB4o
                ObjectContainer base = null;
                try {
                    base = Db4o.openFile(direccionBD);
                    base.store(boleto); // Almacena el objeto en la base de datos
                } finally {
                    if (base != null) {
                        base.close(); // Cerrar la conexión con la base de datos al terminar.
                    }
                }

                entradasVendidasHoy += numEntradas;
                return boleto;
            } else {
                // Mostrar un mensaje indicando que no se pueden vender más entradas que las disponibles.
                System.out.println("No se pueden vender más de " + entradasDisponibles + " entradas hoy.");
            }
        } else {
            // Mostrar un mensaje indicando que no hay entradas disponibles para el día.
            System.out.println("No hay entradas disponibles para hoy.");
        }
        return null;
    }
    
    

    public static int getEntradasVendidasHoy() {
        return entradasVendidasHoy;
    }

    public static void reiniciarEntradasVendidas() {
        entradasVendidasHoy = 0;
    }

    
    public static int getMaxEntradasPorDia() {
        return MAX_ENTRADAS_POR_DIA;
    }
      public static int getEntradasPorCuenta(String numCuenta) {
        return entradasPorCuenta.getOrDefault(numCuenta, 0);
    }

//    public static void registrarCompra(String numCuenta, int numEntradas) {
//        entradasPorCuenta.put(numCuenta, entradasPorCuenta.getOrDefault(numCuenta, 0) + numEntradas);
//    }

    public static boolean haAlcanzadoLimite(String numCuenta, int numEntradas) {
        int entradasCompradasPorCuenta = getEntradasPorCuenta(numCuenta);
        int totalEntradas = entradasCompradasPorCuenta + numEntradas;
        return totalEntradas > 10;
    }
    

      public static int getBoletosRestantesPorCuenta(String numCuenta) {
        // Consulta la cantidad de boletos comprados por la cuenta en la colección entradasPorCuenta
        int boletosCompradosPorCuenta = entradasPorCuenta.getOrDefault(numCuenta, 0);
        int boletosRestantes = 10 - boletosCompradosPorCuenta; // El límite es 10 boletos por cuenta
        return boletosRestantes;
    }

    // Método para registrar la compra de boletos por una cuenta
    public static void registrarCompra(String numCuenta, int numEntradas) {
        // Actualiza la cantidad de boletos comprados por la cuenta en la colección entradasPorCuenta
        int boletosCompradosPorCuenta = entradasPorCuenta.getOrDefault(numCuenta, 0);
        entradasPorCuenta.put(numCuenta, boletosCompradosPorCuenta + numEntradas);
    }
   



}
