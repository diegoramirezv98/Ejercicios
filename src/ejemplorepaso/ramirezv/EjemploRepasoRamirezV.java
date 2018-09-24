
package ejemplorepaso.ramirezv;
import javax.swing.JOptionPane;
import java.io.*;
/**
 *
 * @author Diego Ramirez Villanueva (*)
 */
public class EjemploRepasoRamirezV {

    public static void main(String[] args) {
   // TODO code application logic here
        // Ejemplo Numero 01
        // n: Numero de Elementos a Capturar por teclado.
        int n = 0, i, c1 = 0, c2 = 1;

        String lista = "";

        do {
            try {
                c1 = c1 + 1;
                n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero de estudiantes"));
                
            } catch (NumberFormatException e) {
                c2 = c2 + 1;
                JOptionPane.showMessageDialog(null, "El dato ingresado es incorrecto");
            }
        } while (c2 > c1 ^ c1 > c2);
        {
            
            
        }
        
       

        // Arreglos
        String nombres[] = new String[n];
        int edades[] = new int[n];

        int multiplos[] = new int[n];

        int posicionmultiplo = 0;

        // Variables ;
        int menor = 9999;
        int mayor = 0;
        int suma = 0;
        double promedio = 0;

        for (i = 0; i < edades.length; i++) {
            int d1 = 0, d2 = 1;
            do {
                try {
                    d1 = d1 + 1;
                    edades[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad del estudiante Numero :  " + i + " "));
                } catch (NumberFormatException e) {
                    d2 = d2 + 1;
                    JOptionPane.showMessageDialog(null, "El dato ingresado es incorrecto");
                }
            } while (d2 > d1 ^ d1 > d2);
            {
               
            }

            if (edades[i] <= menor) {
                menor = edades[i];
            }

            if (edades[i] >= mayor) {
                mayor = edades[i];
            }
            // es Multiplo de Siete

            if (EsMultiplodeSiete(edades[i])) {

                multiplos[posicionmultiplo] = edades[i];
                posicionmultiplo++;

            }

            //
            suma = suma + edades[i];
            promedio = suma / n;

            // Impresion de Datos.
        }

        // Impresion de Nombres
        for (i = 0; i < nombres.length; i++) {
            lista = lista + (i + 1) + " " + nombres[i] + "\n";
        }

        //  Impresion de edades mayor y menor
        lista = lista + " La Edad Mayor es :  " + mayor + "\n";
        lista = lista + " La Edad Menor es :  " + menor + "\n";
        lista = lista + " El Promedio es :  " + promedio + "\n";
        lista = lista + " La Suma es :  " + suma + "\n";

        lista = lista + "************************\n";

        // Impresion Multiplos de Siete
        lista = lista + "Multiplos de siete\n";
        for (i = 0; i < multiplos.length; i++) {
            if (multiplos[i] > 0) {
                lista = lista + (i + 1) + ")  " + multiplos[i] + "\n";
            }
        }

        JOptionPane.showMessageDialog(null, lista);

    }

    public static boolean EsMultiplodeSiete(int pnNumero) {
        boolean bresultado = false;

        if (pnNumero == 0) {
            bresultado = false;
        }

        if (pnNumero % 7 == 0) {
            bresultado = true;
        } else {
            bresultado = false;
        }

        return bresultado;
    }
}

