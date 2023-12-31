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
public class Ejecutor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Menu> lista = new ArrayList<>();

        MenuDia dia = new MenuDia("Dia 001", 5, 1, 1);
        dia.calcularTotal();
        lista.add(dia);
        
        MenuDia dia2 = new MenuDia("Dia 002", 2, 1, 1.5);
        dia2.calcularTotal();
        lista.add(dia2);
        
        MenuEconomico economico = new MenuEconomico("Econo 001", 4, 25);
        economico.calcularTotal();
        lista.add(economico);

        MenuDia dia3 = new MenuDia("Dia 003", 5, 1, 1);
        dia3.calcularTotal();
        lista.add(dia3);
        
        MenuCarta carta = new MenuCarta("Carta 001", 6, 1.5, 2, 10);
        carta.calcularTotal();
        lista.add(carta);

        Cuenta cuenta = new Cuenta("René Elizalde", lista, 10);
        cuenta.establecerSubtotal();
        cuenta.establecerTotal();

        System.out.println(cuenta);
    }

}
// lo que debe presentar
/*
Factura
Cliente: René Elizalde
Menu del Día:
	Plato: Niños 01
	Valor Inicial: 2,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 4,50

Menu del Día:
	Plato: Niños 02
	Valor Inicial: 3,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 5,50

Menu Económico:
	Plato: Econo 001
	Valor Inicial: 4,00
	Porcentaje Descuento: 25,00
	Valor del Menú: 3,00

Menu del Día:
	Plato: Dia 001
	Valor Inicial: 5,00
	Valor bebida: 1,00
	Valor postre: 1,00
	Valor del Menú: 7,00

Menu a la MenuCarta:
	Plato: MenuCarta 001
	Valor Inicial: 6.0
	Valor guarnición: 1.5
	Valor bebida: 2.0
	Porcentaje Adicional: 10,00
	Valor del Menú: 10,10

Subtotal: 30,1
IVA: 10,0%
Total a pagar: 33,110

*/