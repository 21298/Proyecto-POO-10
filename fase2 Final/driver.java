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
import java.io.IOException;


public class driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        display D = new display();
        //ArrayList<paciente> pacientes = new ArrayList();


       /* BufferedReader bf = null;
        String directorio = D.directory();
        try{
            FileReader fr = new FileReader(directorio);
            BufferedReader br = new BufferedReader(fr);
            String cadena;
                while((cadena= br.readLine())!=null){
                    System.out.println(""+cadena);
                }
       }catch (IOException e){
    }*/
       D.doctorMenu();   
 
}
}