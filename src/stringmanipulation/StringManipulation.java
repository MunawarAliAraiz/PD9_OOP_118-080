/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmanipulation;

import javax.swing.JOptionPane;

/**
 *
 * @author Munawar Ali
 */
public class StringManipulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String a = JOptionPane.showInputDialog("Enter the String");
        String b = Task3.ridMultipleBlank(a);
        JOptionPane.showMessageDialog(null,b);
        int i = Task1.wordCounter(a);
        JOptionPane.showMessageDialog(null,"Number of Words are :"+i);
        i = Task1.vowelCounter(a);
        JOptionPane.showMessageDialog(null,"Number of Vowels are :"+i);
        i = Task1.puncCounter(a);
        JOptionPane.showMessageDialog(null,"Number of Punctuations are :"+i);
    }
    
}
