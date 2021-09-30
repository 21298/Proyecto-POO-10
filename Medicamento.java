/***************************************************************************
@File Medicamento.java
@Autor: Sebastián José Solorzano Pérez
@Version: 1.0
Última modificación: 01/10/2021

Programa que tendra los metodos y las propiedades de la clase medicamento.
***************************************************************************/

public class Medicamento 
{
   //Propiedades//
   public String name;
   public float time;
   public boolean ingerir;
   public String medicacion;
   
   //Métodos//
	
	//Constructor//
	public Medicamento()
	{
		name = null;
		time = 0;
		ingerir = false;
        medicacion = null;
	}
	
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
