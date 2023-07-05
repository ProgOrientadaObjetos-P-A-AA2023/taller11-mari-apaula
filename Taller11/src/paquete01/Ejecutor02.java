/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.ArrayList;
import paquete02.*;

/**
 *
 * @author reroes
 */
public class Ejecutor02 {
    public static void main(String[] args) {
        
        String[][] datos001 = {{"Niños 01", "2.00", "1", "1.5"},
                               {"Niños 02", "3.00", "1", "1.5"},
                               {"Niños 03", "2.00", "2", "0.5"},};

        String[][] datos002 = {{"Econo 001", "4", "25"},
                               {"Econo 002", "4", "15"},
                               {"Econo 003", "4", "35"}};

        String[][] datos003 = {{"Dia 001", "5", "1", "1"},
                               {"Dia 002", "6", "2", "2"},
                               {"Dia 003", "5.5", "3", "1"},};

        String[][] datos004 = {{"Carta 001", "6", "1.5", "2", "10"},
                               {"Carta 002", "7", "1.7", "2.1", "5"},
                               {"Carta 003", "8", "1.9", "2.2", "5"},
                               {"Carta 004", "9", "2.5", "2.9", "5"},};

        // Lista de Menus
        ArrayList<Menu> lista = new ArrayList<>();

        /* Agregar un proceso para generar objetos de tipo Menu MenuCarta, Día, 
        Economico y Niño*. Cada arreglo datos, se corresponde a un tipo de Menú.
        Iterar y crear los objetos según corresponda. Cada objeto generado, 
        agregar al ArrayList lista*/
        // Inicio de solución
        String nombre = "";
        double vInicial = 0;
        double helado = 0;
        double pastel = 0;
        
        
        for (int i = 0; i < datos001.length; i++) {
            nombre = datos001[i][0];
            vInicial = Double.parseDouble(datos001[i][1]);
            helado = Double.parseDouble(datos001[i][2]);
            pastel = Double.parseDouble(datos001[i][3]);
            MenuJunior nino = new MenuJunior(nombre, vInicial, helado, pastel);
            lista.add(nino);
        }
        
        for (int i = 0; i < datos002.length; i++) {
            nombre = datos002[i][0];
            double vaInicial = Double.parseDouble(datos002[i][1]);
            double desc = Double.parseDouble(datos002[i][2]);
            MenuEconomico economico = new MenuEconomico(nombre, vaInicial, desc);
            lista.add(economico);
        }

        
        for (int i = 0; i < datos003.length; i++) {
            nombre = datos003[i][0];
            double vaInicial = Double.parseDouble(datos003[i][1]);
            double bebida = Double.parseDouble(datos003[i][2]);
            double postre = Double.parseDouble(datos003[i][3]);
            MenuDia dia = new MenuDia(nombre, vaInicial, bebida, postre);
            lista.add(dia);
        }
        // menu carta
        for (int i = 0; i < datos004.length; i++) {
            nombre = datos004[i][0];
            double vaInicial = Double.parseDouble(datos004[i][1]);
            double guarnicion = Double.parseDouble(datos004[i][2]);
            double bebida = Double.parseDouble(datos004[i][3]);
            double servicio = Double.parseDouble(datos004[i][4]);

            MenuCarta carta = new MenuCarta(nombre, vaInicial, guarnicion,
                    bebida, servicio);
            lista.add(carta);
        }
        

        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).calcularTotal();
        }

        
        Cuenta miCuenta = new Cuenta("Luis Andrade", lista, 10);
        miCuenta.establecerSubtotal();
        miCuenta.establecerTotal();
        System.out.printf("%s\n", miCuenta);

    }
}
