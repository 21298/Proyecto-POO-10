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
*Clase: paciente aqui se lleva acabo la asignacion de informacion de los pacientes
*/

import javax.swing.JOptionPane;

public class paciente {
    private String name;
    private String DPI; 
    private String Sangre; 
    private String Diagnostico;
    private String fecha;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public paciente(){
        //super(nam, tim, ing, med, tims, ints);
        name = "";
        DPI = "";
        Sangre = "";
        Diagnostico = "";
    }
     
     /** 
     * @return String
     */
    public String getName() {
        return name;
    }

    /** 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /** 
     * @return String
     */
    public String getDPI() {
        return DPI;
    }

    /** 
     * @param DPI
     */
    public void setDPI(String DPI) {
        this.DPI = DPI;
    }

    /** 
     * @return String
     */
    public String getSangre() {
        return Sangre;
    }

    /** 
     * @param Sangre
     */
    public void setSangre(String Sangre) {
        this.Sangre = Sangre;
    }

    /** 
     * @return String
     */
    public String getDiagnostico() {
        return Diagnostico;
    }

    /** 
     * @param Diagnostico
     */
    public void setDiagnostico(String Diagnostico) {
        this.Diagnostico = Diagnostico;
    }
    
    public String Input(String text){
        return JOptionPane.showInputDialog(text);
   }
    
     public void info() {
        JOptionPane.showMessageDialog(null, "Nombre: " + getName()+"\nNo. DPI: "+getDPI()+"\nDiagnostico: "+getDiagnostico()+"\nTipo de Sangre: "+getSangre());
    }

    
} 


