/***************************************************************************
@File Paciente.java
@Autor: Sebastián José Solorzano Pérez
@Version: 1.0
Última modificación: 01/10/2021

Programa que tendra los metodos y las propiedades de la clase paciente.
***************************************************************************/

public class Paciente 
{
    //Propiedades//
    public String nombre;
    public int DPI;
    public String sangre;
    public int edad;
    public int NumSala;
    public String genero;
    public String diagnostico;
   
    //Métodos//
	
	//Constructor//
	public Medicamento()
	{
		nombre = null;
        DPI = 0;
        sangre = null;
        edad = 0;
        NumSala = 0;
        genero = null;
        diagnostico = null;
	}

    //Getters//
    public String getDiagnostico()
    {
        return diagnostico;
    }

    public int getEdad()
    {
        return edad;
    }

    public String getSangre()
    {
        return sangre;
    }
}
