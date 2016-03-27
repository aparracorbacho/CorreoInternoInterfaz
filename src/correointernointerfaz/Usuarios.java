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
    
    
    
    
       
        
    //Metodo para volcar usuarios de prueba 1 es admin, 0 no lo es
    public void volcarusuarios(){
        users.add(new Users("Aaron","password",1));
        users.add(new Users("Nuria","password2",0));
    }

   
}
