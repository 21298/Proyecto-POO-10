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
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;

public class display {
    private Scanner scan = new Scanner(System.in);
    private Scanner stringscan = new Scanner(System.in);
    private Scanner entrada;
    paciente[] paciente = new paciente[5];
    paciente P = new paciente();
 
    ArrayList<paciente> listaPaciente = new ArrayList();
    ArrayList<medicamento> listaMedicamento = new ArrayList();
    ArrayList<paciente> pacientes = new ArrayList<>();
    
    public String Input(String text){
        return JOptionPane.showInputDialog(text);
   }
    
    public void addPaciente() throws IOException{
        String fecha = Input("Ingrese la fecha de inicio en formato (Dia/Mes/Año): ");
        String name = Input("Nombre completo del paciente: ");
        String DPI = Input("DPI del paciente: ");
        String Sangre = Input("Sangre del paciente: ");
        String Diagnostico = Input("Diagnostico del paciente: ");
        
        String medicina = Input("Nombre del medicamento: ");
        String tiempo = Input("Por cuanto tiempo tomará el medicamento: ");
        String times = Input("Cuantas veces al día tomara el medicamento: ");
        String intervals = Input("Cada cuantas horas ingerirá el medicamento: ");
        
        asignarCama();
        
        paciente paciente = new paciente();
        paciente.setFecha(fecha);
        paciente.setName(name);
        paciente.setDPI(DPI);
        paciente.setSangre(Sangre);
        paciente.setDiagnostico(Diagnostico);
        listaPaciente.add(paciente);
        pacientes.add(paciente);
        
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
                escritor.println("Fecha|Nombre|DPI|Sangre|Diagnostico|Medicina|Tiempo|Diarias|Intervalos|Cama");
                escritor.println(fecha+"|"+name+"|"+DPI+"|"+Sangre+"|"+Diagnostico+"|"+medicina+"|"+tiempo+"|"+times+"|"+intervals+"|"+bed.get(a));
              
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
                
                escritor.println(fecha+"|"+name+"|"+DPI+"|"+Sangre+"|"+Diagnostico+"|"+medicina+"|"+tiempo+"|"+times+"|"+intervals+"|"+bed.get(a));
                escritor.close();
                archivo.close();
            }
            
