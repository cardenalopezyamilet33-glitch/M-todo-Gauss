/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ecuaciones_Lineales;

/**
 *
 * @author Carde
 */
public class Lanzador {
   public static void main(String[]args){
   //mandamos a llamar a la funcion que nos entrega la matriz aumentada [A|B]
   double[][]matriz = defMatrizz.defMatrizz();
   //convierte los elementos debajo de la diagonal principal en ceros. 
   Gauss.eliminacionGaussiana(matriz);
   
   //obtener los resultados mediante sustitucion regresiva (la bajada)
   //despeja las incognitas de abajo hacia arriba apartir de la matriz triangular 
   
   double[]soluciones = Gauss.SustitucionRegresiva(matriz);
   
   //imprimir resultados finales en consola de manera limpia 
       System.out.println("\n SOLUCIONES DEL SISTEMA: \n");
       for(int i=0; i< soluciones.length; i++){
           System.out.println("x" + (i + 1) + "=" + soluciones);
       }
   
   } 
}
