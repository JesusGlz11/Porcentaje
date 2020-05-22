
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jesus
 */
public class Porcentaje {
    public static void main (String args[]){
         Scanner sc = new Scanner (System.in);
         
         
        
         
         
          System.out.println("ingrese el bono total");
          int bono = sc.nextInt();
          System.out.println("ingrese la calificacion obtenida en jefe");
          double j = sc.nextDouble();
          System.out.println("ingrese la calificacion obtenida en comision");
          double y= sc.nextDouble();
          System.out.println("ingrese la calificacion obtenida en clima");
          double z = sc.nextDouble();
          System.out.println("ingrese la calificacion obtenida en bitacora");
          double x= sc.nextDouble();
          
          int Tcalif = (int) (j + y + z + x);
          
           
          double Por = (Tcalif * 100)/ 40;
         System.out.println("obtuvo de calificacion de %"+Por);
          
          double Porc = Por/100;
          
          int porcentaje = (int) (bono * Porc);
          
          System.out.println("su bono total es: $"+porcentaje);
          
          
         
        
    }
    
}