            catch(IOException e){
                System.out.println("Error: " + e.getMessage());
            }     
        }
    }
   
    
    public void getPacientes(){ //Almacenamiento de toda la informacion recolectada del usuario
        String string="";
        for(int i=0;i<listaPaciente.size();i++){
            string+="Paciente "+(i+1)+"\n";
            string+="Fecha: "+listaPaciente.get(i).getFecha()+"\n";
            string+="Name: "+listaPaciente.get(i).getName()+"\n";
            string+="DPI: "+listaPaciente.get(i).getDPI()+"\n";
            string+="Sangre: "+listaPaciente.get(i).getSangre()+"\n";
            string+="Diagnostico: "+listaPaciente.get(i).getDiagnostico()+"\n";
            string+="Medicamento: "+listaMedicamento.get(i).getMedicacion()+"\n";
            string+="Tiempo: "+listaMedicamento.get(i).getTime()+"\n";
            string+="Veces al dia: "+listaMedicamento.get(i).getTimes()+"\n";
            string+="Intervalos: "+listaMedicamento.get(i).getIntervals()+"\n";
            string+="cama: "+bed.get(a);
            string+="--------------------\n";
            JOptionPane.showMessageDialog(null, string);
        }
    }
    
    /** 
     * @param a
     */
    
    
    public void print(String a){
        System.out.println(a);
        
       }
    
       
       /** 
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
       
       public int menuRol() throws IOException{ //Menu principal
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
                   case 1 -> doctor();
                   case 2 -> enfermero();
                   case 3 -> opcion=3;
                   default -> JOptionPane.showMessageDialog(null, "<html><p style =\"font-family:verdana; font 10px; color:white \">Opcion Invalida</p></html>");
               }
           }while(opcion!=3);
           System.exit(0);
           return opcion;
       }
    //<>
    public int doctor() throws IOException{ // menu secundario basado en el rol de Dcctor
        int opcion=0;
        opcion = Integer.parseInt(Input("-------------------\n"
                       + "-BIENVENIDO DOCTOR-\n"
                       + "-------------------\n"
                       + "Que accion desea hacer\n"
                       + "1. Registrar Paciente\n"
                       + "2. Mostrar Pacientes\n"
                       + "3. Mostra todos los pacientes\n"
                       + "4. Buscar por DPI\n"
                       + "5. Regresar"));
        switch(opcion){
            
            case 1:
                addPaciente();
                break;
            case 2:
                getPacientes();
                break;
            case 3:
                mostrarTodo();
                break;
            case 4:
                buscarPorDPI();
                break;
            case 5:
                opcion = 5;
                break;
            
            default:
                JOptionPane.showMessageDialog(null, "<html><p style =\"font-family:verdana; font: 10px; color:white \">Opcion Invalida</p></html>");
            
        }
        return opcion;
    }
    
    
    public int enfermero() throws IOException{ // Menu basado en el rol de Enfermero
        
        int opcion = 0;
        opcion = Integer.parseInt(Input("----------------------\n"
                       + "-BIENVENIDO ENFERMERO-\n"
                       + "----------------------\n"
                       + "Que accion desea hacer\n"
                       + "1. Registrar Paciente\n"
                       + "2. Mostrar Pacientes\n"
                       + "3. Mostrar todos los pacientes\n"
                       + "4. Control Médico\n"
                       + "5. Buscar por DPI\n"
                       + "6. Regresar"));
        switch(opcion){
            case 1: // Registro paciente
                addPaciente();
                break;
            case 2: // Mostrar paciente registrado
                getPacientes();
                break;
            case 3:
                mostrarTodo();
            case 4: // Control Medico
                controlMedico();
                break;
            case 5:
                buscarPorDPI();
                break;
            case 6: // Regreso s menu enfermero
                opcion = 6;
                break;
            
            
            default: // dato invalido
                JOptionPane.showMessageDialog(null, "<html><p style =\"font-family:verdana; font: 10px; color:white\">Opcion Invalida</p></html>");
                break;
            
        }
        return opcion;
    }
    
    public int controlMedico(){
        int opcion = 0;
        opcion = Integer.parseInt(Input("-------------------\n"
                       + "-ESTE ES EL CONTROL MEDICO-\n"
                       + "-------------------\n"
                       + "¿Que medicina quiere conocer?\n"
                       + "1. Acetaminofén\n"
                       + "2. Aspirina\n"
                       + "3. Amoxicilina\n"
                       + "4. Ibuprofeno\n"
                       + "5. Diclofenaco\n"
                       + "6. Regresar"));
        switch(opcion){
            case 1 -> JOptionPane.showMessageDialog(null, "<html><p style =\"font-family:verdana; font: 10px; color:white \">El acetaminofén se usa para aliviar el dolor leve a dolor moderado desde dolores de cabeza, dolores musculares, "
                        + "\nperíodos menstruales,resfriados y dolores de garganta, dolor de muelas dolores de espalda, reacciones a las vacunas, "
                        + "\ny para reducir fiebre, Se debe tomar cada 8 horas.</p></html>");
            case 2 -> JOptionPane.showMessageDialog(null, "<html><p style =\"font-family:verdana; font: 10px; color:white \">La aspirina prescripta se usa para aliviar los síntomas de la artritis reumatoide (un tipo de artritis causada por "
                        + "\nla inflamación del revestimiento de las articulaciones), osteoartritis (un tipo de artritis causada por el desprendimiento "
                        + "\ndel revestimiento de las articulaciones) y fuertes dolores de cabeza, Tomar cada 4 a 5 horas.</p></html>");
            case 3 -> JOptionPane.showMessageDialog(null, "<html><p style =\"font-family:verdana; font: 10px; color:white \">La amoxicilina se usa para tratar algunas infecciones provocadas por bacterias como la neumonía; "
                        + "\nla bronquitis (infección de las vías respiratorias que van a los pulmones); e infecciones de los oídos, nariz, "
                        + "\ngarganta, del tracto urinarioy la piel, Se toma una cada 8 horas.</p></html>");
            case 4 -> JOptionPane.showMessageDialog(null, "<html><p style =\"font-family:verdana; font: 10px; color:white \">El ibuprofeno de venta con receta se usa para aliviar el dolor, la sensibilidad, la inflamación y la rigidez ocasionados "
                        + "\npor la osteoartritis (artritis debida a la degradación del revestimiento de las articulaciones) y "
                        + "\nla artritis reumatoide (artritis debida a la inflamación del revestimiento de las articulaciones), Se debe tomar una cada 6 horas.</p></html>");
            
            case 5 -> JOptionPane.showMessageDialog(null, "<html><p style =\"font-family:verdana; font: 10px; color:white \">Se usa para aliviar el dolor, la sensibilidad, la inflamación y la rigidez causada por la osteoartritis (artritis causada por "
                        + "\nun daño en el revestimiento de las articulaciones) y artritis reumatoide (artritis causada por "
                        + "\nla inflamación del revestimiento de las articulaciones), tomar 3 tabletas al día.</p></html>");
            case 6 -> opcion = 6;
                
            default -> JOptionPane.showMessageDialog(null, "<html><p style =\"font-family:verdana; font: 10px; color:white \">Opcion Invalida</p></html>");
        }
        
        return opcion;
    }
    
        int a = (int) (Math.random()*15);
        ArrayList bed = new ArrayList();
    
    public void asignarCama(){
        
        
        
        bed.add("cama 1");
        bed.add("cama 2");
        bed.add("cama 3");
        bed.add("cama 4");
        bed.add("cama 5");  
        bed.add("cama 6");
        bed.add("cama 7");
        bed.add("cama 8");
        bed.add("cama 9");
        bed.add("cama 10");
        bed.add("cama 11");
        bed.add("cama 12");
        bed.add("cama 13");
        bed.add("cama 14");
        bed.add("cama 15");
        
        
        //System.out.println("Se le a asignado: " + bed.get(a));
        JOptionPane.showMessageDialog(null, "Se le ha asignado al paciente: " + bed.get(a));
    }
    
    public void mostrarTodo(){
        try{
            FileReader fr = new FileReader("pacientesss.txt");
            BufferedReader reader = new BufferedReader(fr);
            String mostreo;
            while((mostreo = reader.readLine())!=null){
                System.out.println(""+mostreo);
            }
        }catch(Exception e){
            System.out.println("No se pudo completar la acción");
        }
            
    }
    
    public void buscarPorDPI(){
        JOptionPane.showMessageDialog(null,"Menu buscar paciente por DPI");
                //(, "<html><p style =\"font-family:verdana; font: 10px; color:white \">Menu de pacientes por su DPI</p></html>");
                        String dpi =DPI();
                        if (!pacientes.isEmpty()) {
                            for (paciente pacientes : pacientes) {
                                if (dpi.equals(pacientes.getDPI())) {
                                    pacientes.info();
                                    
                                }
                            }
                        }
                        

    }
    
        
    public String DPI() {
        System.out.println("Ingrese el No. DPI: ");
                                
        return stringscan.nextLine();
    }
}
