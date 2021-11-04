/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectsamancito;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.Buffer;
import javax.swing.JOptionPane;

/**
 *
 * @author mkferrerteran
 */
public class funciones {
     public void escribir_txt(listaClientes lista, listaRest lista2, listaComida lista3){
         String informacion = "";
         nodoClientes clientes = lista.getInicio();
         nodoRest rest = lista2.getInicio();
         NodoComida comida = lista3.getInicio();
         int cont = 0;
         for (int i = 0; i < lista.getSize(); i++) {
             cont+= 1;
             informacion += "numero"+ cont + clientes.getNombre() + "," + clientes.getApellido() + "," + clientes.getCedula() + "," + clientes.getDireccion() + "\n";
             clientes = clientes.getSiguiente();
         }
         for (int i = 0; i < lista2.getSize(); i++) {
             informacion += rest.getNombre()+","+rest.getDireccion()+"\n";
             rest = rest.getSiguiente();
         }
         for (int i = 0; i < lista3.getSize(); i++) {
             informacion += comida.getNombre()+","+comida.getPrecio()+","+comida.getRestaurante()+"\n";
             comida = comida.getSiguiente();
         }
         try{
             PrintWriter pw = new PrintWriter("proyectoSamancito//samancito.txt");
             pw.print(informacion);
             pw.close();
             JOptionPane.showMessageDialog(null,"guardado exitoso");
         }catch (Exception err){
             JOptionPane.showInternalMessageDialog(null, err);
         }
     }
     
     public listaClientes clientes_txt() throws IOException{
          listaClientes clientes = new listaClientes();
          String line;
          String samancito = "";
          String path = "proyectoSamancito//samancito.txt";
          File file = new File(path);
          try{
              if(!file.exists()){
                  file.createNewFile();                 
              }else{
                  FileReader fr = new FileReader(file);
                  BufferedReader br = new BufferedReader(fr);
                  while ((line = br.readLine())!= null){
                      if(!line.isEmpty()){
                          samancito += line + "\n";
                      }
                  }
                if(!"".equals(samancito)){
                    String[] samancito_split = samancito.split("\n");
                    for (int i = 0; i < samancito_split.length; i++) {
                        String[] cliente = samancito_split[i].split(",");
                        //clientes.agregar(cliente[0], Integer.parseInt(cliente[i]));
                    }
                }
                
              }
              
          }catch(Exception ex) {
              
          }
         return clientes;
     }
}
