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
    
    public void rol(){
        boolean continuar = true;
        while(continuar){
            System.out.println("Escoja su rol");    
            System.out.println("1. Doctor");
            System.out.println("2. Enfermero");
            int roles = scan.nextInt();
            switch(roles){
                case 1:
                    System.out.println("Usted es doctor");
                    doctorMenu();
                    break;
                case 2:
                    System.out.println("Usted es enfermero");
                    enfermeroMenu();
                    break;
                    
                default:
                    System.out.println("ERROR: escogio un rol indefinido\nIntente de nuevo ");       
        }
            if(roles<3){
                continuar = false;
            }
        }
        }
    
        
    
    public int doctorMenu(){
        System.out.println("1. Registrar Paciente");
        System.out.println("2. Editar paciente");
        int opcion = scan.nextInt();
        return opcion;
    }
    
    public int enfermeroMenu(){
            System.out.println("1. Buscar paciente");
            System.out.println("2. ver paciente");
            int opcion = scan.nextInt();
            return opcion;
    }
    
}
