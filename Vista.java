/**********************************************************************
@File Vista.java
@Autor: Grupo
@Version: 1.0
Última modificación: 01/10/2021

Programa que mostrará a los usuarios el menú de opciones para doctores
y enfermeros.
**********************************************************************/

import java.util.Scanner;

public class Vista 
{
    //Propiedades//
    private Scanner scan;
    private Scanner stringscan;

    //Métodos 
	
	//Constructor
	public Vista()
	{
		scan = new Scanner(System.in);
        stringscan = new Scanner(System.in);
	}

    public void print(String a)
    {
        System.out.println(a);
    }

    public void bienvenida()
	{
		System.out.println("\nBienvendi@ al programa del IGSS para llevar el control de medicamentos!");
	}
	
	public void rol()
    {
        boolean continuar = true;
        while(continuar)
        {
            System.out.println("\nEscoja su rol");    
            System.out.println("1. Doctor");
            System.out.println("2. Enfermero");
            System.out.println("3. Salir");
            int roles = scan.nextInt();
            switch(roles)
            {
                case 1:
                    System.out.println("\nBIENVENIDO DOCTOR :)");
                    doctorMenu();
                    break;
                case 2:
                    System.out.println("\nBIENVENIDO ENFERMERO :)");
                    enfermeroMenu();
                    break;
                case 3:
                    System.out.println("Feliz dia!");
                    continuar = false;
                    break;   
                default:
                    System.out.println("ERROR: escogio un rol indefinido\nIntente de nuevo ");    
                    continuar = true;
            }

        }
    }

    public void doctorMenu()
    {
        boolean continuar = true;
        while(continuar)
        {
            System.out.println("1. Registrar Paciente");
            System.out.println("2. Mostrar pacientes");
            System.out.println("3. Regresar");
            int opcion = scan.nextInt();
            switch(opcion)
            {
                case 1:
                    System.out.println("Registro");
                    registro();
                    break;
                case 2:
                    System.out.println("Mostrar");
                    mostrar_paciente();
                    break;
                case 3:
                    System.out.println("Regresara al menú principal!");
                    continuar = false;
                    break;   
                default:
                    System.out.println("ERROR: Escogio una opcion invalida\nIntente de nuevo");
                    continuar = true;          
            } 
        }
    }

    public void enfermeroMenu()
    {
        boolean continuar = true;
        while(continuar)
        {
            System.out.println("1. Buscar paciente");
            System.out.println("2. Ver paciente");
            System.out.println("3. Regresar");
            int opcion = scan.nextInt();   
            switch(opcion)
            {
                case 1:
                    System.out.println("Buscar");
                    break;
                case 2:
                    System.out.println("Ver");
                    break;
                case 3:
                    System.out.println("Regresara al menú principal!");
                    continuar = false;
                    break;   
                default:
                    System.out.println("ERROR: Escogio una opcion invalida\nIntente de nuevo");
                    continuar = true;          
            }   
    
        }
    } 

    public void registro()
    {
        System.out.println("Ingrese nombre completo del paciente");
        String nombre = stringscan.nextLine();
        System.out.println("Ingrese diagnostico");
        String diagnostico = stringscan.nextLine();
        System.out.println("Nombre: " + registro().nombre +"\nDiagnostico: " + registro().diagnostico);
    }

    public void mostrar_paciente()
    {
        System.out.println("Ingrese el DPI del paciente");
    }
}
