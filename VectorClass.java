/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.LinkedList;
import java.util.Vector;

/**
 *
 * @author Rejoice Barka
 */
public class VectorClass {
    public static void main(String[] args) {
        Vector<Object> vecObj = new Vector<Object>();
        vecObj.addElement (new Integer(5));
        vecObj.addElement (new Integer(7));
        vecObj.addElement (new Integer(45));
        vecObj.addElement (new Float(9.95));
        vecObj.addElement (new Float(6.085));
        System.out.println("The value is: " 
                +(Object) vecObj.elementAt(3));
        
    }
}
