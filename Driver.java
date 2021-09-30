/********************************************************************
@File Driver.java 
@Autor: Grupo
@Version: 1.0
Última modificación: 01/10/2021

Driver program que servira como controlador e implementa el menú 
de opciones para doctores y enfermeros. 
********************************************************************/

public class Driver
{
    public static void main(String[] args)
	{
		//Propiedades//
		Vista vista = new Vista();
		vista.bienvenida();
        vista.rol();
    }
}