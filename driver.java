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
*Clase: driver para controlar el programa
*/

import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

public class driver {
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        
        UIManager UI = new UIManager();
        UI.put("OptionPane.background", new ColorUIResoruce(200, 200, 200));
        UI.put("Panel.background", new ColorUIResource(125, 125, 125));
        display d = new display();
        //d.directory();
        d.menuRol();

}

    private static class ColorUIResoruce {

        public ColorUIResoruce(int i, int i0, int i1) {
        }
    }
}
/*
                byte opcion;
    
    do{
       opcion = Byte.parseByte(JOptionPane.showInputDialog(
               "Menu Principal\n"
               +"1. Agregar paciente\n"
               +"2. Mostar pacientes\n"
               +"3. Vaciar Lista de pacientes\n"
               +"4. Exit"));
       
       switch(opcion){
          case 1:
              d.addPaciente();
             break;
          case 2:
             d.getPacientes();
             break; 
             
          case 3:
             d.clearlistPaciente();
             break;
          case 4:
             JOptionPane.showMessageDialog(null, "good bye");
             break;
             
          default:
             JOptionPane.showMessageDialog(null, "not found");
             break;
             
       }
       
       
    }while(opcion!=4);

    }
*/

        





   
