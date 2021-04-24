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
        String input = "0";
        do{
        input = menu();
        switch(input)
        {
            case "1":
                String a="";
                a = JOptionPane.showInputDialog("Enter the String");
                int i = Task1.wordCounter(a);
                JOptionPane.showMessageDialog(null,"Number of Words are :"+i);
                break;
                
            case "2":
                a = JOptionPane.showInputDialog("Enter the String");
                i = Task1.vowelCounter(a);
                JOptionPane.showMessageDialog(null,"Number of Vowels are :"+i);
                break;
                
            case "3":
                a = JOptionPane.showInputDialog("Enter the String");
                i = Task1.puncCounter(a);
                JOptionPane.showMessageDialog(null,"Number of Punctuations are :"+i);
                break;
                
            case "4":
                a = JOptionPane.showInputDialog("Enter the String");
                String sub = JOptionPane.showInputDialog("Enter the Sub-String to find in this String");
                if(Task1.findSubString(a,sub)==true )
                {
                    JOptionPane.showMessageDialog(null,sub+" is part of this string.");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,sub+" is not part of this string.");
                }
                break;
                
            case "5":
                a = JOptionPane.showInputDialog("Enter the String");
                JOptionPane.showMessageDialog(null,Task2.displayVertical(a));
                
                break;
                
            case "6":
                a = JOptionPane.showInputDialog("Enter the String");
                JOptionPane.showMessageDialog(null,Task3.ridMultipleBlank(a));
                break;
                
            case "7":
                a = JOptionPane.showInputDialog("Enter the String");
                JOptionPane.showMessageDialog(null,Task3.removeInteger(a));
                break;
                
            case "8":
                a = JOptionPane.showInputDialog("Enter the String");
                if(MyString.numericValidator(a))
                {
                    JOptionPane.showMessageDialog(null,"It is Number");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"It is not a Number");
                }
                break;
                
            case "9":
                a = JOptionPane.showInputDialog("Enter the String");
                if(MyString.alphabetValidator(a))
                {
                    JOptionPane.showMessageDialog(null,"String contains only Alphabets");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"String not only contains Alphabets");
                }
                break;
                
            case "10":
                a = JOptionPane.showInputDialog("Enter the String");
                if(MyString.isPalindrome(a))
                {
                    JOptionPane.showMessageDialog(null,"It is a Palindrome");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"It is not a Palindrome");
                }
                break;
                
            case "11":
                a = JOptionPane.showInputDialog("Enter the String to convert into Lower Case");
                JOptionPane.showMessageDialog(null,MyString.toLower(a));
                break;
                
            case "12":
                a = JOptionPane.showInputDialog("Enter the String to convert into Upper Case");
                JOptionPane.showMessageDialog(null,MyString.toUpper(a));
                break;
                
            case "0":
                JOptionPane.showMessageDialog(null,"Thanks for using the Program");
                break;
                
            default:
                     JOptionPane.showMessageDialog(null,"Invalid Input");
        }
        }while(!(input.equals("0")));
    }
    
    public static String menu()
    {
        String input = JOptionPane.showInputDialog("*****||Welcome to String Manipulation ||*****\n"
                + "Chosse the following options\n"
                + "1. Count Words\n"
                + "2. Count Vowel\n"
                + "3. Count Punctuation\n"
                + "4. Find Sub-String\n"
                + "5. Display Vertical\n"
                + "6. Remove Multiple Blanks\n"
                + "7. Remove Integer\n"
                + "8. Number Validator\n"
                + "9. Alphabet Validator\n"
                + "10.Check is Palindrome?\n"
                + "11.Convert to upper Case\n"
                + "12.Convert to lower Case\n"
                + "0. Exit");
        return input;
    }
}
