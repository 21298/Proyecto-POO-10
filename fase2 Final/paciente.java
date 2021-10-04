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
public class paciente {
    private String name;
    private String DPI; 
    private String edad;
    private String Sangre; 
    private String cama;
    private String Diagnostico; 
    
     
    
    paciente(String[] data){
        name = data[0];
        DPI = data[1].toUpperCase(); 
        edad =  data[2]; 
        Sangre = data[3].toUpperCase();
        cama = data[5]; 
        Diagnostico = data[4];
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

    
    /** 
     * @return String
     */
    public String getEdad() {
        return edad;
    }

    
    /** 
     * @param edad
     */
    public void setEdad(String edad) {
        this.edad = edad;
    }

    
    /** 
     * @return String
     */
    public String getCama() {
        return cama;
    }

    
    /** 
     * @param cama
     */
    public void setCama(String cama) {
        this.cama = cama;
    }

    public paciente(String name, String DPI, String edad, String Sangre, String cama, String Diagnostico) {
        this.name = name;
        this.DPI = DPI;
        this.edad = edad;
        this.Sangre = Sangre;
        this.cama = cama;
        this.Diagnostico = Diagnostico;
    }
    
    
    

    
    
} 

