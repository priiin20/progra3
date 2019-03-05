/*
Karen Roxana Roldan Hernandez
0901-17-63
este programa permite el ingreso de nombres y notas desplegando el total de grupo variante B
 */
package solucion_parcial;


import static java.time.Clock.system;
import javax.swing.JOptionPane;
import java.util.*;


public class Solucion_parcial {

    public static void main(String[] args) 
    {
        
        String  strnota, stropcion1;
        int intmatriz[][]= new int [3][10];
        String strnombre[][]=new String [3][10];
        String gano[]= new String [3];
        int promedio=0;
        int  intopcion1;
        
        stropcion1=JOptionPane.showInputDialog(" que desea realizar: \n 1) Ingreso de nombres y nota");
        intopcion1=Integer.parseInt(stropcion1);
        switch(intopcion1)
        {
            case 1:
               
                Scanner dato=new Scanner (System.in);
  
                    for(int columna=0; columna<=9; columna++)
                    {
                      strnombre[0][columna]=JOptionPane.showInputDialog("Ingrese nombre "+columna);
                  
                    }
                    
                    for(int fila=1; fila<=1; fila++)
                    {
                        for(int columna1=0; columna1<=9; columna1++)
                        {
                          strnota=JOptionPane.showInputDialog("Ingrese nota de alumno  "+columna1);
                          intmatriz[1][columna1]=Integer.parseInt(strnota);
                          promedio +=intmatriz[1][columna1];
                           
                          
                        }
                        
                    }
                    promedio = promedio/10;
                 
                    
                  
                        
                        
                    
                  
                    
                                 
                    for(int columna2=0 ; columna2<=9; columna2++)
                {
                    System.out.println( "Alumno  " +columna2+ "   "+strnombre[0][columna2]+   "  nota:    "+intmatriz[1][columna2]);
                   
                }   
                
                   System.out.println(" el promedio de la clase es de "+ promedio);
            break;       
 
        }
        
      
    }
    
}
