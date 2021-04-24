/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmanipulation;

/**
 *
 * @author Munawar Ali
 */
public class Task3 {
    
    public static String removeInteger(String s)
    {
        s = ridMultipleBlank(s);
        String a = "";
        for(int i=0; i<s.length(); i++)
        {
            if(!(s.charAt(i) >= '0' && s.charAt(i) <= '9'))
            {
                a += s.charAt(i);
            }
        }
        return a;
    }
    
    public static String ridMultipleBlank(String s)
    {
        String a = "";
        int startIndex = 0;
        int endIndex = s.length();
        for(int i=0; i<s.length();i++)
        {
            if(s.charAt(i) != ' ')
            {
                startIndex = i;
                break;
            }
        }
        for(int i=s.length()-1; i>=0;i--)
        {
            if(s.charAt(i) != ' ')
            {
                endIndex = i;
                break;
            }
        }
        for(int i=startIndex; i<endIndex; i++)
        {
            int spaceIndex = 0;
            if(s.charAt(i) == ' ')
            {
                spaceIndex = i;
                for(int j=startIndex; j<spaceIndex; j++)
                {
                    a += s.charAt(j);
                }
                for(int j=spaceIndex; j<=endIndex; j++)
                {
                    if(s.charAt(j) != ' ')
                    {
                        i = j;
                        startIndex = j;
                        break;
                    }
                }
                a += ' ';
            }
        }
        for(int i=startIndex; i<=endIndex; i++)
        {
            a += s.charAt(i);
        }
        return a;
    }
    
}
