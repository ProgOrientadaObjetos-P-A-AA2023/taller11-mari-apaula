/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author Sistemas G Didactic
 */
public class MenuJunior extends Menu{
    private double helado;
    private double pastel;

    public MenuJunior(String n, double v, double h, double p) {
        super(n, v);
        helado = h;
        pastel = p;
    }

    public void establecerHelado(double h) {
        helado = h;
    }

    public void establecerPastel(double p) {
        pastel = p;
    }

    @Override
    public void calcularTotal() {
        vTotal = vInicial + helado + pastel;
    }

    public double obtenerHelado() {
        return helado;
    }

    public double obtenerPastel() {
        return pastel;
    }

    @Override
    public String toString() {

        String mensaje = String.format("Menu Niños:\n"
                + "%s"
                + "\tValor porción helado: %.2f\n"
                + "\tValor porción pastel: %.2f\n"
                + "\tValor del menu: %.2f\n\n", super.toString(),
                helado, pastel, vTotal);

        return mensaje;
    }
}
