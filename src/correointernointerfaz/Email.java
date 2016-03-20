/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correointernointerfaz;

/**
 *
 * @author MotherFoquita
 */
public class Email {
     String ureceptor,uenvia,titulo,contenido;
     int id;
    Email (int id,String ureceptor, String uenvia, String titulo, String contenido){
        this.id=id;
        this.ureceptor=ureceptor;
        this.uenvia=uenvia;
        this.titulo=titulo;
        this.contenido=contenido;
    }
    
}
