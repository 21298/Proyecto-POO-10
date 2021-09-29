/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Display {
    private Scanner scan = new Scanner(System.in);
    private Scanner stringscan = new Scanner(System.in);
    
     public void print(String a){
     System.out.println(a);
 }
    
    public void rol(){
        System.out.println("BIENVENIDO AL IGGS");
        boolean continuar = true;
        while(continuar){
            System.out.println("Escoja su rol");    
            System.out.println("1. Doctor");
            System.out.println("2. Enfermero");
            int roles = scan.nextInt();
            switch(roles){
                case 1:
                    System.out.println("BIENVENIDO DOCTOR :)");
                    doctorMenu();
                    break;
                case 2:
                    System.out.println("BIENVENIDO ENFERMERO :)");
                    enfermeroMenu();
                    break;
                    
                default:
                    System.out.println("ERROR: escogio un rol indefinido\nIntente de nuevo ");    
                    continuar = true;
        }

        }
        }
    
        
    
    public void doctorMenu(){
        boolean continuar = true;
        while(continuar){
        System.out.println("1. Registrar Paciente");
        System.out.println("2. Mostrar pacientes");
        System.out.println("3. Salir");
        int opcion = scan.nextInt();
        switch(opcion){
            case 1:
                System.out.println("Registro");
                registro();
                continuar = false;
                break;
            case 2:
                System.out.println("Mostrar");
                continuar = false;
                break;
            default:
                System.out.println("ERROR: Escogio una opcion invalida\nIntente de nuevo");
                continuar = true;          
        }
        
    }
    }
    
    
    public int enfermeroMenu(){
            System.out.println("1. Buscar paciente");
            System.out.println("2. ver paciente");
            int opcion = scan.nextInt();
            return opcion;      
    }
    
    public void registro(){
        System.out.println("Ingrese nombre completo del paciente");
        String nombre = stringscan.nextLine();
        System.out.println("Ingrese diagnostico");
        String diagnostico = stringscan.nextLine();
        System.out.println("Nombre: " + nombre +"\nDiagnostico: " + diagnostico);
    }
    
}
