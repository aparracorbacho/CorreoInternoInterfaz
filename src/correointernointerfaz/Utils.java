/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correointernointerfaz;

import java.util.Scanner;

/**
 *
 * @author MotherFoquita
 */
public class Utils {
    
      public void imprime(String texto){
        System.out.println(texto);
    }
 
    public String qstring(){
         Scanner respuestaTeclado = new Scanner(System.in);
         String respuesta = respuestaTeclado.nextLine();
         return respuesta;
    }
     
    public int qint(){
         Scanner respuestaTeclado = new Scanner(System.in);
         int respuesta = respuestaTeclado.nextInt();
         return respuesta;
    }
    
    //Menu de texto
    public void menu(String nuser){
        imprime("==============================================\nHola "+nuser +", elige que quieres hacer\n  Ver tus correos (Opcion 1)\n  Borrar un correo (Opcion 2)\n  Enviar un correo (Opcion 3)\n  Gestion de usuarios, solo si eres administrador puedes hacerlo (Opcion 4)\n  Salir del programa(Opcion 0)\nElige la opcion que quieres\n==============================================");
    }
     
    //Preguntamos al usuario si quiere volver al menu despues de hacer alguna accion o quiere salir del programa
    public int smenu(){
        int salir = 0;
              do {
              imprime("Quieres ir al menu (Opcion 1) o quieres salir del programa (Opcion 0)");
              salir = qint();
              } while (salir > 1 || salir <0);
        return salir;
    }
    
}
