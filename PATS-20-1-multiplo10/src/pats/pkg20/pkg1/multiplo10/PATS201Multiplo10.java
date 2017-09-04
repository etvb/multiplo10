/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pats.pkg20.pkg1.multiplo10;

import javax.swing.JOptionPane;

/**
 *
 * @author edgardo
 */
public class PATS201Multiplo10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"))%10 ;
        /*
        if(numero == 0){
            JOptionPane.showMessageDialog(null, "Es multiplo de 10");
        }else{
            JOptionPane.showMessageDialog(null, "No es multiplo de 10");
        }
        */
        
        //Con SWITCH
        
        switch(numero){
            case 0:
                JOptionPane.showMessageDialog(null,"Es multiplo de 10");
                break;
            default:
                JOptionPane.showMessageDialog(null, "No es multiplo de 10");
        }

        
    }
    
}
