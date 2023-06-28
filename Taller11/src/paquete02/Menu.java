/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author Sistemas G Didactic
 */
public abstract class Menu {
    protected String nombre;
    protected double vInicial;
    protected double vTotal;

    public Menu(String n, double v) {
        nombre = n;
        vInicial = v;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerValorInicial(double v) {
        vInicial = v;
    }

    public abstract void calcularTotal();

    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerValorInicial() {
        return vInicial;
    }

    public double obtenerValorTotal() {
        return vTotal;
    }

    @Override
    public String toString() {

        String mensaje = String.format("\tPlato: %s\n"
                + "\tValor inicial: %.2f\n", obtenerNombre(),
                obtenerValorInicial());

        return mensaje;

    }
}
