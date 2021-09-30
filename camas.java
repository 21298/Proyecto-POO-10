/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class camas {
    private String nombre;
    camas disponible = null;
    camas(String[] pacientes){
        nombre = pacientes[0];
    }

   
    
    public camas getState(){
        return disponible;
    }
    
    public void setState(camas c){ 
        disponible = c; 
    }
    
    public void setState(){ 
        disponible = null; 
    }
    
    public String[] pacientes(){
        String[] pacientes = new String[4];
        pacientes[0] = nombre; 
        return pacientes;
    }
        //CONVERIR DATOS A STRING
    public String writeme(){
        String pacientes;
        pacientes = String.join(":", nombre);
        return pacientes; 
    }
}
