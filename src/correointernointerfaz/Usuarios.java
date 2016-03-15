/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correointernointerfaz;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author MotherFoquita
 */
public class Usuarios {
     ArrayList<Users> users = new ArrayList<>();
    Utils util = new Utils();
    
    //Comprobamos si el usuario existe y si ha introducido los credenciales correctos
    public int comprueba(String nuser, String npass){
      int pasa = 0;
      for (int i=0;i<users.size();i++){
          if (nuser.equals(users.get(i).nombre)) {
              util.imprime("Usuario correcto");
              if (npass.equals(users.get(i).password)){
                  util.imprime("Password correcto\nBienvenid@ al correo interno de la empresa");
                  pasa = 1;
                } 
          } 
      }
     return pasa;
    }
    
    public int compruebaform(String nombre, String password){
        int pasa = 0;
        for (int i=0;i<users.size();i++){
          if (nombre.equals(users.get(i).nombre)) {
              if (password.equals(users.get(i).password)){
                  pasa = 1;
              }
          } 
      }
        return pasa;
    }
    
    
    //Comprobamos si el usuario al que le vamos a enviar el correo existe
    public int cuserenv(String ureceptor){
        int valor = 0;
         for (int i=0;i<users.size();i++){
          if (ureceptor.equals(users.get(i).nombre)) {
             valor = 1; 
          }
        }
         return valor;
    }
    
    //Comprobamos si el usuario que quiere acceder tiene permisos
    public int compruebaAdmin(String nuser){
        int admin = 0;
        for (int i=0;i<users.size();i++){
          if (nuser.equals(users.get(i).nombre)) {
              admin = users.get(i).permisos;
          } 
      }
        return admin;
    }
    
    //Agregamos un usuario
    public void agregar(){
        int correcto = 0;
        String nombre, password;
        int permisos;
        do {
        util.imprime("Introduce el nombre del usuario que quieres agregar");
        nombre = util.qstring();
        util.imprime("Introduce la contraseña del usuario");
        password = util.qstring();
        util.imprime("Quieres que sea administrador? Si (1) , No (2)");
        permisos = util.qint();
        if (permisos > 1 || permisos <0) { correcto = 0; util.imprime("No es un valor correcto para los permisos. Vuelve a probar"); } else { correcto = 1; }
        } while (correcto == 1);
        users.add(new Users(nombre, password, permisos));
        util.imprime("Usuario agregado con exito");
        
    }
    
    //Borramos un usuario
    public String borrar(){
        String nuser = null;
        int contador = 1;
        for (int i=0;i<users.size();i++){
            util.imprime(contador + " - " +users.get(i).nombre);
                contador++;     
        }
        util.imprime("Que numero de usuario quieres borrar?");
        int pregunta = util.qint();
        contador = 1;
        for (int i=0;i<users.size();i++){
                if (pregunta == contador) { nuser = users.get(i).nombre; users.remove(i); util.imprime("Usuario borrado!");}
                contador++;
            } 
        return nuser;
        }
    
    //Vemos la lista de usuarios y si son o no administradores
    public void verlista(){
        for (int i=0;i<users.size();i++){
            String permisos = null;
            if (users.get(i).permisos == 1) { permisos = "Administrador"; } else { permisos = "Usuario"; }
            util.imprime(users.get(i).nombre + " " +permisos);
        }
    }
    
    //Metodo para volcar usuarios de prueba
    public void volcarusuarios(){
        users.add(new Users("Aaron","password",1));
        users.add(new Users("Nuria","password2",0));
    }

   
}
