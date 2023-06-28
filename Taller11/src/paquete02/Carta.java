/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author Sistemas G Didactic
 */
public class Carta extends Menu{
    
    private double guarnicion;
    private double bebida;
    private double servicio;

    public Carta(String n, double v, double g, double b, double s) {
        super(n, v);
        guarnicion = g;
        bebida = b;
        servicio = s;
    }

    public void establecerGuarnicion(double g) {
        guarnicion = g;
    }

    public void establecerBebida(double b) {
        bebida = b;
    }

    public void establecerServicio(double s) {
        servicio = s;
    }

    @Override
    public void calcularTotal() {
        vTotal = vInicial + guarnicion + bebida + (servicio * vInicial) / 100;
    }

    public double obtenerGuarnicion() {
        return guarnicion;
    }

    public double obtenerBebida() {
        return bebida;
    }

    public double obtenerServicio() {
        return servicio;
    }

    @Override
    public String toString() {

        String mensaje = String.format("Menu  a la Carta:\n"
                + "%s"
                + "\tValor bebida: %.1f\n"
                + "\tValor guarnicion: %.1f\n"
                + "\tPorcentaje adicional: %.2f\n"
                + "\tValor del menu: %.2f\n\n", super.toString(),
                bebida, guarnicion, servicio, vTotal);

        return mensaje;
    }
}
