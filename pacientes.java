/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class pacientes {
    private String nombre,edad,dpi,sangre,diagnostico,personaE,telefonoE;

    
    pacientes(String[] paciente){
        nombre = paciente[0].toUpperCase();
        edad = paciente[1];
        dpi = paciente[2];
        sangre = paciente[3].toUpperCase();
        diagnostico = paciente[4].toUpperCase();
        personaE = paciente[5].toUpperCase();
        telefonoE = paciente[6];
    }
    
    public String[] getPaciente(){
        String[] paciente = new String[7];
        paciente[0] = nombre;
        paciente[1] = edad ;
        paciente[2] = dpi ;
        paciente[3] = sangre;
        paciente[4] = diagnostico;
        paciente[5] = personaE ;
        paciente[6] = telefonoE;
        return paciente;
    }
}
