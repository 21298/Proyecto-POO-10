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
   public float time;
   public boolean ingerir;
   public String medicacion;
   
   //Métodos//
	
	//Constructor//
	public medicamento()
	{
		name = null;
		time = 0;
		ingerir = false;
        medicacion = null;
	}
	
	
    /** 
     * @return float
     */
    //Getters// 
    public float getTime()
    {
        return time;
    }

    //Setters//
    public void setTime()
    {
        time = 1;
    }
    
    public void setMedicacion()
    {
        medicacion = "";
    }
}
