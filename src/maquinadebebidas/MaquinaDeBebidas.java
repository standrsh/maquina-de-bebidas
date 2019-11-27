/**
 *
 * @author Samuel Di Giorgi.
 */

package maquinadebebidas;

import javax.swing.JOptionPane;

import java.util.Scanner;

import maquinadecafe.Expresso;
import maquinadecafe.Normal;
import maquinadecafe.Ristretto;

import maquinadete.Negro;
import maquinadete.Rojo;
import maquinadete.Verde;

public class MaquinaDeBebidas {

    public static void main(String[] args) {

        Bebida[] pedido = new Bebida[150];
            boolean otroPedido = true;
            int siguiente = 0;

        while (otroPedido) {
            System.out.println("Seleccione la infusión que desea beber:\n"
                    + "1) Café\n"
                    + "2) Té\n");
            Scanner entrada = new Scanner(System.in);
                int clase = entrada.nextInt();

            if (clase == 1) {
                System.out.println("¿Qué tipo de café quiere?\n"
                        + "1) Expresso\n"
                        + "2) Ristretto\n"
                        + "3) Normal\n");
                Scanner entradaCafe = new Scanner(System.in);
                    int tipoCafe = entradaCafe.nextInt();

                switch (tipoCafe) {
                    case 1:
                        pedido[siguiente] = new Expresso();
                        break;
                    case 2:
                        pedido[siguiente] = new Normal();
                        break;
                    case 3:
                        pedido[siguiente] = new Ristretto();
                        break;
                }

                System.out.println("Seleccione la cantidad de azúcar que desea (0-3)");
                Scanner entradaAzucar = new Scanner(System.in);
                    int azucar = entradaCafe.nextInt();
                    pedido[siguiente].setAzucar(azucar);

                System.out.println("Seleccione la cantidad de leche que desea (0-3)");
                Scanner entradaLeche = new Scanner(System.in);
                    int leche = entradaLeche.nextInt();
                    pedido[siguiente].setLeche(leche);
            }

            if (clase == 2) {
                System.out.println("¿Qué tipo de té quiere?\n"
                        + "1) Negro\n"
                        + "2) Rojo\n"
                        + "3) Verde\n");
                Scanner entradaTe = new Scanner(System.in);
                    int tipoTe = entradaTe.nextInt();
                    
                switch (tipoTe) {
                    case 1:
                        pedido[siguiente] = new Negro();
                        break;
                    case 2:
                        pedido[siguiente] = new Rojo();
                        break;
                    case 3:
                        pedido[siguiente] = new Verde();
                        break;
                }

                System.out.println("Seleccione la cantidad de azúcar que desea (0-3)");
                Scanner entradaAzucar = new Scanner(System.in);
                    int azucar = entradaTe.nextInt();
                    pedido[siguiente].setAzucar(azucar);

                System.out.println("Seleccione la cantidad de leche que desea (0-3)");
                Scanner entradaLeche = new Scanner(System.in);
                    int leche = entradaLeche.nextInt();
                    pedido[siguiente].setLeche(leche);
            }

            System.out.println("¿Desea ingresar otro pedido?\n"
                    + "1) Sí\n"
                    + "2) No\n");
            Scanner entradaOtroPedido = new Scanner(System.in);
                int otro = entradaOtroPedido.nextInt();
            
            if (otro == 1) {
                siguiente++;
            } else {
                otroPedido = false;
            }

        }

      double subtotal = 0, total = 0;

        for (int i = 0; i < pedido.length; i++) {
          
            if (pedido[i] != null) {
                System.out.println(pedido [i]);
                    subtotal = subtotal + pedido[i].getPrecio()
                            + pedido [i].getAzucar() * 5
                            + pedido [i].getLeche() * 5;
                
            }

        }
        total = subtotal * 1.21;
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Total: $" + total);
        JOptionPane.showInputDialog("¡Gracias por su compra!\n"
                                    + "¡Que tenga un buen día! :) ");
        
    }
}