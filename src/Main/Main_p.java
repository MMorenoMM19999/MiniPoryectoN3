
package Main;


import GUI.MENU;

//////////////////////////////////////////////////////////////////////////////////////////////
/**
 *@author Moreno Romero Miguel Angel 
 * miguel.romero@correounivalle.edu.co
 *@author Valencia Pardo Sergio 
 * sergio.pardo@correounivalle.edu.co
 *@author Valderrama Jorde Enrique
 * jorge.valderrama@correounivalle.edu.co
 */
/////////////////////////////////////////////////////////////////////////////////////////////
/*
nos encontramos nuestra clase principal "Main_p " que es la encargada de ejecutar todo nuestro codigo 
*/
public class Main_p {
    

 public static MENU c;

    public static void main(String[] args) {
    
          c = new MENU();
          c.setVisible(true);
          c.setLocationRelativeTo(null);
          c.setResizable(false);
    }
    
   
    

    
}
