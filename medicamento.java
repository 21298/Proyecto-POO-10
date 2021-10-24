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
public class medicamento 
{
   //Propiedades//
   public String name;
   public String time;
   public boolean ingerir;
   public String medicacion;
   public String times;
   public String Intervals;

    public String getIntervals() {
        return Intervals;
    }

    public void setIntervals(String Intervals) {
        this.Intervals = Intervals;
    }
   
   //Métodos//

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    
	
	//Constructor//
	public medicamento()
	{
	name = null;
		time = null;
		ingerir = false;
        medicacion = null;
	}
	
	
    /** 
     * @return float
     */
    //Getters// 
    public String getTime()
    {
        return time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIngerir() {
        return ingerir;
    }

    public void setIngerir(boolean ingerir) {
        this.ingerir = ingerir;
    }

    public String getMedicacion() {
        return medicacion;
    }

    public void setMedicacion(String medicacion) {
        this.medicacion = medicacion;
    }

    //Setters//
    public void setTime(String time)
    {
        this.time = time;
    }
    
   
}
