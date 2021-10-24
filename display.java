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
import java.io.*; 
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class display {
    private Scanner scan = new Scanner(System.in);
    private Scanner stringscan = new Scanner(System.in);
    paciente[] paciente = new paciente[5];
    paciente P = new paciente();
    ArrayList<paciente> listaPaciente = new ArrayList();
    ArrayList<medicamento> listaMedicamento = new ArrayList();
    
    public String Input(String text){
        return JOptionPane.showInputDialog(text);
   }
    
    public void addPaciente() throws IOException{
        String name = Input("Nombre completo del paciente: ");
        String DPI = Input("DPI del paciente: ");
        String Sangre = Input("Sangre del paciente: ");
        String Diagnostico = Input("Diagnostico del paciente: ");
        
        String medicina = Input("Nombre del medicamento: ");
        String tiempo = Input("Por cuanto tiempo tomará el medicamento: ");
        String times = Input("Cuantas veces al día tomara el medicamento: ");
        String intervals = Input("Cada cuantas horas ingerirá el medicamento: ");
                
        paciente paciente = new paciente();
        paciente.setName(name);
        paciente.setDPI(DPI);
        paciente.setSangre(Sangre);
        paciente.setDiagnostico(Diagnostico);
        listaPaciente.add(paciente); 
        
        medicamento medica = new medicamento();
        medica.setMedicacion(medicina);
        medica.setTime(tiempo);
        medica.setTimes(times);
        medica.setIntervals(intervals);
        listaMedicamento.add(medica); 
        
            File archi;  
            FileWriter archivo;
            PrintWriter escritor;
            archi = new File("pacientesss.txt");
            if(!archi.exists()){
            try{
                archi.createNewFile();
                archivo = new FileWriter("pacientesss.txt",true);
                escritor = new PrintWriter(archivo);
                
                escritor.println(name+"|"+DPI+"|"+Sangre+"|"+Diagnostico+"|"+medicina+"|"+tiempo+"|"+times+"|"+intervals);
              
                escritor.close();
                archivo.close();
            }
            
            catch(IOException e){
                System.out.println("Error: " + e.getMessage());
            } 
        }
        else{
            try{
                archivo = new FileWriter("pacientesss.txt",true);
                escritor = new PrintWriter(archivo);
                escritor.println("Nombre|DPI|Sangre|Diagnostico|Medicina|Tiempo|Diarias|Intervalos");
                escritor.println(name+"|"+DPI+"|"+Sangre+"|"+Diagnostico+"|"+medicina+"|"+tiempo+"|"+times+"|"+intervals);
                escritor.close();
                archivo.close();
            }
            
            catch(IOException e){
                System.out.println("Error: " + e.getMessage());
            }     
        }
    }
   
    
    public void getPacientes(){
        String string="";
        for(int i=0;i<listaPaciente.size();i++){
            string+="Paciente "+(i+1)+"\n";
            string+="Name: "+listaPaciente.get(i).getName()+"\n";
            string+="DPI: "+listaPaciente.get(i).getDPI()+"\n";
            string+="Sangre: "+listaPaciente.get(i).getSangre()+"\n";
            string+="Diagnostico: "+listaPaciente.get(i).getDiagnostico()+"\n";
            string+="--------------------\n";
      
        for(int j=0;i<listaMedicamento.size();i++){
            
            string+="Medicamento: "+listaMedicamento.get(i).getMedicacion()+"\n";
            string+="Tiempo: "+listaMedicamento.get(i).getTime()+"\n";
            string+="Veces al dia: "+listaMedicamento.get(i).getTimes()+"\n";
            string+="Intervalos: "+listaMedicamento.get(i).getIntervals()+"\n";
            string+="--------------------\n";
        
        
        }
      JOptionPane.showMessageDialog(null, string);
   }
   
    
    /** 
     * @param a
     */
    public void print(String a){
        System.out.println(a);
        
       }
       
       /** 
        * @return String
        */
       public void directory(){ 
        String file= Input("Ingrese el archivo de pacientes (pacientess.txt)\n por Ejemplo: C:\\Users\\HP\\Documents\\java\\pacientess.txt");
        BufferedReader reader = null;
        String line = "";
        try {
            reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                for(String index : row) {
                    System.out.printf("%-10s", index);
                }
                System.out.println();
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
            reader.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
       }
       
       public int menuRol() throws IOException{
           int opcion=0;
           do{
               opcion = Integer.parseInt(JOptionPane.showInputDialog("------------------------------\n"
                       + "-Bienvenido al IGSS-\n"
                       + "------------------------------\n"
                       + "Selecciona tu Rol\n"
                       + "1. DOCTOR\n"
                       + "2. ENFERMERO\n"
                       + "3. SALIR"));
               switch(opcion){
                   case 1:
                       doctor();
                       break;
                   case 2:
                       enfermero();
                       break;
                   case 3:
                       opcion=3;
                       break;
                   default:
                       JOptionPane.showMessageDialog(null, "Opcion Invalida");
                       break;
               }
           }while(opcion!=3);
           System.exit(0);
           return opcion;
       }
    
    public int doctor() throws IOException{
        int opcion=0;
        opcion = Integer.parseInt(Input("------------------------------\n"
                       + "-Bienvenido Doctor-\n"
                       + "------------------------------\n"
                       + "Que accion desea hacer\n"
                       + "1. Registrar Paciente\n"
                       + "2. Mostrar Pacientes\n"
                       + "3. Control Médico\n"
                       + "4. Regresar"));
        switch(opcion){
            case 1:
                addPaciente();
                break;
            case 2:
                getPacientes();
                break;
            case 3:
                ControlMedico();
                break;
            
            case 4:
                opcion = 4;
                break;
            
            
            default:
                JOptionPane.showMessageDialog(null, "Opcion Invalida");
                break;
            
        }
        return opcion;
    }
    
    public int enfermero(){
        int opcion = 0;
        opcion = Integer.parseInt(Input("------------------------------\n"
                       + "-Bienvenido Enfermero-\n"
                       + "------------------------------\n"
                       + "Que accion desea hacer\n"
                       + "1. Registrar Paciente\n"
                       + "2. Mostrar Pacientes\n"
                       + "3. Vaciar Lista de Pacientes\n"
                       + "4. Regresar"));
        return opcion;
    }
    
    
    public void doctorMenu(){
        boolean continuar = true;
        while(continuar){
        System.out.println("--------------------------------------------------------");
        System.out.println("--------------------Bienevenido al IGSS------------------");
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
                break;
            case 5:
                System.out.println("Mostrar");
                System.out.println("------Escribe el directorio del archivo txt que se encuentra dentro de la carpeta--------------");
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
    
    /*public void addMedicamento(){
        String medicina = Input("Nombre del medicamento: ");
        String tiempo = Input("Por cuanto tiempo tomará el medicamento: ");
        String times = Input("Cuantas veces al día tomara el medicamento: ");
        String intervals = Input("Cada cuantas horas ingerirá el medicamento: ");
        
        medicamento medica = new medicamento();
        medica.setMedicacion(medicina);
        medica.setTime(tiempo);
        medica.setTimes(times);
        medica.setIntervals(intervals);
        listaMedicamento.add(medica); 
        }*/
     /** 
     * @return String[]
     */
    /*public String[] AsignarMedicamento(){
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
                "\nNo. veces al día: "+Medica[2] +"\nIntervalo de tiempo: "+ Medica[3]);
        System.out.println("");
        return Medica;
    }*/
    
    
    

}
