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
*Clase: medimcamento para llevar control de la medicina con los pacientes
*/

public class medicamento extends paciente {
   //Propiedades//
   public String nameMedicina;
   public String time;
   public String medicacion;
   public String times;
   public String Intervals;
   
   //Métodos// 
	
	//Constructor//
	public medicamento()
	{
	    nameMedicina = null;
		time = null;
		
        medicacion = null;
        times = null;
        Intervals = null;
	}
	
	
    /** 
     * @return String
     */
    public String getNameMedicina() {
        return nameMedicina;
    }

    /** 
     * @param name
     */
    public void setNameMedicina(String nameMedicina) {
        this.nameMedicina = nameMedicina;
    }

    /** 
     * @return boolean
     */
   

  
    /** 
     * @return String
     */
    public String getMedicacion() {
        return medicacion;
    }

    /** 
     * @param medicacion
     */
    public void setMedicacion(String medicacion) {
        this.medicacion = medicacion;
    }

    /** 
     * @return String
     */
    public String getTime()
    {
        return time;
    }

    /** 
     * @param time
     */
    public void setTime(String time)
    {
        this.time = time;
    }
    
    /** 
     * @return String
     */
    public String getIntervals() {
        return Intervals;
    }

    /**
     * @param Intervals
     
     */
    public void setIntervals(String Intervals) {
        this.Intervals = Intervals;
    }

    /** 
     * @return String
     */
    public String getTimes() {
        return times;
    }

    /** 
     * @param times
     */
    public void setTimes(String times) {
        this.times = times;
    }

    
}
