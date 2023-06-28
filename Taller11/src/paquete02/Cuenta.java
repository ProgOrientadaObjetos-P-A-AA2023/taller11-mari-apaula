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
public class Cuenta {
    private String usuario;
    private double iva;
    private ArrayList<Menu> menu;
    private double subtotal;
    private double total;

    public Cuenta(String cli, ArrayList<Menu> lm, double i) {
        usuario = cli;
        menu = lm;
        iva = i;
    }

    public void establecerCliente(String cli) {
        usuario = cli;
    }

    public void establecerIva(double i) {
        iva = i;
    }

    public void establecerLista(ArrayList<Menu> lista) {
        menu = lista;
    }

    public void establecerSubtotal() {
        double suma = 0;
        for (int i = 0; i < menu.size(); i++) {
            suma += menu.get(i).obtenerValorTotal();
        }

        subtotal = suma;
    }

    public void establecerTotal() {
        double add = (subtotal * iva) / 100;
        total = subtotal + add;
    }

    public String obtenerCliente() {
        return usuario;
    }

    public double obtenerIva() {
        return iva;
    }

    public double obtenerSubtotal() {
        return subtotal;
    }

    public double obtenerTotal() {
        return total;
    }

    public ArrayList<Menu> obtenerLista() {
        return menu;
    }

    @Override
    public String toString() {
        String Cadena = String.format("Factura\n"
                + "Cliente: %s\n",
                usuario);

        for (int i = 0; i < menu.size(); i++) {
            Cadena = String.format("%s%s", Cadena, menu.get(i));
        }
        Cadena = String.format("%sSubtotal: %.1f\n"
                + "IVA: %.1f\n"
                + "Total a Pagar: %.3f\n",
                Cadena, subtotal, iva, total);

        return Cadena;
    }
}
