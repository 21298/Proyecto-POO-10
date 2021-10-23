/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author angelfigueroa
 */
import java.io.*;
import javax.swing.JOptionPane;


public class Metodos {
     public void Escribir(String name){
        File f;
        FileWriter w;
        BufferedWriter bw;
        PrintWriter wr;

        try {
           f = new File(name);
           w = new FileWriter(f);
           bw = new BufferedWriter(w);
           wr = new PrintWriter(bw);

           wr.write("Esta es nuestra primera linea de codigo");
           wr.append("\nEsta es nuestra segunda linea de codigo");
           wr.append("\nUltima Linea");
           wr.append("\nTerminacion de prueba");


           wr.close();
           bw.close();



        } catch (Exception e){
           JOptionPane.showMessageDialog(null, "Ha sucedido un error"+e);
        }
    }
     
     
     public String leerTxt(String direccion){
         
         String texto = ""; 
         
         try{
             BufferedReader bf = new BufferedReader(new FileReader(direccion));
             String temp = "";
             String BufferedReader;
             
             while((BufferedReader = bf.readLine()) != null){
                 //ciclo mientras bf tenga datos
                 temp = temp + BufferedReader; //guardado texto del archivo
             }
             
             texto = temp;
             
         }catch(Exception e){
             System.err.println("No se encontró archivo");
         }
         return texto;
         
     }
}
