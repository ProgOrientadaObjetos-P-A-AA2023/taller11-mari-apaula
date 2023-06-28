/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author Sistemas G Didactic
 */
public class MenuEconomico extends Menu{
    private double descuento;

    public MenuEconomico(String n, double v, double des) {
        super(n, v);
        descuento = des;
    }

    public void establecerDescuento(double des) {
        descuento = des;
    }

    @Override
    public void calcularTotal() {
        vTotal = vInicial - (vInicial * descuento) / 100;
    }

    public double obtenerDescuento() {
        return descuento;
    }

    @Override
    public String toString() {

        String mensaje = String.format("Menu Economico:\n"
                + "%s"
                + "\tValor descuento: %.2f\n"
                + "\tValor del menu: %.2f\n\n", super.toString(),
                descuento, vTotal);

        return mensaje;
    }

}
