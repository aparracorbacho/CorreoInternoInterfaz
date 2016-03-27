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
       
 
}
