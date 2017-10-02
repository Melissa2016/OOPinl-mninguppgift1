/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package husdjurhotel;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author NN
 */
public class Husdjurhotel {

//}
    public static void main(String[] args) {

        Djur h1 = new Hund("Sixten", 5);
        Djur h2 = new Hund("dogge", 10);
        Djur k1 = new Katt("venus", 5);
        Djur k2 = new Katt("ove", 3);
        Djur o = new Orm("hypo", 1);
        viktportionsort  i1 = new Hund("sixten", 5);
        viktportionsort i2 = new Hund("dogge", 10);
        viktportionsort i3 = new Katt("venus", 5);
       viktportionsort  i4= new Katt("ove", 3);
        viktportionsort i5 = new Orm("hypo", 1);

        sort s1 = new Hund("sixten", 5);
        sort s2 = new Hund("dogge", 10);
        sort s3 = new Katt("venus", 5);
        sort s4 = new Katt("ove", 3);
        sort s5 = new Orm("hypo", 1);
        /*i1.viktportion(5);
        i2.viktportion(10);
        i3.viktportion(5);
        i4.viktportion(3);
        i5.viktportion(1);

        s1.sortmat();
        s2.sortmat();
        s3.sortmat();
        s4.sortmat();
        s5.sortmat();*/
String s =JOptionPane.showInputDialog(null, "Vilken djur ska få mat  ");
switch(s){
    case "sixten":
        JOptionPane.showMessageDialog(null,"sixten måste äta: "+ i1.viktportion(5)+ " gram " +s1.sortmat());
        System.exit(0);
    case "dogge":
      JOptionPane.showMessageDialog(null, "dogge måste äta: " + i2.viktportion(10)+ " gram " +s2.sortmat());
        System.exit(0);
      case "venus":
      JOptionPane.showMessageDialog(null,"venus måste äta: "+ i3.viktportion(5)+ " gram " +s3.sortmat());
        System.exit(0);
      case "ove":
      JOptionPane.showMessageDialog(null,"ove måste äta: "+ i4.viktportion(3)+ " gram " +s4.sortmat());
        System.exit(0);
      case "hypo":
            
      JOptionPane.showMessageDialog(null,"hypo måste äta: "+ i5.viktportion(1)+ " gram " +s5.sortmat());
      
      
      
}


    
}}
