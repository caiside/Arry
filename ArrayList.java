/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.LinkedList;

/**
 *
 * @author Rejoice Barka
 */
public class ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<String> vecList = new LinkedList<String>();
    vecList.add("john");
     vecList.add("james");
      vecList.add("jack");
       vecList.add("jake");
        vecList.add("jim");
    System.out.println("Original content of the List: " + vecList);
    vecList.add(new String("josh"));
    System.out.println("Added content of the List: " + vecList);
        vecList.removeLast();
         System.out.println("After removing content of the list:" + vecList);         
      vecList.addFirst("saleem");
//      vecList.add(String  "joseph");
     vecList.add(3,"joseph");
        System.out.println("the specified addition is :" + vecList);
 vecList.remove(5);
        System.out.println("the specified remove is :" + vecList);
    }
  
    }
