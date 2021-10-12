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
*Clase: Display utilizada para la vista de interaccion con el usuario
*/
import java.util.Scanner;

import jdk.jshell.Diag;

import java.io.*; 
import java.util.ArrayList;
import java.util.Arrays;


public class display {
    private Scanner scan = new Scanner(System.in);
    private Scanner stringscan = new Scanner(System.in);
    paciente[] paciente = new paciente[5];
    paciente P = new paciente();


    
    /** 
     * @param a
     */
    public void print(String a){
        System.out.println(a);
       }
       
       /** 
        * @return String
        */
       public String directory(){
        System.out.println("Ingrese el directorio donde se guardarán o se encuentran los datos" );
        System.out.println("por Ejemplo: D:\\Programas\\");
        String direct = stringscan.nextLine(); 
       try{
        FileReader fr = new FileReader(direct);
        BufferedReader br = new BufferedReader(fr);
        String cadena;
        while((cadena= br.readLine())!=null){
            System.out.println(""+cadena);
        }
   
}catch (Exception e){

    }
        return direct; 
       } 
    
    public void doctorMenu(){
        boolean continuar = true;
        while(continuar){
        System.out.println("--------------------------------------------------------");
        System.out.println("--------------------Binevenido al IGSS------------------");
        System.out.println("--------------------------------------------------------");
        System.out.println("");
        System.out.println("|BIENVENIDO DOCTOR / ENFERMERO|");
        System.out.println("");
        System.out.println("¿Que acción desea ejecutar?");
        System.out.println("1. Registrar Paciente");
        System.out.println("2. Buscar Persona");
        System.out.println("3. Control Medico");
        System.out.println("4. Asignar Medicamentos");
        System.out.println("5. Mostrar Reasultados");
        System.out.println("6. Salir");
        int opcion = scan.nextInt();
        switch(opcion){
            case 1:
                System.out.println("Registro");
                registro();
                
                break;
            case 2:
                System.out.println("Mostrar");
                
                break;
            case 3:
                System.out.println("Control Medico");
                ControlMedico();
               
                break;
            case 4:
                System.out.println("Asignar Medicacion");
                AsignarMedicamento();
                break;
            case 5:
                System.out.println("Mostrar");
                System.out.println("------Escribe el directorio del archivo txt que se encuentra dentro de la carpeta--------------");
                directory();
       
                break;
            case 6:
                System.out.println("");
                System.out.println("-------- Esperamos haber sido de ayuda ---------");
                System.exit(1);
                
                break;
            default:
                System.out.println("ERROR: Escogio una opcion invalida\nIntente de nuevo");
                continuar = true;          
        }
        
        }
    }
    

    
    public void ControlMedico(){
        System.out.println("");
        System.out.println("--------------Información Medicinal------------");
        boolean continuar = true;
        while(continuar){
            System.out.println("");
            System.out.println("--- De que medicamento quiere conocer información");    
            System.out.println("1. Acetaminofén");
            System.out.println("2. Aspirina");
            System.out.println("3. Amoxicilina");
            System.out.println("4. Ibuprofeno");
            System.out.println("5. Aspirina");
            System.out.println("6. Regresar");
            
            int Medic = scan.nextInt();
            switch(Medic){
                case 1:
                    System.out.println("--- Información sobre acetaminofen ---");
                    System.out.println("");
                    System.out.println("El acetaminofén se usa para aliviar el dolor leve a dolor moderado desde dolores de cabeza, dolores musculares, \nperíodos menstruales,resfriados y dolores de garganta, dolor de muelas dolores de espalda, reacciones a las vacunas, \ny para reducir fiebre, Se debe tomar cada 8 horas.");
                    break;
                case 2:
                    System.out.println("--- Información sobre Aspirina ---");
                    System.out.println("");
                    System.out.println("La aspirina prescripta se usa para aliviar los síntomas de la artritis reumatoide (un tipo de artritis causada por \nla inflamación del revestimiento de las articulaciones), osteoartritis (un tipo de artritis causada por el desprendimiento \ndel revestimiento de las articulaciones) y fuertes dolores de cabeza, Tomar cada 4 a 5 horas");
                    break;
                case 3:
                    System.out.println("--- Información sobre Amoxicilina ---");
                    System.out.println("");
                    System.out.println("La amoxicilina se usa para tratar algunas infecciones provocadas por bacterias como la neumonía; \nla bronquitis (infección de las vías respiratorias que van a los pulmones); e infecciones de los oídos, nariz, \ngarganta, del tracto urinarioy la piel, Se toma una cada 8 horas.");
                    break;
                case 4:
                    System.out.println("--- Información sobre Ibuprofeno ---");
                    System.out.println("");
                    System.out.println("El ibuprofeno de venta con receta se usa para aliviar el dolor, la sensibilidad, la inflamación y la rigidez ocasionados \npor la osteoartritis (artritis debida a la degradación del revestimiento de las articulaciones) y \nla artritis reumatoide (artritis debida a la inflamación del revestimiento de las articulaciones), Se debe tomar una cada 6 horas.");
                    break;
                case 5:
                    System.out.println("--- Información sobre Diclofenaco ---");
                    System.out.println("");
                    System.out.println("se usan para aliviar el dolor, la sensibilidad, la inflamación y la rigidez causada por la osteoartritis (artritis causada por \nun daño en el revestimiento de las articulaciones) y artritis reumatoide (artritis causada por \nla inflamación del revestimiento de las articulaciones), tomar 3 tabletas al día.");
                    break;
                case 6:
                    System.out.println("Regresar");
                    System.out.println("");
                    doctorMenu();
                    break;
                default:
                    System.out.println("ERROR: escogio un rol indefinido\nIntente de nuevo ");    
                    continuar = true;
        }
        }
        }
    
    
    /** 
     * @return String[]
     */
    public String[] registro(){
        int cuantos = 0;
        System.out.println("Cuantos pacientes va a registrar");
        cuantos = scan.nextInt();
        String[] pacientes = new String[6];
        for(int i= 0;i<cuantos;i++){
            System.out.println("Ingrese nombre completo del paciente");
            String name= stringscan.nextLine(); 
            System.out.println("Ingrese DPI del paciente");
            String DPI = stringscan.nextLine();
            System.out.println("Ingrese tipo de sangre del paciente");
            String Sangre= stringscan.nextLine();
            System.out.println("Ingrese diagnostico");
            String Diagnostico = stringscan.nextLine();
            System.out.println("Paciente registrado");
            paciente[i] = new paciente(name,DPI,Sangre,Diagnostico);
        }



        /*System.out.println("Ingrese persona en caso de emergencia");
        paciente[4] = stringscan.nextLine();
        System.out.println("Ingrese numero telefonico persona emergencia");
        paciente[5] = stringscan.nextLine();*/
        
        
        return pacientes;
    }
    


   
    
    /** 
     * @return String[]
     */
    public String[] AsignarMedicamento(){
        String[] Medica = new String[6];
        System.out.println("Ingrese nombre de la medicina");
        Medica[0]= stringscan.nextLine(); 
        System.out.println("Por cuanto tiempo tomará el medicamento");
        Medica[1] = stringscan.nextLine();
        System.out.println("Cuantas veces al día tomara el medicamento");
        Medica[2] = stringscan.nextLine();
        System.out.println("Cada cuantas horas se le recetó tomar la medicina");
        Medica[3] = stringscan.nextLine();
        System.out.println("");
        System.out.println("");
        System.out.println("\n\nMedicina: "+Medica[0]+"\nTiempo de medicamento: "+Medica[1]+
                "\nNo. veces al día: "+Medica[2] +"\nIntervalo de tiempo: "+Medica[3]);
        System.out.println("");
        return Medica;
    }
    
    /** 
     * @param paciente
     */
   /* public void mostrarTodosLosPacientes(ArrayList<paciente> paciente){
        paciente.forEach(persona -> {
            System.out.println(persona.getName() + persona.getDiagnostico());
        });
}*/
}
