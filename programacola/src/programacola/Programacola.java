/*
 *programa que realiza el ingreso de un dato a la cola la eliminacion de un dato de la cola busqueda 
 */
package programacola;

import javax.swing.JOptionPane;

/**
 *
 * @author Karen
 */
public class Programacola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc;
        String opcion;
        Cola c = new Cola();
        do
        {
        opcion=JOptionPane.showInputDialog(null," \n MENU \n 1. ingrese dato a la cola \n 2. Mostrar Cola \n 3. buscar nodo  \n 4. Eliminar un nodo de la Cola \n 5. Mostrar si esta vacia o no \n 6. Tamaño de la cola  \n 0. salir ");
        opc=Integer.parseInt(opcion);
        
        switch(opc)
        {
            case 1:
             c.insertarNodo();
             JOptionPane.showMessageDialog(null," \n Cola Ingresada");
            break;   
            
            case 2:
                 c.mostrarcola();
            break; 
            
            case 3:
                c.buscarNodo();
            break;  
            
            case 4:
                
                c.eliminarnodo();
            break; 
            
             case 5:
                
                c.estaVacia();
            break; 
            
            case 6:
                
                c.cuantos();
            break; 
            
                
        }
        }while(opc!=0);
        
          
       

    }
    
}
