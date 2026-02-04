package com.azahartech;

public class CalculadoraPrecios {
    public static final double IVA = 0.21;
    public static final double DESCUENTO_ESTUDIANTE_ALTO = 0.10;
    public static final double DESCUENTO_ESTUDIANTE_BAJO = 0.05;
    public static final int RECARGO_VIP = 50;
    public static final int TIPO_ESTUDIANTE = 1;
    public static final int TIPO_VIP = 2;

    /**
     * Método para calcular precio total
     * p: precio base, n: número entradas, t: tipo (1 = estudiante, 2 = vip)
     *
     * @author Equipo de desarrollo Azahar Tech
     * @version 1.0
     *
      */

    /**
     *
     * @param precioBase
     * @param numEntradas
     * @param tipoUsuario
     * @return precioFinal que dependera del tipo de usuario que se trate, las entradas que haya comprado y el precio base de estas
     */

    public double calcularPrecioTotal(double precioBase, int numEntradas, int tipoUsuario) {
        double precioFinal = precioBase * numEntradas;

        precioFinal = aplicarDescuentosORecargos(tipoUsuario, precioFinal);

        // Impuesto
        precioFinal = precioFinal + (precioFinal * IVA);
        return precioFinal;
    }

    /**
     *
     * @param tipoUsuario Tipo de usuario que compra las entradas
     * @param precioFinal
     * @return  precio que dependera del tipo de usuario que se trate
     */

    private static double aplicarDescuentosORecargos(int tipoUsuario, double precioFinal) {
        if (tipoUsuario == TIPO_ESTUDIANTE) {
        // Descuento estudiante
            if (precioFinal > 100) {
                precioFinal = precioFinal - (precioFinal * DESCUENTO_ESTUDIANTE_ALTO);
            } else {
                precioFinal = precioFinal - (precioFinal * DESCUENTO_ESTUDIANTE_BAJO);
            }

        } else if (tipoUsuario == TIPO_VIP) {
        // Recargo VIP por servicios extra
            precioFinal = precioFinal + RECARGO_VIP;
        }
        return precioFinal;
    }
}