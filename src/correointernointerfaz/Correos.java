package correointernointerfaz;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MotherFoquita
 */
public class Correos {
    public ArrayList<Email> email = new ArrayList<>();
    Utils util = new Utils();
    
     
    
    //Se listan los correos para el usuario
    public void ver (String nuser){
        int contador = 1;
        for (int i=0;i<email.size();i++){
            if (nuser.equals(email.get(i).ureceptor)){
                util.imprime(contador + " - " +email.get(i).titulo);
                contador++;
            } 
            
        }
    }
    
    //Enviamos un correo
    // public void agregar(String ureceptor, String uenvia, String titulo, String contenido){
    //   email.add(new Email(ureceptor,uenvia,titulo,contenido));
    //   util.imprime("Correo enviado!");
    //}
    
    
    //Listamos los correos del usuario y los numeramos de forma que use esos numeros para borrarlos
    public void borrar(String nuser){
        int contador = 1;
        for (int i=0;i<email.size();i++){
            if (nuser.equals(email.get(i).ureceptor)){
                util.imprime(contador + " - " +email.get(i).titulo);
                contador++;
            } 
            
        }
        util.imprime("Que numero de correo quieres borrar?");
        int pregunta = util.qint();
        contador = 1;
        for (int i=0;i<email.size();i++){
            if (nuser.equals(email.get(i).ureceptor)){
                if (pregunta == contador) { email.remove(i); util.imprime("Correo borrado!");}
                contador++;
            } 
            
        }
    }
    
    //Borramos los correos de un usuario
    public void borrarcorreos(String uborrar){
         for (int i=0;i<email.size();i++){
            if (uborrar.equals(email.get(i).ureceptor)){
                email.remove(i); 
           
            } 
            
        }
         util.imprime("Todos los correos de la bandeja de este usuario estan borrados");
    }
    
    
    
    //Metodo para volcar correos de prueba
    public void volcarcorreos(){
        email.add(new Email(1,"Aaron","Nuria","Proyecto correo 1","Correo enviado de Nuria para Aaron. Primer correo del proyecto"));
        email.add(new Email(2,"Aaron","Nuria","Proyecto correo 2","Correo enviado de Nuria para Aaron. Segundo correo del proyecto"));
        email.add(new Email(3,"Nuria","Aaron","Proyecto correo 3","Correo enviado de Aaron para Nuria. Tercer correo del proyecto"));
        email.add(new Email(4,"Nuria","Aaron","Proyecto correo 4","Correo enviado de Aaron para Nuria. Cuarto correo del proyecto"));
        email.add(new Email(5,"Nuria","Aaron","Proyecto correo 5","Correo enviado de Aaron para Nuria. Quinto correo del proyecto"));
    }
    
}
