// calcular el gasto de agua de una vivienda dado el numero m^3 de agua gastados siendo el sistema decobro el siguiente:

// -la cuota  fija mensual es de $10000.
// los dos primeros 50 m^3 son gratis.
// Entre 50 y 200m^3 se cobra el m^3a $2000.
// A partir de 200 m^3 se cobra el m^3 a $3000
package modelo;

import javax.swing.JOptionPane;

public class quiz{
    public static void main(String[] args) {
        int gasto;
        String agua = null;
        gasto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor a calcular: "));

        if (gasto < 50 ) {
            gasto=gasto+(-50);
            agua = "son gratis";
        } else if (gasto >= 50 && gasto <= 200) {
            agua= "por m^3 son $2000";
        } else if (gasto >= 200 && gasto <= 30) {
            agua= "por m^3 son $2000";
       
        }

        JOptionPane.showMessageDialog(null,
                "Con un gasto de " + gasto + "°C el clima es: " + agua + "!");
        System.exit(0);
    }
}