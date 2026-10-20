/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ecuaciones_Lineales;

/**
 *
 * @author Carde
 */
public class Gauss {
     public static void eliminacionGaussiana(double[][] matriz){
   int n = matriz.length; //obtiene el tamaño del sistema(numero de filas
   
   for(int i=0; i<n; i++){
   for(int j=i+1; j<n; j++){
   double factor = matriz [j][i] / matriz [i][i];
   
      //ciclo 3 k: recorre columna por columna la fila completa 
           //para aplicar la operacion matematica 
           for(int k=i; k<=n; k++){
             matriz[j][k]-= factor * matriz[i][k];
           }
   }
   }
     }
       public static double[]SustitucionRegresiva(double[][] matriz){
       int n= matriz.length;
       double[] x = new double[n];
       for(int i = n-1; i>= 0; i--){
       double suma =0;
       for(int j=i+1; j<n; j++){
           suma += matriz [i][j] * x[j];
       }
       x[i]=(matriz[i][n]- suma )/matriz [i][i];
       }
        return x;
       }
}
