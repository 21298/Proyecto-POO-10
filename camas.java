/*
*Universidad del Valle de Guatemala
*Programacion Orientada a Objetos
*Profesor: Tomas Galvez
*Autores:
    *Abner Ivan Garcia 21285
    *Angel Gabriel Perez 21298
    *Javier Alejandro Prado 21486
    *Sebastian Solorzano 21826
*Programa utilizado: Visual Studio Code y Netbeans
*Clase: camas para asignar una cama al paciente
*/

public class camas {
    private String nombre;
    camas disponible = null;
    camas(String[] pacientes){
        nombre = pacientes[0];
    }
    
    /** 
     * @return camas
     */
    public camas getState(){
        return disponible;
    }
    
    
    /** 
     * @param c
     */
    public void setState(camas c){ 
        disponible = c; 
    }
    
    public void setState(){ 
        disponible = null; 
    }
    
    /** 
     * @return String[]
     */
    public String[] pacientes(){
        String[] pacientes = new String[4];
        pacientes[0] = nombre; 
        return pacientes;
    }
    
    /** 
     * @return String
     */
    public String writeme(){
        String pacientes;
        pacientes = String.join(":", nombre);
        return pacientes; 
    }
}
