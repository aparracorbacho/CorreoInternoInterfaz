package correointernointerfaz;

import java.util.ArrayList;
import javax.swing.JOptionPane;

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
    
     
    
  
    public void agregar(String ureceptor, String uenvia, String titulo, String contenido){
       email.add(new Email(ureceptor,uenvia,titulo,contenido));
       
    }
       
    //Metodo para volcar correos de prueba
    public void volcarcorreos(){
        agregar("Aaron","Nuria","Proyecto correo 1","Correo enviado de Nuria para Aaron. Primer correo del proyecto");
        agregar("Aaron","Nuria","Proyecto correo 2","Correo enviado de Nuria para Aaron. Segundo correo del proyecto");
        agregar("Nuria","Aaron","Proyecto correo 3","Correo enviado de Aaron para Nuria. Tercer correo del proyecto");
        agregar("Nuria","Aaron","Proyecto correo 4","Correo enviado de Aaron para Nuria. Cuarto correo del proyecto");
        agregar("Nuria","Aaron","Proyecto correo 5","Correo enviado de Aaron para Nuria. Quinto correo del proyecto");
        
    }
    
}
