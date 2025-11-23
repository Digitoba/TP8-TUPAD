
package tp_Parte2;

import java.io.File;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        
        //división segura
        
        Scanner input = new Scanner(System.in);
        Division div = new Division();
        StrAInt conversor = new StrAInt();
        File archivo = new File("archivo.txt");
        Lector lector = new Lector();
        ValidacionEdad validarEdad = new ValidacionEdad();
        LecturaResources lectorR = new LecturaResources();
        
        
        //1.
        //System.out.println("Ingrese el primer número: ");
        //int x = Integer.parseInt(input.nextLine());
        
        //System.out.println("Ingrese el segundo número: ");
        //int y = Integer.parseInt(input.nextLine());
       
        //System.out.println(div.division(x, y));
        
        //2.
        //System.out.println("Ingrese un número para ser convertido a entero.");
        //String a = input.nextLine();
        
        //System.out.println(conversor.palabraANumero(a));
        
        //3.
        //lector.leer(archivo);
        
        //4.
//        System.out.println("Ingrese una edad válida entre 1 y 119.");
//        int edad = Integer.parseInt(input.nextLine());
//        try {
//            validarEdad.validarEdad(edad);
//        } catch (EdadInvalidaException eie) {
//            System.out.println("No es una edad válida. Debe ser mayor a 0 y menor a 120.");
//            eie.printStackTrace();
//        }
        

        //5.
       //lectorR.leerArchivo("miArchivo.txt");
        
        
    }
    
}
