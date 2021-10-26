/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_pm20072;

import javax.swing.JOptionPane;

/**
 *
 * @author Alexishm10
 */
public class Ejercicio1_PM20072 {
    private int opc, n1, n2, n3, n4, resultado;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
                
String numero=JOptionPane.showInputDialog("Ingrese un Numero:");
int n1 = Integer.parseInt(numero);
String numero2=JOptionPane.showInputDialog("Ingrese el segundo numero:");
int n2 = Integer.parseInt(numero2);   

String numero3=JOptionPane.showInputDialog("Ingrese el tercer numero:");
int n3 = Integer.parseInt(numero3);   

String numero4=JOptionPane.showInputDialog("Ingrese el cuarto numero:");
int n4 = Integer.parseInt(numero4);

String opcion=JOptionPane.showInputDialog("Que operacion desea relizar?\n Suma-> 1 \n resta-> 2 \n Multiplicacion-> 3 \n Division-> 4");
      int opc= Integer.parseInt(opcion); 

        if (opc==1) {
            int resultado=n1+n2+n3+n4;
            System.out.println("El resultado es: "+resultado+"\n");
        }else if (opc==2) {
            int resultado=n1-n2-n3-n4;
            System.out.println("El resultado es: "+resultado+"\n");
            }else if (opc==3) {
            int resultado=n1*n2*n3*n4;
            System.out.println("El resultado es: "+resultado+"\n");
            }else{
            int resultado=n1/n2/n3/n4;
            System.out.println("El resultado es: "+resultado+"\n");
            }
 



    }
    
}
