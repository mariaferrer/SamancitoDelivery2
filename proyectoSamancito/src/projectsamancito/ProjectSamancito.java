/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectsamancito;

import interfaz.main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author mkferrerteran
 */
public class ProjectSamancito {
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        main ventana =new main();
        ventana.setVisible(true);
        
        int num=0;

    System.out.println("\n\tImplementacion del algoritmo de Dijkstra");
    System.out.print("Numero de nodos que tiene el grafo a resolver? ");

    do{
      try{
        InputStreamReader l1 = new InputStreamReader(System.in);
        BufferedReader l2 = new BufferedReader(l1);
        num=Integer.valueOf(l2.readLine()).intValue();
      }
      catch(IOException e){
        System.out.println("Error: "+e);
        System.out.println("Ingresa el numero de nodos que tiene el grafo a resolver: ");
      }
      catch(NumberFormatException e2){
        System.out.println("Error: "+e2);
        System.out.println("Ingresa el numero de nodos que tiene el grafo a resolver: ");
      }
      if(num<3 || num>26)
       System.out.print(" * El numero de nodos debe estar entre 3 y 26 ");

    }while(num<3 || num>26);
         //Dijkstra2_clase obj = new Dijkstra2_clase(num);
    }
    //matrizAdyacencia = {{0,999999,99999999,99999999,8,999999,999999999,9999999,9999999,2,999999999,99999},{99999999,0,99999999,4,9999999,999999999,99999999,9999999,999999,999999,999999,2},{999999,99999999,0,9999999999,999999999,9999999,1,9999999999,9999999999,999999,999999,9999999},{99999999,9999999999,2,0,9999999,999999999,99999999,9999999,6,9999999999,9999999,99999999},{999999,9999999,9999999999,9999999999,0,9999999999,99999999999,999999,3,999999999,9999999,7},{9999999999,99999999999,9999999999,9999999,5,0,99999999,99999999,99999999,6,999999999,99999999},{99999999,99999999,9999999999,999999999,999999999999,9999999999,0,999999,99999,99999,4,9999999},{3,2,9999999,9999999999,9999999,999999,9999999999,0,99999999,99999999,99999999,9999999999},{9999999,99999999,9999999999,99999999,9999999,7,88888888,0,999999,9999999,9999999},{999999999,99999999,99999999,999999999,3,999999,9999999,9999999,9999999,99999999999,99999999,9999999},{99999,99999,999999,99999999,9999999,8,999999,99999999,1,999999999,0,99999999},{1,999999999,99999999,999999999,99999999,999999999,99999999,1,9999999,999999999,99999999999,0}}
}
